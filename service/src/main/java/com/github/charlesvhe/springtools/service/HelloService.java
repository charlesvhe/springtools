package com.github.charlesvhe.springtools.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.charlesvhe.springtools.entity.ConfigItem;
import com.github.charlesvhe.springtools.repository.ConfigItemRepository;

@RestController
public class HelloService {

	@Autowired
	ObjectMapper objectMapper;

	@Autowired
	ConfigItemRepository configItemRepository;

	@GetMapping("/test")
	public List<ConfigItem> hello(@RequestParam(required = false) String name) {
		System.out.println("hello world!");
		if (name == null) {
			throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "name is required");
		}

		List<ConfigItem> result = configItemRepository.findAll();

		return result;
	}
}
