package com.shuanghong.smart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import springfox.documentation.annotations.ApiIgnore;

/**
 * 页面控制器
 * @Description
 * @Author
 * @Date 2020-07-08 9:05
 */
@Controller
@ApiIgnore
public class PageController {

    @GetMapping("/")
    public String index() {
        return "redirect:/detail.html";
    }

    @GetMapping("/detail.html")
    public String detail() {
        return "detail";
    }
}
