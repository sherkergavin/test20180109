package org.jinzhe.monitor.entity.user;
/**
 * 
* @ClassName: SUser 
* @Description: Oracle 中的实体
* @author GWJ
* @date 2017年11月17日 下午2:58:52 
*
 */
public class SUser {

	private String uId;
	
	private String version;
	
	private String userName;
	
	private String staffClass;

	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getStaffClass() {
		return staffClass;
	}

	public void setStaffClass(String staffClass) {
		this.staffClass = staffClass;
	}

	@Override
	public String toString() {
		return "SUser [uId=" + uId + ", version=" + version + ", userName="
				+ userName + ", staffClass=" + staffClass + "]";
	}
	
}
