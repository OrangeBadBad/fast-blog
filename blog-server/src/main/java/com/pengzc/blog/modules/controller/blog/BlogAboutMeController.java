package com.pengzc.blog.modules.controller.blog;


import com.pengzc.all.common.utils.Resp;
import com.pengzc.blog.modules.entity.BlogAboutMe;
import com.pengzc.blog.modules.service.BlogAboutMeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author pengzc
 * @since 2018-12-25
 */
@Controller
@RequestMapping("/blogAboutMe")
public class BlogAboutMeController {

    @Autowired
    private BlogAboutMeService blogAboutMeService;

    @RequestMapping("/getByUserId")
    public @ResponseBody  Resp getByUserId(@RequestParam  String userId){
    return Resp.ok().put("aboutMe", blogAboutMeService.selectByUserId(userId));
    }

}

