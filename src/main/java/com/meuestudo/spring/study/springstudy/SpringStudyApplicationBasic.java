package com.meuestudo.spring.study.springstudy;

import com.meuestudo.spring.study.springstudy.basic.BinarySearchImpl;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan
public class SpringStudyApplicationBasic {

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSort());
		//int result = binarySearch.binarySearch(new int[] {1,2,4,5,6}, 6);
		//System.out.println(result);
		//application context
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringStudyApplicationBasic.class); //SpringApplication.run(SpringStudyApplicationBasic.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {1,2,4,5,6}, 6);
		System.out.println(result);
	}
}
