package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.service.SampleService;

import lombok.RequiredArgsConstructor;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/sample")
@RequiredArgsConstructor
public class SampleController {
	
	
	private final SampleService sampleService;
	public SampleController(SampleService sampleService) {
		this.sampleService = sampleService;
	}
	
    @GetMapping
    public List<Map<String, Object>> getUsers() {
        return sampleService.getAllUsers();
    }
    
    @GetMapping("/test1")
    public List<Map<String, Object>> getUser( ) {
    	System.out.println("실행");
    	Long id = 1L;
        return sampleService.getUserByIds(id);
    }

    @GetMapping("/test2")
    public Map<String, Object> getUser(@PathVariable Long id) {
        return sampleService.getUserById(id);
    }

    @PostMapping
    public void addUser(@RequestBody Map<String, Object> user) {
    	sampleService.addUser(user);
    }
}
