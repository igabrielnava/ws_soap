package com.hrms.security;

import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.soap.security.xwss.XwsSecurityInterceptor;
import org.springframework.ws.soap.security.xwss.callback.SimplePasswordValidationCallbackHandler;

@Configuration
public class SecurityConfig extends WsConfigurerAdapter{
	
//	@Bean
//	public PayloadLoggingInterceptor payloadLoggingInterceptor() {
//		
//		return new PayloadLoggingInterceptor();
//		
//	}
//	
//	@Bean
//	public PayloadValidatingInterceptor payloadValidatinginterceptor() {
//		final  PayloadValidatingInterceptor payloadValiditingInterceptor = new PayloadValidatingInterceptor();
//		payloadValiditingInterceptor.setSchema(new ClassPathResource("employee.xsd"));
//		
//		return payloadValiditingInterceptor;
//		
//	}
	
	@Bean
	public XwsSecurityInterceptor requestInterceptor() {
		
		XwsSecurityInterceptor interceptor = new XwsSecurityInterceptor();
		interceptor.setCallbackHandler(callbackHandler());
		
		interceptor.setPolicyConfiguration(new ClassPathResource("securityPolicy.xml"));
		
		return interceptor;
	}
	
	@Bean
	public SimplePasswordValidationCallbackHandler callbackHandler() {
		
		SimplePasswordValidationCallbackHandler handler = new SimplePasswordValidationCallbackHandler();
		handler.setUsersMap(Collections.singletonMap("admin", "password"));
		
		return handler;
		
	}
	
	@Override
	public void addInterceptors(List<EndpointInterceptor> interceptors) {
//		interceptors.add(payloadLoggingInterceptor());
//		interceptors.add(payloadValidatinginterceptor());
		interceptors.add(requestInterceptor());
	}
	
	
}