package com.securities.demo.api.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ApiMapper {

    List<Map<String, Object>> getTopCustomerByYear();

    List<Map<String, Object>> getNoDealCustomerByYear();
    
    List<Map<String, Object>> getTopStoreByYear();
    
    List<Map<String, Object>> getDealYear();
    
    Map<String, Object> getSumValByStore(Map<String, Object> param);
    
    Map<String, Object> getStoreSatus(Map<String, Object> param);
}