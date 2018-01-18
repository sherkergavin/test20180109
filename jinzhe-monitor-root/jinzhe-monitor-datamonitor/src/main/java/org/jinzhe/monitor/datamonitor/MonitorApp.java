package org.jinzhe.monitor.datamonitor;

import java.nio.charset.Charset;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * 
* @ClassName: MonitorApp 
* @Description: 数据 监控
* @author GWJ
* @date 2017年11月21日 下午4:42:57 
*
 */
@EnableEurekaClient
@SpringBootApplication(scanBasePackages="org.jinzhe.monitor.datamonitor.*")
public class MonitorApp 
{
	
	@Bean
	public HttpMessageConverters confHttpMessageConverters(){
		
		StringHttpMessageConverter stringConverter = new  StringHttpMessageConverter(Charset.forName("UTF-8"));
		
		FastJsonHttpMessageConverter jsonConverter = new FastJsonHttpMessageConverter(); 
		
		FastJsonConfig jsonConf = new FastJsonConfig();
		jsonConf.setSerializerFeatures(SerializerFeature.PrettyFormat);
		jsonConverter.setFastJsonConfig(jsonConf);

		return new HttpMessageConverters(stringConverter,jsonConverter);			
	}
	
	
	
	
    public static void main( String[] args )
    {
        SpringApplication.run(MonitorApp.class, args);
    }
}
