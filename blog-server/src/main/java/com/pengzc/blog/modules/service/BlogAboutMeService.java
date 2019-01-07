package com.pengzc.blog.modules.service;


import com.pengzc.blog.modules.entity.BlogAboutMe;
import com.baomidou.mybatisplus.extension.service.IService;



/**
 * <p>
 * 服务类
 * </p>
 *
 * @author pengzc
 * @since 2018-12-25
 */
public interface BlogAboutMeService extends IService<BlogAboutMe> {

    /**
     * 用户信息查询
     * @param userId
     * @return
     */
    public BlogAboutMe selectByUserId(String userId);

}
