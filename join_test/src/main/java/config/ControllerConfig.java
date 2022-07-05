package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import controller.MvcController;

@Configuration
public class ControllerConfig {

	@Bean
	public MvcController mvcController() {
		return new MvcController();
	}
}
