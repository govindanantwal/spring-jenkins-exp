package com.siyatech.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsExpApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsExpApplicationTests.class);
	@Test
	void contextLoads() 
	{
		logger.info("************Test case checked successfully*********************");
		System.out.println("Hello Govind");
		assertEquals(true, true);
	}

}
