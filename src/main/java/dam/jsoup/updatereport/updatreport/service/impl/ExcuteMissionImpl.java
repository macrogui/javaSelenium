package dam.jsoup.updatereport.updatreport.service.impl;

import dam.jsoup.updatereport.updatreport.dao.*;
import dam.jsoup.updatereport.updatreport.pojo.JsoupAction;
import dam.jsoup.updatereport.updatreport.pojo.JsoupMission;
import dam.jsoup.updatereport.updatreport.pojo.Setting;
import dam.jsoup.updatereport.updatreport.service.ExcuteMission;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dam
 * @version 1.0
 * @date 2020/12/22 18:31
 */
@Service
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
    public Map startMission(int missionId) {

        Map<String,Object> map = new HashMap<>();
       JsoupMission jsoupMission = jsoupMissionMapper.selectByPrimaryKey(missionId);
       if (jsoupMission.getMissionId() == null || jsoupMission.getMissionId()==0){
           map.put("code","error");
           map.put("msg","行动的action无法查询到");
           return map;
       }
        Setting setting = settingMapper.selectByPrimaryKey(1);
        System.setProperty("webdriver.chrome.driver", setting.getSettingValue());
        //创建Chrome driver的实例
        WebDriver driver = new ChromeDriver();
        // 最大化浏览器
        driver.manage().window().maximize();
        driver.navigate().to ("https://hsm.sspu.edu.cn/selfreport/Default.aspx");
       while (true){
           JsoupAction jsoupAction = jsoupActionMapper.selectByPrimaryKey(jsoupMission.getStartActionId());
           if (jsoupAction == null || jsoupAction.getActionAfterId() == null || jsoupAction.getActionAfterId() == 0){
               break;
           }

       }
    }

    private String exAction(JsoupAction action,WebDriver driver){
        String type =action.getActionEleType();

       switch (type){
           case "xpath":{
               WebElement ele = driver.findElement(By.xpath(action.getActionEleValue()));
             break;
           }
           case "id": {
               WebElement ele = driver.findElement(By.id(action.getActionEleValue()));
               break;
           }
           case "name":{
               WebElement ele = driver.findElement(By.name(action.getActionEleValue()));
               break;
           }
           case "tagName":{
               WebElement ele = driver.findElement(By.tagName(action.getActionEleValue()));
            break;
           }
           case "className":{
               WebElement ele = driver.findElement(By.className(action.getActionEleValue()));
               break;
           }
           default:{
               break;
           }
       }
    }


}
