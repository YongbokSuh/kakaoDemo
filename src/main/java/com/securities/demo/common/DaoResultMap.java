package com.securities.demo.common;

import java.util.HashMap;

import org.apache.ibatis.type.Alias;
import org.springframework.jdbc.support.JdbcUtils;

import lombok.Data;

@Data
@Alias("daoResultMap")
public class DaoResultMap<String, Object> extends HashMap<String, Object>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Object put(String key, Object value) {
		
		return super.put((String)JdbcUtils.convertUnderscoreNameToPropertyName((java.lang.String) key), value);
	} 
}
