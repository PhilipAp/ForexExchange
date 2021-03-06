package com.philipap.currencyconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.philipap.currencyconversion")
public class ForexCurrencyConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForexCurrencyConsumerApplication.class, args);
	}
}
