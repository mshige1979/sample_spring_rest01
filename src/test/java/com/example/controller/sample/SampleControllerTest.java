package com.example.controller.sample;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.AbstractApiControllerTest;
import com.example.entity.Item;
import com.example.repository.ItemRepository;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class SampleControllerTest extends AbstractApiControllerTest{
	
//	@Rule
//    public MockitoRule mockitoJUnitRule = MockitoJUnit.rule();
//	
//	@Mock
//	private ItemRepository repo;
//	
//	@InjectMocks
//    private SampleController target;
	
//	@Before
//    public void before() throws Exception {
//		super.setUp();
//        mvc = MockMvcBuilders.standaloneSetup(target).build();
//    }
	
    /**
     * /sample/test1
     * @throws Exception
     */
    @Test
    public void testSampleTest1() throws Exception {
    	
    	mvc.perform(get("/sample/test1"))
            .andExpect(status().isOk())
            .andExpect(content().string("test1"));
    }
    
    /**
     * /sample/test2
     * @throws Exception
     */
    @Test
    public void testSampleTest2() throws Exception {
    	
//    	// モックを定義
//    	Item item3 = new Item();
//		item3.setName("111");
//		when(repo.findById(1)).thenReturn(item3);
		
		// 実行し、値を検証
        mvc.perform(get("/sample/test2"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("result", is("0")))
            .andExpect(jsonPath("id", is("2")))
            .andExpect(jsonPath("name", is("hogehoge2")))
            .andExpect(jsonPath("age", is("14")));
        
//        // モックの検証
//        // times(1)    : 1回呼び出されたこと
//        // findById(2) : findByIdの呼び出しで引数の値が2であること
//        verify(repo, times(1)).findById(2);
    }
    
    
}
