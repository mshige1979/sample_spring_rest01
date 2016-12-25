package com.example.controller.sample;

import java.sql.Timestamp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.SampleTest2DtoRes;
import com.example.entity.Item;
import com.example.repository.ItemRepository;

@RestController
@RequestMapping("sample")
public class SampleController {
	
	@Autowired 
	private ItemRepository repo;
		
	@RequestMapping(value = "test1", method = {RequestMethod.GET})
	public String test1() {
		return "test1";
	}
	
	@RequestMapping(value = "test2", method = {RequestMethod.GET})
	public SampleTest2DtoRes test2() {
		
		int a = 2;
		Item item = repo.findById(2);
		Item item2 = new Item();
		item2.setName("111");
		item2.setPrice(1200);
		item2.setCreateAt(new Timestamp(System.currentTimeMillis()));
		item2.setUpdateAt(new Timestamp(System.currentTimeMillis()));
		repo.save(item2);
		
		// レスポンスデータを設定
		SampleTest2DtoRes res = new SampleTest2DtoRes();
		if (a == 1) {
			res.setId("1");
			res.setName("hogehoge");
			res.setAge("24");
		} else {
			res.setId("2");
			res.setName("hogehoge2");
			res.setAge("14");
		}
		
		// 返却
		return res;
	}
	
}
