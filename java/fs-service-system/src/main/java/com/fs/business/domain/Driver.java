package com.fs.business.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fs.common.annotation.Excel;
import com.fs.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 驾驶员登记对象 tb_driver
 * 
 * @author fs
 * @date 2021-03-28
 */
public class Driver extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long driverId;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 手机号 */
    @Excel(name = "手机号")
    private String mobile;

    /** 初次领证日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "初次领证日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date certTime;

    /** 驾驶证有效期开始日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "驾驶证有效期开始日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date effectiveStartTime;

    /** 驾驶证有效期结束日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "驾驶证有效期结束日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date effectiveEndTime;

    /** 准驾车型 */
    @Excel(name = "准驾车型")
    private String driverModel;

    /** 排序号 */
    @Excel(name = "排序号")
    private Long sort;

    /** 操作员 */
    @Excel(name = "操作员")
    private String sysUserId;

    /** 是否删除 0否 1是 */
    @Excel(name = "是否删除 0否 1是")
    private Long isDelete;

    public void setDriverId(Long driverId) 
    {
        this.driverId = driverId;
    }

    public Long getDriverId() 
    {
        return driverId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setMobile(String mobile) 
    {
        this.mobile = mobile;
    }

    public String getMobile() 
    {
        return mobile;
    }
    public void setCertTime(Date certTime) 
    {
        this.certTime = certTime;
    }

    public Date getCertTime() 
    {
        return certTime;
    }
    public void setEffectiveStartTime(Date effectiveStartTime) 
    {
        this.effectiveStartTime = effectiveStartTime;
    }

    public Date getEffectiveStartTime() 
    {
        return effectiveStartTime;
    }
    public void setEffectiveEndTime(Date effectiveEndTime) 
    {
        this.effectiveEndTime = effectiveEndTime;
    }

    public Date getEffectiveEndTime() 
    {
        return effectiveEndTime;
    }
    public void setDriverModel(String driverModel) 
    {
        this.driverModel = driverModel;
    }

    public String getDriverModel() 
    {
        return driverModel;
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
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("driverId", getDriverId())
            .append("userId", getUserId())
            .append("name", getName())
            .append("mobile", getMobile())
            .append("certTime", getCertTime())
            .append("effectiveStartTime", getEffectiveStartTime())
            .append("effectiveEndTime", getEffectiveEndTime())
            .append("driverModel", getDriverModel())
            .append("sort", getSort())
            .append("sysUserId", getSysUserId())
            .append("isDelete", getIsDelete())
            .append("createTime", getCreateTime())
            .toString();
    }
}
