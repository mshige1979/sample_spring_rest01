package com.example;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class AbstractRepositoryTest extends AbstractTest {
	
	@Autowired	
	private Environment env;
	
	@Before
	public void setUp(){
		// 前処理
		super.setUp();
	}
	
	@After
	public void tearDown(){
		// 後処理
		super.tearDown();
	}
	
}
