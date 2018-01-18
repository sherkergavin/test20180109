package org.jinzhe.monitor.web;

import java.nio.charset.Charset;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.StringHttpMessageConverter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * 
* @ClassName: WebApp 
* @Description: 主函数
* @author GWJ
* @date 2017年11月22日 下午3:13:23 
*
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication(scanBasePackages={"org.jinzhe.monitor.web.*"},exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class WebApp {

//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		
//		registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
//		registry.addResourceHandler("/templates/**").addResourceLocations("classpath:/templates/*/*.html");
//		
//	}
//
//	
	
	

	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer(){
		
		return new EmbeddedServletContainerCustomizer(){
			
			@Override
			public void customize(ConfigurableEmbeddedServletContainer container) {
				ErrorPage error404 = new ErrorPage(HttpStatus.NOT_FOUND,"/abnormal/notFound.html");
				container.addErrorPages(error404);
				
			}
		};
	}
	
	
	@Bean
	public HttpMessageConverters confHttpMessageConverters(){
		
		StringHttpMessageConverter stringConverter = new  StringHttpMessageConverter(Charset.forName("UTF-8"));
		
		FastJsonHttpMessageConverter jsonConverter = new FastJsonHttpMessageConverter(); 
		
		FastJsonConfig jsonConf = new FastJsonConfig();
		jsonConf.setSerializerFeatures(SerializerFeature.PrettyFormat);
		jsonConverter.setFastJsonConfig(jsonConf);

		return new HttpMessageConverters(stringConverter,jsonConverter);			
	}
	
	
	public static void main(String[] args){
		
		SpringApplication.run(WebApp.class, args);
	}
	
	
}
