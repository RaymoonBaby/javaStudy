package com.fs.business.domain;

import com.fs.common.annotation.Excel;
import com.fs.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 车辆分类对象 tb_car_cate
 * 
 * @author fs
 * @date 2021-03-27
 */
public class CarCate extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long cateId;

    /** 分类名称 */
    @Excel(name = "分类名称")
    private String cateName;

    /** 排序号 */
    @Excel(name = "排序号")
    private Long sort;

    /** 操作人 */
    @Excel(name = "操作人")
    private String sysUserId;

    /** 是否删除 0否 1是', */
    @Excel(name = "是否删除 0否 1是',")
    private Long isDelete;

    public void setCateId(Long cateId) 
    {
        this.cateId = cateId;
    }

    public Long getCateId() 
    {
        return cateId;
    }
    public void setCateName(String cateName) 
    {
        this.cateName = cateName;
    }

    public String getCateName() 
    {
        return cateName;
    }
    public void setSort(Long sort) 
    {
        this.sort = sort;
    }

    public Long getSort() 
    {
        return sort;
    }
    public void setSysUserId(String sysUserId) 
    {
        this.sysUserId = sysUserId;
    }

    public String getSysUserId() 
    {
        return sysUserId;
    }
    public void setIsDelete(Long isDelete) 
    {
        this.isDelete = isDelete;
    }

    public Long getIsDelete() 
    {
        return isDelete;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("cateId", getCateId())
            .append("cateName", getCateName())
            .append("sort", getSort())
            .append("createTime", getCreateTime())
            .append("sysUserId", getSysUserId())
            .append("isDelete", getIsDelete())
            .toString();
    }
}
