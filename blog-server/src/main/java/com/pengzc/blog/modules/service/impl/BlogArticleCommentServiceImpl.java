package com.pengzc.blog.modules.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.pengzc.blog.modules.entity.BlogArticleComment;
import com.pengzc.blog.modules.mapper.BlogArticleCommentMapper;
import com.pengzc.blog.modules.service.BlogArticleCommentService;
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
