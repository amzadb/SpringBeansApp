package com.spring.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

	@Bean
	public IPLService getIPLService() {
		return new IPLServiceImpl();
	}
}
