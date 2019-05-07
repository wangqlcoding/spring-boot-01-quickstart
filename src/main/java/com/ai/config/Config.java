package com.ai.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Auther: wangql
 * @Date: 2019/4/24 21:22
 * @Description:
 */
@Configuration
@Import(MyConfig.class)
public class Config {
}