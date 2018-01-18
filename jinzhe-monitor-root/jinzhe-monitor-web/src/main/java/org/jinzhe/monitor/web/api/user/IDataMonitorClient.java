package org.jinzhe.monitor.web.api.user;

import java.util.List;

import org.jinzhe.monitor.config.FeginConfig;
import org.jinzhe.monitor.entity.user.SUser;
import org.springframework.cloud.netflix.feign.FeignClient;

import feign.RequestLine;

/**
 * 
* @ClassName: IDataMonitorClient 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author GWJ
* @date 2017年11月22日 下午3:14:01 
*
 */
//@FeignClient(name="jinzhe-monitor-datamonitor",configuration=FeginConfig.class)
@FeignClient(name="jinzhe-monitor-getway",configuration=FeginConfig.class)
public interface IDataMonitorClient {


	@RequestLine("GET /datamonitor/dc/all")
	public List<SUser> listAll(); 
	
	
}
