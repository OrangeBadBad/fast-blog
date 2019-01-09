package com.pengzc.blog.modules.controller.index;

import com.pengzc.blog.modules.entity.BlogArticle;
import com.pengzc.blog.modules.entity.BlogUser;
import com.pengzc.blog.modules.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

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

    @Autowired
    private BlogArticleCategoryService blogArticleCategoryService;

    @Autowired
    private BlogArticleTagService blogArticleTagService;

    @Autowired
    private BlogArticleService blogArticleService;

    @GetMapping("/home")
    public String index(ModelMap modelMap, @RequestParam Map<String,Object> params){
        //获取 用户信息  文章   标签 和分类
        BlogUser blogUser =  blogUserService.getById(1);
        blogArticleService.selectUserArticles(params);
        blogArticleCategoryService.selectTop(10);
        blogArticleTagService.selectTop(10);
        blogArticleService.selectUserArticles(params);
        modelMap.addAttribute("user",blogUser);

        return "index";
    }
}
