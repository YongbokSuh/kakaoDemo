package com.securities.demo.api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.securities.demo.api.service.ApiService;

@RestController
@RequestMapping("/api")
public class ApiController {

	private final static Logger logger = LoggerFactory.getLogger(ApiController.class);
	
    @Autowired
    ApiService apiService;

    @GetMapping("/test")
    public String test() {
        return "Hello, World";
    }
    
    @GetMapping("/getTopCustomerByYear")
    public List<Map<String, Object>> getTopCustomerByYear() {
        return apiService.getTopCustomerByYear();
    }
    
    @GetMapping("/getNoDealCustomerByYear")
    public List<Map<String, Object>> getNoDealCustomerByYear() {
        return apiService.getNoDealCustomerByYear();
    }
    
    
    @GetMapping("/getTopStoreByYear")
    public List<Map<String, Object>> getTopStoreByYear() {
        return apiService.getTopStoreByYear();
    }
    
    @PostMapping("/getSumValByStore")
    public Map<String, Object> getSumValByStore(HttpServletResponse response, @RequestParam Map<String, Object> param) {
    	Map<String, Object> map = new HashMap<String, Object>();
    	try {
    		map= apiService.getSumValByStore(param);
		} catch (Exception e) {
			response.setStatus(404);
			map.put("code", "404");
			map.put("message", "br code not found error");
		}
    	return map;
    }
    
}