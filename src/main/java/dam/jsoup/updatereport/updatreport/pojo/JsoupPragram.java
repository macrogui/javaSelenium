package dam.jsoup.updatereport.updatreport.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dam
 * @version 1.0
 * @date 2020/12/23 10:24
 */
@ApiModel(value = "dam-jsoup-updatereport-updatreport-pojo-JsoupPragram")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsoupPragram implements Serializable {
    @ApiModelProperty(value = "")
    private Integer pragramId;

    @ApiModelProperty(value = "")
    private String pragramValue;

    @ApiModelProperty(value = "")
    private Integer missionId;

    @ApiModelProperty(value = "")
    private Integer actionId;

    private static final long serialVersionUID = 1L;
}