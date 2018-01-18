package org.jinzhe.monitor.web.controller.user;


import java.util.List;

import org.jinzhe.monitor.entity.deployment.DeployMent;
import org.jinzhe.monitor.web.api.deployment.IEarlyWarningClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 
* @ClassName: UserInfoController 
* @Description: userinfo controller
* @author GWJ
* @date 2017年10月31日 下午1:58:31 
*
 */
@Controller
@RequestMapping(value="/u",produces={"application/json;charset=UTF-8"})
public class UserInfoController  {
	

	@Autowired
	private IEarlyWarningClient earlyWarningClient;
	
	
	@ResponseBody
	@RequestMapping(value="/all")
	public List<DeployMent> queryUserInfo(){
		
		System.out.println("11111111");
		
		return earlyWarningClient.listAll();
	
	}
	
	@RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("name", "Dear");
        return "main";
    }

}
