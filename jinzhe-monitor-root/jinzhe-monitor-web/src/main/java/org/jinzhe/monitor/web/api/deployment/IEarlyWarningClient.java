package org.jinzhe.monitor.web.api.deployment;

import java.util.List;

import org.jinzhe.monitor.config.FeginConfig;
import org.jinzhe.monitor.entity.deployment.DeployMent;
import org.springframework.cloud.netflix.feign.FeignClient;

import feign.RequestLine;

//@FeignClient(name="jinzhe-monitor-earlywarning",configuration=FeginConfig.class)
@FeignClient(name="jinzhe-monitor-getway",configuration=FeginConfig.class)
public interface IEarlyWarningClient {

	@RequestLine("GET /earlywarning/ew/all")
	public List<DeployMent> listAll();
	
}
