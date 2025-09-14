package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.SampleDao;

import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class SampleService {
	
	private final SampleDao sampleDao;
	
	public SampleService(SampleDao sampleDao) {
		this.sampleDao = sampleDao;
	}

    public List<Map<String, Object>> getAllUsers() {
        return sampleDao.findAllUsers();
    }

    public List<Map<String, Object>> getUserByIds(Long id) {
    	System.out.println("서비스 실행 ~~~");
    	
    	Map<String, Object> user = new HashMap<String, Object>();
        return sampleDao.findUserByIds(user);
    }
    
    public Map<String, Object> getUserById(Long id) {
    	System.out.println("서비스 실행 ~~~");
    	
    	Map<String, Object> user = new HashMap<String, Object>();
        return sampleDao.findUserById(user);
    }

    public void addUser(Map<String, Object> user) {
    	sampleDao.insertUser(user);
    }
}
