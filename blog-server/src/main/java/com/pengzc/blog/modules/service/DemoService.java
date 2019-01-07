package com.pengzc.blog.modules.service;

import com.pengzc.blog.modules.entity.DemoEntity;

import java.util.List;

/**
 * @ClassName DemoService
 * @Description
 * @Auth pengzc
 * @Date 2018/12/2
 **/
public interface DemoService {


    /**
     * getDemo
     */
    public List<DemoEntity> getAll();
}
