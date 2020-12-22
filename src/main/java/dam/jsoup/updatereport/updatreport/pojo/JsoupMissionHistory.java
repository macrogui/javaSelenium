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
@ApiModel(value="dam-jsoup-updatereport-updatreport-pojo-JsoupMissionHistory")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsoupMissionHistory implements Serializable {
    @ApiModelProperty(value="")
    private Integer missionStateId;

    @ApiModelProperty(value="")
    private Integer missionId;

    @ApiModelProperty(value="")
    private Date missionTime;

    @ApiModelProperty(value="")
    private String content;

    private static final long serialVersionUID = 1L;
}