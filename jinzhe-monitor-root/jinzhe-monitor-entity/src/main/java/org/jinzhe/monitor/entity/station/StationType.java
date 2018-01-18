package org.jinzhe.monitor.entity.station;

import java.util.Date;

import org.jinzhe.monitor.entity.soul.BaseDto;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
* @ClassName: StationType 
* @Description: 站点类型表
* @author GWJ
* @date 2017年12月1日 下午5:00:16 
*
 */
public class StationType implements BaseDto {
	//主键
 	private Long stationTypeId;
 	//站点类型名称
 	private String stationTypeName;
	//站点大类代码
 	private Long stationTypePid;
	//站点大类名
 	private String parentName;
 	//备注
 	private String remark;
	//删除标记
 	private Integer df;
	//排序
 	private Integer sort;
	//创建时间
 	@JSONField(format="yyyy-MM-dd HH:mm:ss")
 	private Date createTime;
	//修改时间
 	@JSONField(format="yyyy-MM-dd HH:mm:ss")
 	private Date updateTime;
 	//备用字段1
 	private String def1;
 	
 	/**
 	 * @see 主键
 	 */
	public Long getStationTypeId() {
		return stationTypeId;
	}
	/**
 	 * @see 主键
 	 */
	public void setStationTypeId(Long stationTypeId) {
		this.stationTypeId = stationTypeId;
	}
	/**
 	 * @see 站点类型名称
 	 */
	public String getStationTypeName() {
		return stationTypeName;
	}
	/**
 	 * @see 站点类型名称
 	 */
	public void setStationTypeName(String stationTypeName) {
		this.stationTypeName = stationTypeName;
	}
	/**
 	 * @see 站点大类代码
 	 */
	public Long getStationTypePid() {
		return stationTypePid;
	}
	/**
 	 * @see 站点大类代码
 	 */
	public void setStationTypePid(Long stationTypePid) {
		this.stationTypePid = stationTypePid;
	}
	/** 
 	 * @see 站点大类名
 	 */
	public String getParentName() {
		return parentName;
	}
	/**
 	 * @see 站点大类名
 	 */
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	/**
 	 * @see 备注
 	 */
	public String getRemark() {
		return remark;
	}
	/**
 	 * @see 备注
 	 */
	public void setRemark(String remark) {
		this.remark = remark;
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
 	 * @see 排序
 	 */
	public Integer getSort() {
		return sort;
	}
	/**
 	 * @see 排序
 	 */
	public void setSort(Integer sort) {
		this.sort = sort;
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
 	 * @see 备用字段1
 	 */
	public String getDef1() {
		return def1;
	}
	/**
 	 * @see 备用字段1
 	 */
	public void setDef1(String def1) {
		this.def1 = def1;
	}	
	
	@Override
	public String toString() {
		return "StationType [stationTypeId=" + stationTypeId
				+ ", stationTypeName=" + stationTypeName + ", stationTypePid="
				+ stationTypePid + ", parentName=" + parentName + ", remark="
				+ remark + ", df=" + df + ", sort=" + sort + ", createTime="
				+ createTime + ", updateTime=" + updateTime + ", def1=" + def1
				+ "]";
	}

}
