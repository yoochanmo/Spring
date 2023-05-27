package com.lec;
/*
 	Application을 실행하는 3가지 방법
 	
 	WebApplication.Type.NONE : Java Application
 	WebApplication.Type.SERVLET : Web Application
 	WebApplication.Type.REACTIVE
 	 - spring 5.0에 추가된 비동기(Asynchronouse)처리와 
 	 - Non-Blocking IO를 지원하는 웹플럭스(Webflux)를 적용할 때 사용
 	
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lec01BasicApplication {

	public static void main(String[] args) {
		 SpringApplication.run(Lec01BasicApplication.class, args);
//		SpringApplication application = new SpringApplication(Lec01BasicApplication.class);
//		application.setWebApplicationType(WebApplicationType.SERVLET);
//		application.run(args);
	}

}
