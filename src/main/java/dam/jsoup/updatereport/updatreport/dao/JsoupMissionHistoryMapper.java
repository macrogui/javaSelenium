package dam.jsoup.updatereport.updatreport.dao;

import dam.jsoup.updatereport.updatreport.pojo.JsoupMissionHistory;
import dam.jsoup.updatereport.updatreport.pojo.JsoupMissionHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author  dam
 * @date  2020/12/22 18:25
 * @version 1.0
 */
@Mapper
@Repository
public interface JsoupMissionHistoryMapper {
    long countByExample(JsoupMissionHistoryExample example);

    int deleteByExample(JsoupMissionHistoryExample example);

    /**
     * delete by primary key
     * @param missionStateId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer missionStateId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(JsoupMissionHistory record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(JsoupMissionHistory record);

    List<JsoupMissionHistory> selectByExample(JsoupMissionHistoryExample example);

    /**
     * select by primary key
     * @param missionStateId primary key
     * @return object by primary key
     */
    JsoupMissionHistory selectByPrimaryKey(Integer missionStateId);

    int updateByExampleSelective(@Param("record") JsoupMissionHistory record, @Param("example") JsoupMissionHistoryExample example);

    int updateByExample(@Param("record") JsoupMissionHistory record, @Param("example") JsoupMissionHistoryExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(JsoupMissionHistory record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(JsoupMissionHistory record);
}