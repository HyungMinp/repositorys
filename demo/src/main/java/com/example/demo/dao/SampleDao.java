package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

@Mapper
public interface SampleDao {
	List<Map<String, Object>> findAllUsers();
	List<Map<String, Object>> findUserByIds(Map<String, Object> user);
	Map<String, Object> findUserById(Map<String, Object> user);
    void insertUser(Map<String, Object> user);
}
