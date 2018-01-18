package org.jinzhe.monitor.earlywarning.mapper.deployment;

import java.util.List;

import org.jinzhe.monitor.entity.deployment.DeployMent;


public interface SDeploymentMapper {

	public List<DeployMent> queryDeployMentSummary();
	
}
