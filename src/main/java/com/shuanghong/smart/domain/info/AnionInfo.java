package com.shuanghong.smart.domain.info;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 负离子对象
 * @Description
 * @Author
 * @Date 2020-07-07 19:33
 */
@Data
public class AnionInfo {

    @ApiModelProperty(value ="开关（0：关，1：开）")
    private Integer enable;
}
