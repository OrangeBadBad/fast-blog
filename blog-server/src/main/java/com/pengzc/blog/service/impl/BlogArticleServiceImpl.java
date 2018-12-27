package com.pengzc.blog.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.pengzc.blog.entity.BlogArticle;
import com.pengzc.blog.mapper.BlogArticleMapper;
import com.pengzc.blog.service.BlogArticleService;
import org.springframework.stereotype.Service;

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

}
