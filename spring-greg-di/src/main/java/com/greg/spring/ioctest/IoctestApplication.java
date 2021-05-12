package com.greg.spring.ioctest;

import com.greg.spring.ioctest.configs.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class IoctestApplication {

	public static void main(String[] args) {
		//SpringApplication.run(IoctestApplication.class, args);
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(AppConfig.class);

		/**
		 * Spring Bean
		 * 1. Scan
		 * 2. Parse
		 * 3. 调用扩展
		 * 4. 遍历map validate
		 * 5. new
		 */
		applicationContext.getBean("indexService");

		//applicationContext.getBeanDefinitionNames(): Get all beans
		//System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));

	}

}
