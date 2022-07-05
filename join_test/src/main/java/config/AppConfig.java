package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dao.Dao;

@Configuration
public class AppConfig {
	
	@Bean
	public Dao dao() {
		return new Dao();
	}
}
