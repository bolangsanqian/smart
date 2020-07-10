package com.shuanghong.smart.domain.info;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description
 * @Author
 * @Date 2020-07-07 19:33
 */
@Data
public class OutDoorInfo {

    @ApiModelProperty(value ="温度")
    private Float temperature;

    @ApiModelProperty(value ="湿度")
    private Float humidity;

}
