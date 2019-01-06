package com.pengzc.blog.modules.controller.blog;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pengzc.blog.modules.entity.BlogArticle;
import com.pengzc.blog.modules.service.BlogArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author pengzc123
 * @since 2018-12-19
 */
@RestController
@RequestMapping("/blogArticle")
public class BlogArticleController {

    @Autowired
    private BlogArticleService blogArticleService;

    @RequestMapping (value="/getAll")
    public Page getAll(@RequestBody Map<String,Object> param){
       return null;
    }


    @RequestMapping (value="/getByUserId")
    public IPage getByUserId(@RequestParam Map<String,Object> param){
        IPage<BlogArticle> page = new Page<>(1,10);
        QueryWrapper<BlogArticle> queryWrapper = new QueryWrapper<BlogArticle>();
        queryWrapper.eq("user_id",param.get("userId"));

        return blogArticleService.page(page,queryWrapper);
    }

}

