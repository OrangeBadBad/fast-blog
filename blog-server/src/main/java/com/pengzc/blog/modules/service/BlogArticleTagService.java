package com.pengzc.blog.modules.service;

import com.pengzc.blog.modules.entity.BlogArticleTag;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author pengzc
 * @since 2018-12-25
 */
public interface BlogArticleTagService extends IService<BlogArticleTag> {

    /**
     * 查询热度高得前n条标签
     * @param number
     * @return
     */
    public List<BlogArticleTag> selectTop(int number);

}
