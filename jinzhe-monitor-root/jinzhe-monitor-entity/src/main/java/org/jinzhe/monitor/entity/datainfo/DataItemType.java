package org.jinzhe.monitor.entity.datainfo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
* @ClassName: DataItemType 
* @Description: 数据类型表
* @author GWJ
* @date 2017年12月20日 上午11:00:08 
*
 */
public class DataItemType {
	//主键
	private Long itemTypeId;
	//数据类型名称
	private String itemTypeName;
	//数据项大类ID
	private Long itemPtypeId;
	//数据项大类名称
	private String itemPtypeName;
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
	 * @see 主鍵
	 */
	public Long getItemTypeId() {
		return itemTypeId;
	}
	/**
	 * @see 主鍵
	 */
	public void setItemTypeId(Long itemTypeId) {
		this.itemTypeId = itemTypeId;
	}
	/**
	 * @see 数据类型名称
	 */
	public String getItemTypeName() {
		return itemTypeName;
	}
	/**
	 * @see 数据类型名称
	 */
	public void setItemTypeName(String itemTypeName) {
		this.itemTypeName = itemTypeName;
	}
	/**
	 * @see 数据项大类ID
	 */
	public Long getItemPtypeId() {
		return itemPtypeId;
	}
	/**
	 * @see 数据项大类ID
	 */
	public void setItemPtypeId(Long itemPtypeId) {
		this.itemPtypeId = itemPtypeId;
	}
	/**
	 * @see 数据项大类名称
	 */
	public String getItemPtypeName() {
		return itemPtypeName;
	}
	/**
	 * @see 数据项大类名称
	 */
	public void setItemPtypeName(String itemPtypeName) {
		this.itemPtypeName = itemPtypeName;
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
		return "DataItemType [itemTypeId=" + itemTypeId + ", itemTypeName="
				+ itemTypeName + ", itemPtypeId=" + itemPtypeId
				+ ", itemPtypeName=" + itemPtypeName + ", df=" + df + ", sort="
				+ sort + ", createTime=" + createTime + ", updateTime="
				+ updateTime + ", def1=" + def1 + "]";
	}
	
}
