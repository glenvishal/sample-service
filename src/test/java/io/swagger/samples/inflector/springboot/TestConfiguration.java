package io.swagger.samples.inflector.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestTemplate;

@Configuration
public class TestConfiguration {
	@Bean
	@Profile("restApi")
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
