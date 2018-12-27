package com.pengzc.blog.controller.blog;

import com.pengzc.alldbredis.util.RedisUtils;
import com.pengzc.blog.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @ClassName DemoController
 * @Description
 * @Auth pengzc
 * @Date 2018/12/2
 **/
@Controller
public class DemoController {

    @Autowired
    private RedisUtils redisUtils;

    @Autowired
    private DemoService demoService;

    /**
     * Demo
     */
    @GetMapping(value = "/demo")
    public String demo(ModelMap modelmap) {

        redisUtils.set("demo", "demo");
        modelmap.addAttribute("test", "test");

        return "hello";
    }
}
