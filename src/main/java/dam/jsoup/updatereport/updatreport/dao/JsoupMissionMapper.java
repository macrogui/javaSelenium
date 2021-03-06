package dam.jsoup.updatereport.updatreport.dao;

import dam.jsoup.updatereport.updatreport.pojo.JsoupMission;
import dam.jsoup.updatereport.updatreport.pojo.JsoupMissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author dam
 * @version 1.0
 * @date 2020/12/22 18:53
 */
@Mapper
@Repository
public interface JsoupMissionMapper {
    long countByExample(JsoupMissionExample example);

    int deleteByExample(JsoupMissionExample example);

    /**
     * delete by primary key
     *
     * @param missionId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer missionId);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(JsoupMission record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(JsoupMission record);

    List<JsoupMission> selectByExample(JsoupMissionExample example);

    /**
     * select by primary key
     *
     * @param missionId primary key
     * @return object by primary key
     */
    JsoupMission selectByPrimaryKey(Integer missionId);

    int updateByExampleSelective(@Param("record") JsoupMission record, @Param("example") JsoupMissionExample example);

    int updateByExample(@Param("record") JsoupMission record, @Param("example") JsoupMissionExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(JsoupMission record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(JsoupMission record);
}