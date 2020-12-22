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
 * @date 2020/12/22 18:58
 */
@ApiModel(value = "dam-jsoup-updatereport-updatreport-pojo-JsoupAction")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsoupAction implements Serializable {
    @ApiModelProperty(value = "")
    private Integer actionId;

    @ApiModelProperty(value = "")
    private Integer actionElePragramId;

    @ApiModelProperty(value = "")
    private String actionEleType;

    @ApiModelProperty(value = "")
    private String actionDoType;

    @ApiModelProperty(value = "")
    private String actionUrl;

    @ApiModelProperty(value = "")
    private Integer missionId;

    @ApiModelProperty(value = "")
    private Integer actionPreId;

    @ApiModelProperty(value = "")
    private Integer actionAfterId;

    @ApiModelProperty(value = "")
    private String actionName;

    @ApiModelProperty(value = "")
    private String actionEleValue;

    private static final long serialVersionUID = 1L;
}