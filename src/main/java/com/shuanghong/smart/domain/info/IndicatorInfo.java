package com.shuanghong.smart.domain.info;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 指标信息
 * @Description
 * @Author
 * @Date 2020-07-07 19:33
 */
@Data
public class IndicatorInfo {

    @ApiModelProperty(value ="预设值begin")
    private Float startTarget;

    @ApiModelProperty(value ="预设值end")
    private Float endTarget;

    @ApiModelProperty(value ="当前值")
    private Float value;

    @ApiModelProperty(value ="状态（0：正常，其他异常）")
    private Integer status;

    @ApiModelProperty(value ="开关（0：关，1：开）")
    private Integer enable;

}
