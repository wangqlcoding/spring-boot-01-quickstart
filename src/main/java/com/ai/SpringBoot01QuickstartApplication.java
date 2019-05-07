package com.ai;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 @ImportResource(locations = {"classpath:beans.xml"}) 导入spring的配置文件
 不建议使用  用@Configuration @Bean代替
 */
@SpringBootApplication
public class SpringBoot01QuickstartApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot01QuickstartApplication.class, args);
	}

}
