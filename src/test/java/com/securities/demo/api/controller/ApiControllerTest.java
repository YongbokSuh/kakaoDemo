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

import static org.assertj.core.api.Assertions.assertThat;
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
		
		@Test
		void test() {
			List<Map<String, Object>> result = apiController.getTopCustomerByYear();
	    	
			assertThat(result)
	        .isNotEmpty()
	        .hasSize(2);
		}

}
