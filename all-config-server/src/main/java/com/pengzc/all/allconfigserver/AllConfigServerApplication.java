package com.pengzc.all.allconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AllConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AllConfigServerApplication.class, args);
    }
}
