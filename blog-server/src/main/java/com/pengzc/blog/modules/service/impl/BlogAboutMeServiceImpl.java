package com.pengzc.blog.modules.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pengzc.all.common.exception.BaseException;
import com.pengzc.blog.modules.entity.BlogAboutMe;
import com.pengzc.blog.modules.mapper.BlogAboutMeMapper;
import com.pengzc.blog.modules.service.BlogAboutMeService;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;


/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author pengzc
 * @since 2018-12-25
 */
@Service
public class BlogAboutMeServiceImpl extends ServiceImpl<BlogAboutMeMapper, BlogAboutMe> implements BlogAboutMeService {

    @Override
    public BlogAboutMe selectByUserId(String userId) {
        if(StringUtils.isBlank(userId)) throw new BaseException("userId 不能为空");
        QueryWrapper<BlogAboutMe> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id",Integer.parseInt(userId));
       return  baseMapper.selectOne(queryWrapper);
    }
}
