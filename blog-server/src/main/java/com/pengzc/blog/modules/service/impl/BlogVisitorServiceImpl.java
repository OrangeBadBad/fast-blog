package com.pengzc.blog.modules.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pengzc.blog.modules.entity.BlogVisitor;
import com.pengzc.blog.modules.mapper.BlogVisitorMapper;
import com.pengzc.blog.modules.service.BlogVisitorService;
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
public class BlogVisitorServiceImpl extends ServiceImpl<BlogVisitorMapper, BlogVisitor> implements BlogVisitorService {

}
