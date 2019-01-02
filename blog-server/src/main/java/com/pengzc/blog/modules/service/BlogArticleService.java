package com.pengzc.blog.modules.service;


import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.pengzc.all.dbmysql.utils.PageUtils;
import com.pengzc.blog.modules.entity.BlogArticle;

import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author pengzc123
 * @since 2018-12-19
 */
public interface BlogArticleService extends IService<BlogArticle> {

    /**
     * 用户文章分页查询
     * @param param
     * @return
     */
    public Page<BlogArticle> selectUserArticles(Map<String,Object> param);

}
