package dam.jsoup.updatereport.updatreport.dao;

import dam.jsoup.updatereport.updatreport.pojo.JsoupActionHis;
import dam.jsoup.updatereport.updatreport.pojo.JsoupActionHisExample;
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
public interface JsoupActionHisMapper {
    long countByExample(JsoupActionHisExample example);

    int deleteByExample(JsoupActionHisExample example);

    /**
     * delete by primary key
     * @param actionHisId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer actionHisId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(JsoupActionHis record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(JsoupActionHis record);

    List<JsoupActionHis> selectByExample(JsoupActionHisExample example);

    /**
     * select by primary key
     * @param actionHisId primary key
     * @return object by primary key
     */
    JsoupActionHis selectByPrimaryKey(Integer actionHisId);

    int updateByExampleSelective(@Param("record") JsoupActionHis record, @Param("example") JsoupActionHisExample example);

    int updateByExample(@Param("record") JsoupActionHis record, @Param("example") JsoupActionHisExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(JsoupActionHis record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(JsoupActionHis record);
}