package com.easymis.commons.web;

import java.util.HashMap;

import org.apache.commons.lang.StringUtils;
public class RedisManagerWrapper {/*
private IRedisManager redis;
	
	public RedisManagerWrapper(IRedisManager redis) {
		this.redis = redis;
	}
	
	public Integer getInteger(String key) {
		String str = redis.get(key);
		if (StringUtils.isBlank(str)) {
			return null;
		}
		@SuppressWarnings("unchecked")
		HashMap<String, Integer> map = (HashMap<String, Integer>) JsonUtil.getInstance().jsonStringToJavaObject(str, HashMap.class);
		return map.get("key");
	}
	
	public void setInteger(String key, Integer i) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("key", i);
		redis.save(key, map);
	}
	
	public String getString(String key) {
		String str = redis.get(key);
		if (StringUtils.isBlank(str)) {
			return null;
		}
		@SuppressWarnings("unchecked")
		HashMap<String, String> map = (HashMap<String, String>) JsonUtil.getInstance().jsonStringToJavaObject(str, HashMap.class);
		return map.get("key");
	}
	
	public void setString(String key, String value) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("key", value);
		redis.save(key, map);
	}
	
	public Integer getDailyCounter(String key) {
		Integer today = (int)(System.currentTimeMillis()/(1000 * 3600 * 24)), counter = 0;
		Integer v = getInteger(key);
		
		if (v == null) {
			v = today * 100 + counter;
			setInteger(key, v);
			return counter;
		}
		Integer day = v / 100, c = v % 100;
		if(!today.equals(day)) {
			v = today * 100 + counter;
			setInteger(key, v);
			return counter;
		}
		return c;
	}
	public Integer increaseDailyCounter(String key) {
		Integer today = (int)(System.currentTimeMillis()/(1000 * 3600 * 24)), counter = 1;
		Integer v = getInteger(key);
		
		if (v == null) {
			v = today * 100 + counter;
			setInteger(key, v);
			return counter;
		}
		Integer day = v / 100, c = v % 100;
		if(!today.equals(day)) {
			v = today * 100 + counter;
			setInteger(key, v);
			return counter;
		}
		c++;
		v = today * 100 + c;
		setInteger(key, v);
		return c;
	}
*/}
