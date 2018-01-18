package org.jinzhe.monitor.entity.station;

import java.util.Date;

import org.jinzhe.monitor.entity.soul.BaseStationInfo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
* @ClassName: StationInfo 
* @Description: 站点信息表
* @author GWJ
* @date 2017年12月1日 下午5:00:34 
*
 */
public class StationInfo extends BaseStationInfo {
	//主键
	private Long stationId;
	//站点名称
	private String stationName;
	//站点类型
	private Long stationTypeId;
	//地址
	private String address;
	//坐标X
	private Long coordinateX;
	//坐标Y
	private Long coordinateY;
	//管理机构
	private Long mageOrgId;
	//行政区划
	private Long divisionId;
	//拼音
	private String pinYinCode;
	//原始编号
	private Long oldId;
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
	//备用1
	private String def1;
	//备用2
	private String def2;
	//备用3
	private String def3;
	//水源系统
	private Long wsSysId;
	//图形类别
	private String graphType;
	//图形站点编码
	private String featId;
	//供水能力
	private Long waterSupply;
	//站点停复役状态
	private Long stationStatus;
	
	/**
	 * @see 主键
	 */
	public Long getStationId() {
		return stationId;
	}
	/**
	 * @see 主键
	 */
	public void setStationId(Long stationId) {
		this.stationId = stationId;
	}
	/**
	 * @see 站点名称
	 */
	public String getStationName() {
		return stationName;
	}
	/**
	 * @see 站点名称
	 */
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	/**
	 * @see 站点类型
	 */
	public Long getStationTypeId() {
		return stationTypeId;
	}
	/**
	 * @see 站点类型
	 */
	public void setStationTypeId(Long stationTypeId) {
		this.stationTypeId = stationTypeId;
	}
	/**
	 * @see 地址
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @see 地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @see 坐标X
	 */
	public Long getCoordinateX() {
		return coordinateX;
	}
	/**
	 * @see 坐标X
	 */
	public void setCoordinateX(Long coordinateX) {
		this.coordinateX = coordinateX;
	}
	/**
	 * @see 坐标Y
	 */
	public Long getCoordinateY() {
		return coordinateY;
	}
	/**
	 * @see 坐标Y
	 */
	public void setCoordinateY(Long coordinateY) {
		this.coordinateY = coordinateY;
	}
	/**
	 * @see 管理机构
	 */
	public Long getMageOrgId() {
		return mageOrgId;
	}
	/**
	 * @see 管理机构
	 */
	public void setMageOrgId(Long mageOrgId) {
		this.mageOrgId = mageOrgId;
	}
	/**
	 * @see 行政区划
	 */
	public Long getDivisionId() {
		return divisionId;
	}
	/**
	 * @see 行政区划
	 */
	public void setDivisionId(Long divisionId) {
		this.divisionId = divisionId;
	}
	/**
	 * @see 拼音
	 */
	public String getPinYinCode() {
		return pinYinCode;
	}
	/**
	 * @see 拼音
	 */
	public void setPinYinCode(String pinYinCode) {
		this.pinYinCode = pinYinCode;
	}
	/**
	 * @see 原始编号
	 */
	public Long getOldId() {
		return oldId;
	}
	/**
	 * @see 原始编号
	 */
	public void setOldId(Long oldId) {
		this.oldId = oldId;
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
	 * @see 备用1
	 */
	public String getDef1() {
		return def1;
	}
	/**
	 * @see 备用1
	 */
	public void setDef1(String def1) {
		this.def1 = def1;
	}
	/**
	 * @see 备用2
	 */
	public String getDef2() {
		return def2;
	}
	/**
	 * @see 备用2
	 */
	public void setDef2(String def2) {
		this.def2 = def2;
	}
	/**
	 * @see 备用3
	 */
	public String getDef3() {
		return def3;
	}
	/**
	 * @see 备用3
	 */
	public void setDef3(String def3) {
		this.def3 = def3;
	}
	/**
	 * @see 水源系统
	 */
	public Long getWsSysId() {
		return wsSysId;
	}
	/**
	 * @see 水源系统
	 */
	public void setWsSysId(Long wsSysId) {
		this.wsSysId = wsSysId;
	}
	/**
	 * @see 图形类别
	 */
	public String getGraphType() {
		return graphType;
	}
	/**
	 * @see 图形类别
	 */
	public void setGraphType(String graphType) {
		this.graphType = graphType;
	}
	/**
	 * @see 图形站点编码
	 */
	public String getFeatId() {
		return featId;
	}
	/**
	 * @see 图形站点编码
	 */
	public void setFeatId(String featId) {
		this.featId = featId;
	}
	/**
	 * @see 供水能力
	 */
	public Long getWaterSupply() {
		return waterSupply;
	}
	/**
	 * @see 供水能力
	 */
	public void setWaterSupply(Long waterSupply) {
		this.waterSupply = waterSupply;
	}
	/**
	 * @see 站点停复役状态
	 */
	public Long getStationStatus() {
		return stationStatus;
	}
	/** 
	 * @see 站点停复役状态
	 */
	public void setStationStatus(Long stationStatus) {
		this.stationStatus = stationStatus;
	}
	
	@Override
	public String toString() {
		return "StationInfo [stationId=" + stationId + ", stationName="
				+ stationName + ", stationTypeId=" + stationTypeId
				+ ", address=" + address + ", coordinateX=" + coordinateX
				+ ", coordinateY=" + coordinateY + ", mageOrgId=" + mageOrgId
				+ ", divisionId=" + divisionId + ", pinYinCode=" + pinYinCode
				+ ", oldId=" + oldId + ", remark=" + remark + ", df=" + df
				+ ", sort=" + sort + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", def1=" + def1 + ", def2="
				+ def2 + ", def3=" + def3 + ", wsSysId=" + wsSysId
				+ ", graphType=" + graphType + ", featId=" + featId
				+ ", waterSupply=" + waterSupply + ", stationsStatus="
				+ stationStatus + "]";
	}
	
}
