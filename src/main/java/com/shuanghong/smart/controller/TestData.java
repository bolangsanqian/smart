package com.shuanghong.smart.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shuanghong.smart.domain.info.DataSyncInfo;

/**
 * @Description
 * @Author
 * @Date 2020-07-09 10:51
 */
public class TestData {

    public static void loadData() {
        SmartController.datas.put("open", JSON.parseObject("{\"sn\":\"open\",\"name\":\"菌丝培养-open\",\"status\":\"萌芽阶段\",\"outdoor\":{\"temperature\":30,\"humidity\":40},\"temperature\":{\"startTarget\":26,\"endTarget\":30,\"value\":30,\"status\":0,\"enable\":1},\"humidity\":{\"startTarget\":190,\"endTarget\":200,\"value\":45.5,\"status\":0,\"enable\":1},\"illumination\":{\"startTarget\":353,\"endTarget\":500,\"value\":200,\"status\":0,\"intensity\":100},\"co2\":{\"startTarget\":980,\"endTarget\":1000,\"value\":650,\"status\":0,\"enable\":1},\"syncTime\":null}", DataSyncInfo.class));
        SmartController.datas.put("close", JSON.parseObject("{\"sn\":\"close\",\"name\":\"菌丝培养-close\",\"status\":\"萌芽阶段\",\"outdoor\":{\"temperature\":30,\"humidity\":40},\"temperature\":{\"startTarget\":26,\"endTarget\":30,\"value\":30,\"status\":0,\"enable\":0},\"humidity\":{\"startTarget\":190,\"endTarget\":200,\"value\":45.5,\"status\":0,\"enable\":0},\"illumination\":{\"startTarget\":353,\"endTarget\":360,\"value\":200,\"status\":0,\"intensity\":100},\"co2\":{\"startTarget\":980,\"endTarget\":1000,\"value\":650,\"status\":0,\"enable\":0},\"syncTime\":null}", DataSyncInfo.class));
        SmartController.datas.put("illumination-0", JSON.parseObject("{\"sn\":\"illumination-0\",\"name\":\"菌丝培养-illumination-0\",\"status\":\"萌芽阶段\",\"outdoor\":{\"temperature\":30,\"humidity\":40},\"temperature\":{\"startTarget\":26,\"endTarget\":30,\"value\":30,\"status\":0,\"enable\":0},\"humidity\":{\"startTarget\":190,\"endTarget\":200,\"value\":0,\"status\":0,\"enable\":1},\"illumination\":{\"startTarget\":353,\"endTarget\":360,\"value\":0,\"status\":0,\"intensity\":100},\"co2\":{\"startTarget\":980,\"endTarget\":1000,\"value\":650,\"status\":0,\"enable\":1},\"syncTime\":null}", DataSyncInfo.class));
        SmartController.datas.put("illumination-1", JSON.parseObject("{\"sn\":\"illumination-1\",\"name\":\"菌丝培养-illumination-1\",\"status\":\"萌芽阶段\",\"outdoor\":{\"temperature\":30,\"humidity\":40},\"temperature\":{\"startTarget\":26,\"endTarget\":30,\"value\":30,\"status\":0,\"enable\":0},\"humidity\":{\"startTarget\":190,\"endTarget\":200,\"value\":0,\"status\":0,\"enable\":1},\"illumination\":{\"startTarget\":353,\"endTarget\":360,\"value\":1,\"status\":0,\"intensity\":100},\"co2\":{\"startTarget\":980,\"endTarget\":1000,\"value\":650,\"status\":0,\"enable\":1},\"syncTime\":null}", DataSyncInfo.class));
        SmartController.datas.put("illumination-50000", JSON.parseObject("{\"sn\":\"illumination-50000\",\"name\":\"菌丝培养-illumination-50000\",\"status\":\"萌芽阶段\",\"outdoor\":{\"temperature\":30,\"humidity\":40},\"temperature\":{\"startTarget\":26,\"endTarget\":30,\"value\":30,\"status\":0,\"enable\":0},\"humidity\":{\"startTarget\":190,\"endTarget\":200,\"value\":0,\"status\":0,\"enable\":1},\"illumination\":{\"startTarget\":353,\"endTarget\":360,\"value\":50000,\"status\":0,\"intensity\":100},\"co2\":{\"startTarget\":980,\"endTarget\":1000,\"value\":650,\"status\":0,\"enable\":1},\"syncTime\":null}", DataSyncInfo.class));
        SmartController.datas.put("illumination-100000", JSON.parseObject("{\"sn\":\"illumination-100000\",\"name\":\"菌丝培养-illumination-100000\",\"status\":\"萌芽阶段\",\"outdoor\":{\"temperature\":30,\"humidity\":40},\"temperature\":{\"startTarget\":26,\"endTarget\":30,\"value\":30,\"status\":0,\"enable\":0},\"humidity\":{\"startTarget\":190,\"endTarget\":200,\"value\":0,\"status\":0,\"enable\":1},\"illumination\":{\"startTarget\":353,\"endTarget\":360,\"value\":100000,\"status\":0,\"intensity\":100},\"co2\":{\"startTarget\":980,\"endTarget\":1000,\"value\":650,\"status\":0,\"enable\":1},\"syncTime\":null}", DataSyncInfo.class));
    }
}
