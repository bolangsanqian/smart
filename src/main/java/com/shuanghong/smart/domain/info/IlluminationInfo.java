package com.shuanghong.smart.domain.info;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 光照对象
 * @Description
 * @Author
 * @Date 2020-07-07 19:33
 */
@Data
public class IlluminationInfo {
    @ApiModelProperty(value ="预设值")
    private Float startTarget;

    @ApiModelProperty(value ="预设值")
    private Float endTarget;

    @ApiModelProperty(required = true, value ="当前值")
    private Float value;

    @ApiModelProperty(required = true, value ="状态（0：正常，其他异常）")
    private Integer status;

    @ApiModelProperty(required = true, value ="光照强度")
    private Float intensity;
}
