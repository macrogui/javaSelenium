package dam.jsoup.updatereport.updatreport.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author  dam
 * @date  2020/12/22 18:25
 * @version 1.0
 */
@ApiModel(value="dam-jsoup-updatereport-updatreport-pojo-JsoupActionHis")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsoupActionHis implements Serializable {
    @ApiModelProperty(value="")
    private Integer actionHisId;

    @ApiModelProperty(value="")
    private String actionHisEleValue;

    @ApiModelProperty(value="")
    private Date actionHisDate;

    @ApiModelProperty(value="")
    private Integer actionHisMissionId;

    @ApiModelProperty(value="")
    private Integer actionHisActionId;

    private static final long serialVersionUID = 1L;
}