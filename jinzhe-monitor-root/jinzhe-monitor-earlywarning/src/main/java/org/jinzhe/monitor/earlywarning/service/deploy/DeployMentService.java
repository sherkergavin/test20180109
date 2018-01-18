package org.jinzhe.monitor.earlywarning.service.deploy;

import java.util.List;

import org.jinzhe.monitor.earlywarning.mapper.deployment.SDeploymentMapper;
import org.jinzhe.monitor.entity.deployment.DeployMent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeployMentService {

	@Autowired(required=false)
	private SDeploymentMapper deploymentMapper;
	
	@GetMapping(value="/ew/all",produces={"application/json;charset=UTF-8"})
	public List<DeployMent> listAll(){
		
		return deploymentMapper.queryDeployMentSummary();
		
	}
	
	
}
