package com.pengzc.blog.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.pengzc.blog.entity.BlogArticleComment;
import com.pengzc.blog.mapper.BlogArticleCommentMapper;
import com.pengzc.blog.service.BlogArticleCommentService;
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
public class BlogArticleCommentServiceImpl extends ServiceImpl<BlogArticleCommentMapper, BlogArticleComment> implements BlogArticleCommentService {

}
