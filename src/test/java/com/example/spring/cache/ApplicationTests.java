package com.example.spring.cache;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
	@Autowired
	private CacheService cacheService;

	@Test
	void test2() {
		cacheService.foo();
		cacheService.foo();
		cacheService.foo();
		cacheService.foo();
		cacheService.foo();
		cacheService.foo();
	}

}
