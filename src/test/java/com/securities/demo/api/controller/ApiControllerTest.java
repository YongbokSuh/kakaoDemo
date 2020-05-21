package com.securities.demo.api.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.securities.demo.common.DaoResultMap;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@SpringBootTest
@AutoConfigureMockMvc
class ApiControllerTest {

	 @Autowired
	 ApiController apiController;

	 @Autowired
		private MockMvc mockMvc;

		@Test
		public void shouldReturnDefaultMessage() throws Exception {
			mockMvc.perform(get("/api/test")).andDo(print()).andExpect(status().isOk())
					.andExpect(content().string(containsString("Hello, World")));
		}
//		
//	    @Test
//	    public void testGetTopCustomerByYear() throws Exception {
//	    	List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
//	    	
//	    	Map<String, Object> map = new DaoResultMap<String, Object>();
//	    	map.put("year", "2018");
//	    	map.put("name", "테드");
//	    	map.put("acctno", "11111114");
//	    	map.put("sumamt", 28992000);
//	    	
//	    	Map<String, Object> map2 = new HashMap<String, Object>();
//	    	map2.put("year", "2019");
//	    	map2.put("name", "에이스");
//	    	map2.put("acctno", "11111112");
//	    	map2.put("sumamt", "40998400");
//	    	
//	    	list.add(map);
//	    	list.add(map2);
//	    	
//	    	List<Map<String, Object>>  result = apiController.getTopCustomerByYear();
//	    	
//	    	assertEquals(list.get(0).get("name"), result.get(0).get("name"));
//	    }


}
