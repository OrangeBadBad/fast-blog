package com.pengzc.allcommon.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * OssAliyunConfig
 *
 * @author pengzc
 * @create 2018-12-19 11:29
 * @desc 指定配置类
 **/
@Configuration
public class OssAliyunConfig {

    @Bean(value="defaultOssAliyunField")
    @ConfigurationProperties("oss.aliyun.defalut")
    public OssAliyunField defaultOssAliyunField() {
        return new OssAliyunField();
    }

    @Bean(value="firstOssAliyuField")
    @ConfigurationProperties("oss.aliyun.first")
    public OssAliyunField firstOssAliyuField() {
        return new OssAliyunField();
    }

    @Bean(value = "secondOssAliyuField")
    @ConfigurationProperties("oss.aliyun.second")
    public OssAliyunField secondOssAliyuField() {
        return new OssAliyunField();
    }
}
