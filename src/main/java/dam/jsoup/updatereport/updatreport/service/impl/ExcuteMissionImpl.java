package dam.jsoup.updatereport.updatreport.service.impl;

import dam.jsoup.updatereport.updatreport.dao.*;
import dam.jsoup.updatereport.updatreport.pojo.*;
import dam.jsoup.updatereport.updatreport.service.ExcuteMission;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dam
 * @version 1.0
 * @date 2020/12/22 18:31
 */
@Service
@Slf4j
public class ExcuteMissionImpl implements ExcuteMission {
    private final JsoupActionHisMapper jsoupActionHisMapper;
    private final JsoupMissionHistoryMapper jsoupMissionHistoryMapper;
    private final JsoupPragramMapper jsoupPragramMapper;
    private final JsoupMissionMapper jsoupMissionMapper;
    private final JsoupActionMapper jsoupActionMapper;
    private final SettingMapper settingMapper;

    public ExcuteMissionImpl(JsoupActionHisMapper jsoupActionHisMapper, JsoupMissionHistoryMapper jsoupMissionHistoryMapper, JsoupPragramMapper jsoupPragramMapper, JsoupMissionMapper jsoupMissionMapper, JsoupActionMapper jsoupActionMapper, SettingMapper settingMapper) {
        this.jsoupActionHisMapper = jsoupActionHisMapper;
        this.jsoupMissionHistoryMapper = jsoupMissionHistoryMapper;
        this.jsoupPragramMapper = jsoupPragramMapper;
        this.jsoupMissionMapper = jsoupMissionMapper;
        this.jsoupActionMapper = jsoupActionMapper;
        this.settingMapper = settingMapper;
    }

    @Override
    public Map<String,String> startMission(int missionId) {
        Map<String,String> map = new HashMap<>();
       JsoupMission jsoupMission = jsoupMissionMapper.selectByPrimaryKey(missionId);
       log.info("爬虫任务执行---开始----- 入参查询完毕,mission=[{}]",jsoupMission);
       if (jsoupMission.getMissionId() == null || jsoupMission.getMissionId()==0){
           map.put("title","error");
           map.put("msg","行动的action无法查询到");
           log.error("爬虫任务错误---错误为--   " + "行动的action无法查询到");
           return map;
       }
        Setting setting = settingMapper.selectByPrimaryKey(1);
        System.setProperty("webdriver.chrome.driver", setting.getSettingValue());
        //创建Chrome driver的实例
        WebDriver driver = new ChromeDriver();
        // 最大化浏览器
        driver.manage().window().maximize();
        driver.navigate().to (jsoupMission.getMissionStartUrl());
        Integer pointId = jsoupMission.getStartActionId();
        StringBuilder buffer = new StringBuilder();
       while (true){
           try {
               Thread.sleep(2000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           JsoupAction jsoupAction = jsoupActionMapper.selectByPrimaryKey(pointId);
           if (jsoupAction == null){
               break;
           }else {
               try {
                   buffer.append(exAction(jsoupAction,driver,missionId));
               } catch (Exception e) {
                  buffer.append(e);
               }
           }
           if (jsoupAction.getActionAfterId() == null || jsoupAction.getActionAfterId() ==0){
               pointId = jsoupAction.getActionAfterId();
           }else {
               break;
           }
       }
       map.put("msg",buffer.toString());
       JsoupMissionHistory jsoupMissionHistory = new JsoupMissionHistory();
       jsoupMissionHistory.setContent((String) map.get("msg"));
       jsoupMissionHistory.setMissionId(missionId);
       jsoupMissionHistory.setMissionTime(new Date());
       jsoupMissionHistoryMapper.insertSelective(jsoupMissionHistory);
       map.put("title",jsoupMission.getMissionName());
       log.info("爬虫任务执行完毕---");
       return map;
    }

    private String exAction(JsoupAction action,WebDriver driver,int missionId){
        String type =action.getActionEleType();
        WebElement ele;
        switch (type){
           case "id": {
                ele = driver.findElement(By.id(action.getActionEleValue()));
               break;
           }
           case "name":{
                ele = driver.findElement(By.name(action.getActionEleValue()));
               break;
           }
           case "tagName":{
                ele = driver.findElement(By.tagName(action.getActionEleValue()));
            break;
           }
           case "className":{
                ele = driver.findElement(By.className(action.getActionEleValue()));
               break;
           }
           default:{
               ele = driver.findElement(By.xpath(action.getActionEleValue()));
               break;
           }
       }
         if (action.getActionElePragramId() != null && action.getActionElePragramId() != 0){
             JsoupPragramExample example =new JsoupPragramExample();
             JsoupPragramExample.Criteria criteria = example.createCriteria();
             criteria.andMissionIdEqualTo(missionId);
             //此处明日修改 应该添加 actionId 于 pragram中

             List<JsoupPragram> list = jsoupPragramMapper.selectByExample(example);
             ele.sendKeys(list.get(0).getPragramValue());
         }
         String doType = action.getActionDoType();
         switch (doType){
             case "submit":{
                 ele.submit();
                 break;
             }
             case "clear": {
                 ele.clear();
                 break;
             }
             default:{
                ele.click();
                break;
             }
         }
         JsoupActionHis jsoupActionHis = new JsoupActionHis();
         jsoupActionHis.setActionHisDate(new Date());
         jsoupActionHis.setActionHisEleValue(ele.getText());
         jsoupActionHis.setActionHisActionId(action.getActionId());
         jsoupActionHis.setActionHisMissionId(missionId);
         jsoupActionHisMapper.insertSelective(jsoupActionHis);

         return "操作：   " + action.getActionName() + "     于   " + jsoupActionHis.getActionHisDate() + "   执行成功    ";
    }


}
