package org.jinzhe.monitor.schedule;

import java.nio.charset.Charset;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * 
* @ClassName: ScheduleApp 
* @Description: schedule 
* @author GWJ
* @date 2017年11月24日 上午11:17:44 
*
 */

@EnableEurekaClient
@EnableScheduling
@SpringBootApplication(scanBasePackages={"org.jinzhe.monitor.schedule.*"},exclude={MybatisAutoConfiguration.class,DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class ScheduleApp 
{
    
	@Bean
	public HttpMessageConverters confHttpMessageConverters(){
		
		StringHttpMessageConverter stringConverter = new  StringHttpMessageConverter(Charset.forName("UTF-8"));
		
		FastJsonHttpMessageConverter jsonConverter = new FastJsonHttpMessageConverter(); 
		
		FastJsonConfig jsonConf = new FastJsonConfig();
		jsonConf.setSerializerFeatures(SerializerFeature.PrettyFormat);
		jsonConverter.setFastJsonConfig(jsonConf);

		return new HttpMessageConverters(stringConverter);			
	}
	
	
	public static void main( String[] args )
    {
       SpringApplication.run(ScheduleApp.class, args);
    }
}
