package com.pengzc.blog.modules.service.impl;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pengzc.blog.modules.entity.BlogArticleCategory;
import com.pengzc.blog.modules.mapper.BlogArticleCategoryMapper;
import com.pengzc.blog.modules.service.BlogArticleCategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author pengzc123
 * @since 2018-12-19
 */
@Service
public class BlogArticleCategoryServiceImpl extends ServiceImpl<BlogArticleCategoryMapper, BlogArticleCategory> implements BlogArticleCategoryService {

    @Override
    public List<BlogArticleCategory> selectTop(int number) {
        QueryWrapper<BlogArticleCategory> queryWrapper = new QueryWrapper<BlogArticleCategory>().eq("top",1);
        return baseMapper.selectList(queryWrapper);
    }
}
