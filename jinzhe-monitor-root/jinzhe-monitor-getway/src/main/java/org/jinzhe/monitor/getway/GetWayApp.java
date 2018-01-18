package org.jinzhe.monitor.getway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 
* @ClassName: GetWayApp 
* @Description: getway
* @author GWJ
* @date 2017年11月30日 下午1:53:31 
*
 */
@EnableZuulProxy
@SpringBootApplication
public class GetWayApp 
{
    public static void main( String[] args )
    {
        SpringApplication.run(GetWayApp.class, args);
    }
}
