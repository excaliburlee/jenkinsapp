package com.medical.mallerp.dao;

import org.springframework.stereotype.Repository;

import com.medical.mallerp.entity.Demo;

@Repository
public interface DemoDao {
	public Demo select();
	
	public void insert(Demo demo);
	
	public void update(Demo demo);
	
	public void delete(int id);
}
