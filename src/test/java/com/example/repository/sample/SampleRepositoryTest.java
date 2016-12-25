package com.example.repository.sample;

import static org.junit.Assert.*;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import com.example.AbstractRepositoryTest;
import com.example.entity.Item;
import com.example.repository.ItemRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SampleRepositoryTest extends AbstractRepositoryTest {
	
	@Autowired 
	private ItemRepository repo;
	
	private static final Logger logger = LoggerFactory.getLogger(SampleRepositoryTest.class);
		
	@Test
	public void testAAA() {
		
		Timestamp s = new Timestamp(System.currentTimeMillis());
		String x = new SimpleDateFormat("yyyyMMddHHmmssSSS000").format(s);
		logger.info(x);
					
		Item item2 = new Item();
		item2.setName("111");
		item2.setPrice(1200);
		item2.setCreateAt(new Timestamp(System.currentTimeMillis()));
		item2.setUpdateAt(new Timestamp(System.currentTimeMillis()));
		repo.save(item2);
		
		Item item = repo.findById(6);
		logger.info(item.getUpdateAt().toString());
		
		String a = "a";
		String b = "a";
		assertEquals(a, b);
	}
}
