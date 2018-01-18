package org.jinzhe.monitor.entity.mage;

import java.util.Date;

import org.jinzhe.monitor.entity.soul.BaseDto;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
* @ClassName: MageOrgInfo 
* @Description: 管理机构表
* @author GWJ
* @date 2017年12月1日 下午5:29:01 
*
 */
public class MageOrgInfo implements BaseDto{
	//主键
	private Long mageOrgId;
	//管理机构名称
	private String mageOrgName;
	//删除标记
	private Integer df;
	//创建时间
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date createTime;
	//修改时间
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date updateTime;
	//管理机构简称
	private String shortMageOrgName;
	
	/**
	 * @see 主键
	 */
	public Long getMageOrgId() {
		return mageOrgId;
	}
	/**
	 * @see 主键
	 */
	public void setMageOrgId(Long mageOrgId) {
		this.mageOrgId = mageOrgId;
	}
	/**
	 * @see 管理机构名称
	 */
	public String getMageOrgName() {
		return mageOrgName;
	}
	/**
	 * @see 管理机构名称
	 */
	public void setMageOrgName(String mageOrgName) {
		this.mageOrgName = mageOrgName;
	}
	/**
	 * @see 删除标记
	 */
	public Integer getDf() {
		return df;
	}
	/**
	 * @see 删除标记
	 */
	public void setDf(Integer df) {
		this.df = df;
	}
	/**
	 * @see 创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * @see 创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * @see 修改时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * @see 修改时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * @see 管理机构简称
	 */
	public String getShortMageOrgName() {
		return shortMageOrgName;
	}
	/**
	 * @see 管理机构简称
	 */
	public void setShortMageOrgName(String shortMageOrgName) {
		this.shortMageOrgName = shortMageOrgName;
	}
	
	@Override
	public String toString() {
		return "MageOrgInfo [mageOrgId=" + mageOrgId + ", mageOrgName="
				+ mageOrgName + ", df=" + df + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", shortMageOrgName="
				+ shortMageOrgName + "]";
	}
	
}
