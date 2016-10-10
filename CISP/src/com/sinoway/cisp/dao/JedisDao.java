package com.sinoway.cisp.dao;

public interface JedisDao {
	//redis也是一个数据库，通常情况下，我们是和数据库交互，所以我们在这里抽取一个dao
	//抽取一些Jedis的常用方法
	//String类型 set
	public String set(String key,String value);
	//String类型 get
	public String get(String key);
	//自增，自减
	public Long incr(String key);
	public Long decr(String key);
	//hash类型 hset
	public Long hset(String key,String field,String value);
	//hash类型 hget
	public String hget(String key,String field);
	//hash 删除hdel
	public Long hdel(String key,String field);
	//设置数据过期
	public Long expire(String key,int seconds);
	//监控过期过程
	public Long ttl(String key);
	
}
