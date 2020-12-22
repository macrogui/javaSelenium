package dam.jsoup.updatereport.updatreport.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author  dam
 * @date  2020/12/22 18:36
 * @version 1.0
 */
@ApiModel(value="dam-jsoup-updatereport-updatreport-pojo-Setting")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Setting implements Serializable {
    @ApiModelProperty(value="")
    private Integer settingId;

    @ApiModelProperty(value="")
    private String settingValue;

    private static final long serialVersionUID = 1L;
}