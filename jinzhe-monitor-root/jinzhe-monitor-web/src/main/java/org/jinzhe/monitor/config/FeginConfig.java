package org.jinzhe.monitor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Contract;
import feign.Logger;

/**
 * 
* @ClassName: FeginConfig 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author GWJ
* @date 2017年11月22日 下午1:48:49 
*
 */
@Configuration
public class FeginConfig {

	
   @Bean
   public Contract feignContract() {
      return new feign.Contract.Default();
   }
	
	
	@Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
	
	
}
