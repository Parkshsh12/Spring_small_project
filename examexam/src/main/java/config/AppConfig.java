package config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dao.Dao;

@Configuration
public class AppConfig {
	
	@Autowired
	private DataSource dataSource;
	
	@Bean
	public Dao dao() {
		return new Dao(dataSource);
	}
}
