package com.pengzc.blog.modules.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pengzc.blog.modules.entity.BlogArticleTag;
import com.pengzc.blog.modules.mapper.BlogArticleTagMapper;
import com.pengzc.blog.modules.service.BlogArticleTagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author pengzc
 * @since 2018-12-25
 */
@Service
public class BlogArticleTagServiceImpl extends ServiceImpl<BlogArticleTagMapper, BlogArticleTag> implements BlogArticleTagService {

    @Override
    public List<BlogArticleTag> selectTop(int number) {
        QueryWrapper<BlogArticleTag> queryWrapper = new QueryWrapper<BlogArticleTag>().eq("top",10);
        return baseMapper.selectList(queryWrapper);
    }
}
