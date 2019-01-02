//package com.pengzc.blog.config;
//
//
//import com.pengzc.all.common.config.oss.OssAliyunConfig;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * OssCloudStorageConfig
// *
// * @author pengzc
// * @create 2018-12-19 11:29
// * @desc oss云存储配置
// **/
//@Configuration
//public class OssCloudStorageConfig {
//
//    @Bean(value = "OssAliyunConfig")
//    @ConfigurationProperties("oss.cloud.defalut")
//    public OssAliyunConfig ossAliyunConfig() {
//        return new OssAliyunConfig();
//    }
//
//    @Bean(value = "OssQiNiuConfig")
//    @ConfigurationProperties("oss.cloud.first")
//    public OssAliyunConfig firstOssAliyuField() {
//        return new OssAliyunConfig();
//    }
//
//    @Bean(value = "OssTencentConfig")
//    @ConfigurationProperties("oss.cloud.second")
//    public OssAliyunConfig secondOssAliyuField() {
//        return new OssAliyunConfig();
//    }
//}
