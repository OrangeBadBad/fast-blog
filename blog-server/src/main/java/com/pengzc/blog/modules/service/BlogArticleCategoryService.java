package com.pengzc.blog.modules.service;



import com.baomidou.mybatisplus.extension.service.IService;
import com.pengzc.blog.modules.entity.BlogArticleCategory;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author pengzc123
 * @since 2018-12-19
 */
public interface BlogArticleCategoryService extends IService<BlogArticleCategory> {


    public List<BlogArticleCategory> selectTop(int number);

}
