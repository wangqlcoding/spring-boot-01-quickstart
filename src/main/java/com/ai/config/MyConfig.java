package com.ai.config;

import com.ai.service.HelloService;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: wangql
 * @Date: 2019/4/19 12:21
 * @Description: 指明当前类是一个配置类，就是代替之前的spring配置文件
 */
@Configuration
public class MyConfig {

    //将方法的返回值添加到容器中  容器中这个组件默认的id就是方法名
    @Bean
    public HelloService helloService(){
        System.out.println("配置类注入bean");
        return new HelloService();
    }

    @Bean
    //@loadbeanced
    public RestTemplate restTemplate(){
        System.out.println();
        return new RestTemplate();
    }
}