package com.graphql.mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;

import javax.servlet.Filter;

@SpringBootApplication
public class DemoGraphqlMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGraphqlMysqlApplication.class, args);
	}

	/**
	 * https://stackoverflow.com/questions/48037601/lazyinitializationexception-with-graphql-spring
	 * @return
	 */
	@Bean
	public Filter OpenFilter() {
		return new OpenEntityManagerInViewFilter();
	}
}
