package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.dto.News;

@RestController
public class MyController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/getNews")
	private ResponseEntity<News> getNewsApiHandler(){
		
		String url = "https://newsapi.org/v2/top-headlines?country=in&apiKey=bcf0e8e59ceb4b92b1b40675b7463933";
		ResponseEntity<News> re = restTemplate.getForEntity(url, News.class);
		return re;
	}
}
