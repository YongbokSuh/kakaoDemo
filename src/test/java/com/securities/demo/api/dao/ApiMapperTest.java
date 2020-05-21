package com.securities.demo.api.dao;


import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.hamcrest.CoreMatchers.theInstance;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.BDDAssertions.then;

@SpringBootTest
public class ApiMapperTest {

    @Autowired
    private ApiMapper apiMapper;
    
	@Test
	void test() {
		
		List<Map<String, Object>> result = apiMapper.getTopCustomerByYear();
    	
		assertThat(result)
        .isNotEmpty()
        .hasSize(2);
	}

}
