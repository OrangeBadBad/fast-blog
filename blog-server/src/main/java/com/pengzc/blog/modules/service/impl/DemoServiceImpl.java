package com.pengzc.blog.modules.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pengzc.blog.modules.entity.DemoEntity;
import com.pengzc.blog.modules.mapper.DemoMapper;
import com.pengzc.blog.modules.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName DemoServiceImpl
 * @Description
 * @Auth pengzc
 * @Date 2018/12/2
 **/
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoMapper demoMapper;


    @Override
    public List<DemoEntity> getAll() {
        return demoMapper.selectList(new QueryWrapper<DemoEntity>());
    }
}
