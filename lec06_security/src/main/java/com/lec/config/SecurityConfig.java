package com.lec.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private  BoardUserDetailService boardUserDetailService;
	
	@Override
	protected void configure(HttpSecurity security) throws Exception {
//		security.authorizeRequests().antMatchers("/").permitAll();
//		security.authorizeRequests().antMatchers("/member/**").authenticated();
//		security.authorizeRequests().antMatchers("/manager/**").hasRole("MANAGER");
//		security.authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN");
		
		security.authorizeRequests().antMatchers("/").permitAll()
		.antMatchers("/member/**").authenticated()
		.antMatchers("/manager/**").hasRole("MANAGER")
		.antMatchers("/admin/**").hasRole("ADMIN");
		
		security.csrf().disable();
		security.formLogin().loginPage("/login").defaultSuccessUrl("/loginSuccess"); // formLogin 메서드는 form태그기반의 로그인을 지원한다는 설정
							  // 에러화면이 아니라 스프링부트가 제공하는 로그인화면으로 이동
							  // 스프링부트의 로그인화면이 아니라 사용자로그인화면을 제공할 경우는 loginPage()메서드를 추가
		
		security.exceptionHandling().accessDeniedPage("/accessDenied"); // 접근권한없음 페이지
		security.logout().invalidateHttpSession(true).logoutSuccessUrl("/login");
		
		security.userDetailsService(boardUserDetailService);
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}
	
	// 스프링시큐리티에서 제공하는 기본사용자와 비밀번호
	// 사용자   : user
	// 비밀번호 : Using generated security password: b5bfcdaf-8b6d-4057-b5ab-95da6087fb7f
//	@Autowired // AuthenticationManagerBuilder 를 의존성주입,
//	private void authenticate(AuthenticationManagerBuilder auth) throws Exception{
//		
//		auth.inMemoryAuthentication()  // 로그인정보를 memory에 저장하는 메서드
//			.withUser("manager")
//			.password("{noop}12345") //{noop}는 스프링이 문자그대로 비밀번호로 인식하게 하는 옵션
//			.roles("MANAGER");
//		
//		
//		auth.inMemoryAuthentication()
//		.withUser("admin")
//		.password("{noop}12345") //{noop}는 스프링이 문자그대로 비밀번호로 인식하게 하는 옵션
//		.roles("ADMIN");
//
//	}
//	@Autowired
//	private DataSource dataSource;
//	
//	@Autowired // AuthenticationManagerBuilder 를 의존성주입,
//	private void authenticate(AuthenticationManagerBuilder auth) throws Exception{	
//		String sql1 = "select id username, concat('{noop}', password) password, true enabled from member where id = ? ";
//		String sql2 = "select id, role from member where id = ? ";
//		
//		// 스프링시큐리티는 기본적으로 username, password로 고정되어 있다.
//		auth.jdbcAuthentication()
//			.dataSource(dataSource)
//			.usersByUsernameQuery(sql1)
//			.authoritiesByUsernameQuery(sql2);
//}	
	
}
