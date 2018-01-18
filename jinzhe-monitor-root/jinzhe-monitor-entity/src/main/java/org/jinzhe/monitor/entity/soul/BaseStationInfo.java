package org.jinzhe.monitor.entity.soul;

import org.jinzhe.monitor.entity.mage.MageOrgInfo;
import org.jinzhe.monitor.entity.station.StationType;
/**
 * 
* @ClassName: BaseStationInfo 
* @Description: 基础对象
* @author GWJ
* @date 2017年12月20日 下午2:18:08 
*
 */
public class BaseStationInfo {

	private StationType type;
	
	private MageOrgInfo info;

	public StationType getType() {
		return type;
	}

	public void setType(StationType type) {
		this.type = type;
	}

	public MageOrgInfo getInfo() {
		return info;
	}

	public void setInfo(MageOrgInfo info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "BaseInfo [type=" + type + ", info=" + info + "]";
	}

}
