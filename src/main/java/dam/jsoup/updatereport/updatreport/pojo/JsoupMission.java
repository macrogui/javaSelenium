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
 * @date 2020/12/22 18:53
 */
@ApiModel(value = "dam-jsoup-updatereport-updatreport-pojo-JsoupMission")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsoupMission implements Serializable {
    @ApiModelProperty(value = "")
    private Integer missionId;

    @ApiModelProperty(value = "")
    private String missionName;

    @ApiModelProperty(value = "")
    private Integer startActionId;

    @ApiModelProperty(value = "")
    private String noticeEmail;

    @ApiModelProperty(value = "")
    private String endTagContains;

    @ApiModelProperty(value = "")
    private String missionStartUrl;

    private static final long serialVersionUID = 1L;
}