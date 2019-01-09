package com.pengzc.blog.modules.service.impl;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pengzc.all.common.exception.BaseException;
import com.pengzc.blog.modules.entity.BlogArticle;
import com.pengzc.blog.modules.mapper.BlogArticleMapper;
import com.pengzc.blog.modules.service.BlogArticleService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author pengzc
 * @since 2018-12-19
 */
@Service
public class BlogArticleServiceImpl extends ServiceImpl<BlogArticleMapper, BlogArticle> implements BlogArticleService {

    @Override
    public IPage<BlogArticle> selectUserArticles(Map<String, Object> params) {
        String pageNumStr = (String)params.get("pageNum");
        String pageSizeStr = (String)params.get("pageSize");
        if(StringUtils.isBlank(pageNumStr)) throw new BaseException("pageNum 不能为空");
        if(StringUtils.isBlank(pageSizeStr)) throw new BaseException("pageSize 不能为空");
        int pageNum =Integer.parseInt(pageSizeStr);
        int pageSize = (int)params.get("pageSize");
        String userId = String.valueOf(params.get("userId"));
        IPage<BlogArticle> page = new Page<>(pageNum,pageSize);
        QueryWrapper<BlogArticle> queryWrapper = new QueryWrapper<BlogArticle>().eq("user_id",userId).orderByDesc("create_time");
        return baseMapper.selectPage(page,queryWrapper);
    }
}
