package com.pengzc.blog.modules.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pengzc.blog.modules.entity.BlogArticle;

import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author pengzc
 * @since 2018-12-19
 */
public interface BlogArticleService extends IService<BlogArticle> {

   /* *
     * 用户文章分页查询
     * @param param
     * @return
   * */
   public IPage<BlogArticle> selectUserArticles(Map<String,Object> param);

}
