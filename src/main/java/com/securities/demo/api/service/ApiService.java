package com.securities.demo.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.securities.demo.api.dao.ApiMapper;

@Service
public class ApiService {

	private final static Logger logger = LoggerFactory.getLogger(ApiService.class);

    @Autowired
    ApiMapper apiMapper;
	
	public List<Map<String, Object>> getTopCustomerByYear() {
        return apiMapper.getTopCustomerByYear();
    }
    
    public List<Map<String, Object>> getNoDealCustomerByYear() {
        return apiMapper.getNoDealCustomerByYear();
    }
    
    public List<Map<String, Object>> getTopStoreByYear() {
    	List<Map<String, Object>> yearList = apiMapper.getDealYear();
    	List<Map<String, Object>> voList = apiMapper.getTopStoreByYear();
    	
    	for(Map<String, Object> map : voList) {
    		for(Map<String, Object> yearMap : yearList) {
    			if(map.get("year") == yearMap.get("year")) {
    				if(!yearMap.containsKey("datalist")) {
    					map.remove("year");
    					List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
    					list.add(map);
    					yearMap.put("datalist", list);
    				}else {
    					List<Map<String, Object>> list = (List<Map<String, Object>>)yearMap.get("datalist");
    					map.remove("year");
    					list.add(map);
    					yearMap.put("datalist", list);
    				}
    				
    			}
    		}
    	}
    	
        return yearList;
    }
    
    public Map<String, Object> getSumValByStore(Map<String, Object> param) throws Exception{
    	Map<String, Object> map = apiMapper.getStoreSatus(param);
    	if(map.containsKey("useStatus") && map.get("useStatus").toString().equals("N")) {
    		throw new Exception();
    	}
    	return apiMapper.getSumValByStore(param);
    }
}
