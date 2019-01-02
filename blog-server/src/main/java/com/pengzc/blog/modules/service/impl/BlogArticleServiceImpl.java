package com.pengzc.blog.modules.service.impl;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.pengzc.blog.modules.entity.BlogArticle;
import com.pengzc.blog.modules.mapper.BlogArticleMapper;
import com.pengzc.blog.modules.service.BlogArticleService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author pengzc123
 * @since 2018-12-19
 */
@Service
public class BlogArticleServiceImpl extends ServiceImpl<BlogArticleMapper, BlogArticle> implements BlogArticleService {

    @Override
    public Page<BlogArticle> selectUserArticles( Map<String, Object> params) {
        int pageNum =Integer.parseInt((String)params.get("page"));
        int pageSize = (int)params.get("pageSize");
        String userId = String.valueOf(params.get("userId"));
        Page<BlogArticle> page = new Page<BlogArticle>(pageSize,pageNum);
        BlogArticle blogArticle = new BlogArticle();
        blogArticle.setUserId(userId);
        EntityWrapper<BlogArticle> entityWrapper = new EntityWrapper<BlogArticle>(blogArticle);
        super.selectPage(page,entityWrapper);
        return null;
    }
}
