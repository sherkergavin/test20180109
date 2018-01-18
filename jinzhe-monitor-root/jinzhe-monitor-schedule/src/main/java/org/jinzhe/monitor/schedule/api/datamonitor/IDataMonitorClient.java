package org.jinzhe.monitor.schedule.api.datamonitor;

import java.util.List;

import org.jinzhe.monitor.config.FeginConfig;
import org.jinzhe.monitor.entity.data.DetectionData;
import org.jinzhe.monitor.entity.data.OriginalData;
import org.jinzhe.monitor.entity.json.AjaxData;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;

import feign.RequestLine;
/**
 * 
* @ClassName: IDataMonitorClient 
* @Description: feignClient
* @author GWJ
* @date 2017年11月27日 上午9:40:02 
*
 */
@FeignClient(name="jinzhe-monitor-datamonitor",configuration=FeginConfig.class)
public interface IDataMonitorClient {

	
	@RequestLine("POST /dc/proces")
	public String sendData(@RequestBody  AjaxData<List<DetectionData>> data);
	
	
	
	@RequestLine("POST /dc/orgidata")
	public String putData(@RequestBody  AjaxData<List<OriginalData>> data);
	
	
}
