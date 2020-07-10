package com.shuanghong.smart.controller;

import com.shuanghong.smart.domain.Result;
import com.shuanghong.smart.domain.info.*;
import com.shuanghong.smart.domain.req.DataSyncRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author
 * @Date 2020-07-07 19:00
 */
@Api(value = "菌丝培养")
@RestController
public class SmartController {

    public static Map<String, DataSyncInfo> datas = new HashMap<>();

    static {
        TestData.loadData();
    }

    @ApiOperation(value = "同步数据")
    @PostMapping("/sync/data")
    private Result dataSync(@Valid @RequestBody DataSyncRequest request) {
        if (null != request) {
            datas.put(request.getSn(), request);
        }
        return new Result().success();
    }

    @ApiIgnore
    @ApiOperation(value = "设备数据详情")
    @GetMapping("/detail/{sn}")
    private Result dataSync(@ApiParam(value = "序列号") @PathVariable("sn") String sn) {
        DataSyncInfo dataSyncInfo = datas.get(sn);
        if (null == dataSyncInfo) {
            return new Result().error("设备数据不存在[SN=" + sn + "]");
        }
        return new Result().success(datas.get(sn));
    }
}
