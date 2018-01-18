package org.jinzhe.monitor.entity.deployment;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
* @ClassName: DeployMent 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author GWJ
* @date 2017年11月22日 下午3:46:25 
*
 */
public class DeployMent {

	private String dataItemID;
	
	private String dataVal;
	
	@JSONField(format="yyyy-MM-dd")
	private Date dataTime;

	
	public String getDataItemID() {
		return dataItemID;
	}


	public void setDataItemID(String dataItemID) {
		this.dataItemID = dataItemID;
	}


	public String getDataVal() {
		return dataVal;
	}


	public void setDataVal(String dataVal) {
		this.dataVal = dataVal;
	}


	public Date getDataTime() {
		return dataTime;
	}


	public void setDataTime(Date dataTime) {
		this.dataTime = dataTime;
	}


	@Override
	public String toString() {
		return "DeployMent [dataItemID=" + dataItemID + ", dataVal=" + dataVal
				+ ", dataTime=" + dataTime + "]";
	}

	
}
