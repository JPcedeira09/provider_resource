package br.com.motorize.provider_resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
@EnableHystrix
public class ProviderResourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderResourceApplication.class, args);
	}
}
