package com.shuanghong.smart.domain.info;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class DataSyncInfo {

    @NotBlank(message = "序列号不容许为空")
    @ApiModelProperty(value ="序列号")
    private String sn;

    @NotBlank(message = "名称不容许为空")
    @ApiModelProperty(value ="名称")
    private String name;

    @NotBlank(message = "状态不容许为空")
    @ApiModelProperty(value ="状态")
    private String status;

    @ApiModelProperty(value ="室外信息")
    private OutDoorInfo outdoor;

    @ApiModelProperty(value ="温度信息")
    private TemperatureInfo temperature;

    @ApiModelProperty(value ="湿度信息")
    private HumidityInfo humidity;

    @ApiModelProperty(value ="光照信息")
    private IlluminationInfo illumination;

    @ApiModelProperty(value ="C02信息")
    private Co2Info co2;

    @ApiModelProperty(value ="同步时间，时间戳（秒）")
    private Integer syncTime;

}
