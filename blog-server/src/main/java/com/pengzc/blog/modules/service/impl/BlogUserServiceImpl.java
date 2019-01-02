package com.pengzc.blog.modules.service.impl;


import com.pengzc.blog.modules.entity.BlogUser;
import com.pengzc.blog.modules.mapper.BlogUserMapper;
import com.pengzc.blog.modules.service.BlogUserService;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
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
public class BlogUserServiceImpl extends ServiceImpl<BlogUserMapper, BlogUser> implements BlogUserService {

}
