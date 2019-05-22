package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author LHR
 * Create By 2017/8/21
 */
@SpringBootApplication
@EnableCaching//缓存支持
public class PortalApplication {


    public static void main(String[] args) throws IOException {
        //更改properties配置文件名称,避免依赖冲突
        Properties properties = new Properties();
        InputStream in = PortalApplication.class.getClassLoader().getResourceAsStream("portal.properties");
        properties.load(in);
        SpringApplication app = new SpringApplication(PortalApplication.class);
        app.setDefaultProperties(properties);
        app.run(args);
    }

}
