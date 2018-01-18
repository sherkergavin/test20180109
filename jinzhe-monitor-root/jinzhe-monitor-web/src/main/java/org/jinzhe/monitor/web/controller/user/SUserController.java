package org.jinzhe.monitor.web.controller.user;

import java.util.List;



import org.jinzhe.monitor.entity.user.SUser;
import org.jinzhe.monitor.web.api.user.IDataMonitorClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
* @ClassName: SUserController 
* @Description: controller
* @author GWJ
* @date 2017年11月17日 下午3:07:55 
*
 */
@Controller
@RequestMapping(value="/su",produces={"application/json;charset=UTF-8"})
public class SUserController {

	
	
	@Autowired
	private IDataMonitorClient dataMonitorClient;
	
	
	@ResponseBody
	@RequestMapping(value="/all")
	public List<SUser> queryUserInfo(){
		
		List<SUser> uList = dataMonitorClient.listAll();
		
		return uList;
	}
	
}
