package com.medical.mallerp.service;

import com.medical.mallerp.entity.Demo;

public interface DemoService {
	public Demo select();
	
	public void insert(Demo demo);
	
	public void update(Demo demo);
	
	public void delete(int id);
}
