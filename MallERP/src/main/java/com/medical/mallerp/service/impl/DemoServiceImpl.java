package com.medical.mallerp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medical.mallerp.dao.DemoDao;
import com.medical.mallerp.entity.Demo;
import com.medical.mallerp.service.DemoService;

@Service("demoService")
public class DemoServiceImpl implements DemoService {
	
	@Autowired
	private DemoDao demoDao;

	public Demo select() {
		return demoDao.select();
	}

	public void insert(Demo demo) {
		demoDao.insert(demo);
	}

	public void update(Demo demo) {
		demoDao.update(demo);
	}

	public void delete(int id) {
		demoDao.delete(id);
	}

}
