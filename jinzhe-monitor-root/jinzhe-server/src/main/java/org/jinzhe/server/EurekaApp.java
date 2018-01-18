package org.jinzhe.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
* @ClassName: EurekaApp 
* @Description: eureka server
* @author GWJ
* @date 2017年11月21日 上午11:55:06 
*
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApp 
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaApp.class, args);
    }
}
