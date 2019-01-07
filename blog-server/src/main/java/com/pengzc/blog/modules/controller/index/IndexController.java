package com.pengzc.blog.modules.controller.index;

import com.pengzc.blog.modules.entity.BlogAboutMe;
import com.pengzc.blog.modules.entity.BlogUser;
import com.pengzc.blog.modules.service.BlogAboutMeService;
import com.pengzc.blog.modules.service.BlogUserService;
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

    @Autowired
    private BlogAboutMeService blogAboutMeService;

    @GetMapping("/home")
    public String index(ModelMap modelMap){
        BlogUser blogUser =  blogUserService.getById(1);
        modelMap.addAttribute("user",blogUser);
        return "index";
    }
}
