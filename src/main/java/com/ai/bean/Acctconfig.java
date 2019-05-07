package com.ai.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Auther: wangql
 * @Date: 2019/4/19 12:06
 * @Description:
 */
@PropertySource(value = {"classpath:acctconfig.properties"})
@Component
@ConfigurationProperties
public class Acctconfig {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Acctconfig{" +
                "name='" + name + '\'' +
                '}';
    }
}