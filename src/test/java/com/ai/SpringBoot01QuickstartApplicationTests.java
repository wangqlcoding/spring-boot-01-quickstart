package com.ai;

import com.ai.bean.Acctconfig;
import com.ai.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * springboot单元测试
 * 可以在测试期间很方便的累死编码一样的自动注入
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot01QuickstartApplicationTests {

	@Autowired
	Person person;
	@Test
	public void contextLoads() {
		System.out.println(person);
	}


	@Autowired
	Acctconfig acctconfig;

	@Test
	public void test(){
		System.out.println(acctconfig);
	}

	@Autowired
	ApplicationContext ioc;
	@Test
	public void test1(){
		boolean b = ioc.containsBean("helloService");
		System.out.println(b);
	}


	Logger logger = LoggerFactory.getLogger(getClass());
	@Test
	public void testLog(){
		logger.trace("trace...");
		logger.debug("debug...");
		logger.info("info...");
		logger.warn("warn...");
		logger.error("error...");
	}





}
