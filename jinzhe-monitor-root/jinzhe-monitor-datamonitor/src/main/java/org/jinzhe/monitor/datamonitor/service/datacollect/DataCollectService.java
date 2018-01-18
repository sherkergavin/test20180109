package org.jinzhe.monitor.datamonitor.service.datacollect;

import java.util.List;

import org.jinzhe.monitor.datamonitor.mapper.huacun.HuaCunMapper;
import org.jinzhe.monitor.datamonitor.mapper.user.SUserMapper;
import org.jinzhe.monitor.entity.data.DetectionData;
import org.jinzhe.monitor.entity.data.OriginalData;
import org.jinzhe.monitor.entity.json.AjaxData;
import org.jinzhe.monitor.entity.user.SUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
* @ClassName: DataCollectService 
* @Description: 数据采集 
* @author GWJ
* @date 2017年11月21日 下午4:49:55 
*
 */
@RestController
public class DataCollectService {
	
	@Autowired
	private SUserMapper sUserMapper;
	
	@Autowired
	private HuaCunMapper huaCunMapper;
	
	
	@GetMapping(value="/dc/all",produces={"application/json;charset=UTF-8"})
	public List<SUser> listAll(){
	
		return sUserMapper.queryUserSummary();
		
	}
	
	@PostMapping(value="/dc/proces")
	public void processRomteDatalogic(@RequestBody AjaxData<List<DetectionData>> data){
		
	
		List<DetectionData> list = data.getData();
		
		for(DetectionData  d:list){
			
			System.out.println(d.toString());
			
		}	
	}
	
	@Transactional
	@PostMapping(value="/dc/orgidata")
	public void processDatalogic(@RequestBody AjaxData<List<OriginalData>> data){
				
		List<OriginalData> list = data.getData();

		huaCunMapper.putOriginalData(list);

		
	}
	
	
	
	
	
	
}
