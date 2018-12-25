package com.pengzc.blog.controller.index;

import com.pengzc.blog.entity.BlogUser;
import com.pengzc.blog.service.BlogUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName IndexController
 * @Description
 * @Auth pengzc
 * @Date 2018/12/25
 **/
@RequestMapping("/index")
@Controller
public class IndexController {

    @Autowired
    private BlogUserService blogUserService;

    @GetMapping("/home")
    public String index(ModelMap modelMap){
        BlogUser blogUser =  blogUserService.selectById(1);

        modelMap.addAttribute("user",blogUser);
        return "index";
    }
}
