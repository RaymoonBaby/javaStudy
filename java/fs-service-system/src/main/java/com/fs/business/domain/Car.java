package com.fs.business.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fs.common.annotation.Excel;
import com.fs.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 车辆登记对象 tb_car
 * 
 * @author fs
 * @date 2021-03-27
 */
public class Car extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long carId;

    /** 车牌号 */
    @Excel(name = "车牌号")
    private String carNumber;

    /** 车辆分类id */
    @Excel(name = "车辆分类id")
    private Long cateId;

    /** 车辆类型 */
    @Excel(name = "车辆类型")
    private String carType;

    /** 品牌 */
    @Excel(name = "品牌")
    private String brand;

    /** 型号 */
    @Excel(name = "型号")
    private String model;

    /** 座位数 */
    @Excel(name = "座位数")
    private Long seatNum;

    /** 燃油标号 */
    @Excel(name = "燃油标号")
    private String fuelLabel;

    /** 加油卡 */
    @Excel(name = "加油卡")
    private String gasCard;

    /** 发动机号 */
    @Excel(name = "发动机号")
    private String engineNumber;

    /** 购车日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "购车日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date carBuyTime;

    /** 车辆状态 关联数据字典(1正常 2维修/保养中 3扣押中  4丢失/报废) */
    @Excel(name = "车辆状态 关联数据字典(1正常 2维修/保养中 3扣押中  4丢失/报废)")
    private String carState;

    /** 购车价格(元) */
    @Excel(name = "购车价格(元)")
    private BigDecimal price;

    /** 平均油费(元/百公里) */
    @Excel(name = "平均油费(元/百公里)")
    private BigDecimal oilCost;

    /** 平均油耗(升/百公里) */
    @Excel(name = "平均油耗(升/百公里)")
    private BigDecimal oilConsumption;

    /** 管理员 */
    @Excel(name = "管理员")
    private String administrators;

    /** 驾驶员ID */
    @Excel(name = "驾驶员ID")
    private Long driverId;

    /** 排序号 */
    @Excel(name = "排序号")
    private Long sort;

    /** 备注 */
    private String note;

    /** 操作员 */
    @Excel(name = "操作员")
    private String sysUserId;

    /** 是否删除 0否 1是 */
    @Excel(name = "是否删除 0否 1是")
    private Long isDelete;

    /**
     * 扩展字段
     */
    private String cateName; //车辆分类
    private String driver; //司机


    public void setCarId(Long carId) 
    {
        this.carId = carId;
    }

    public Long getCarId() 
    {
        return carId;
    }
    public void setCarNumber(String carNumber) 
    {
        this.carNumber = carNumber;
    }

    public String getCarNumber() 
    {
        return carNumber;
    }
    public void setCateId(Long cateId) 
    {
        this.cateId = cateId;
    }

    public Long getCateId() 
    {
        return cateId;
    }
    public void setCarType(String carType) 
    {
        this.carType = carType;
    }

    public String getCarType() 
    {
        return carType;
    }
    public void setBrand(String brand) 
    {
        this.brand = brand;
    }

    public String getBrand() 
    {
        return brand;
    }
    public void setModel(String model) 
    {
        this.model = model;
    }

    public String getModel() 
    {
        return model;
    }
    public void setSeatNum(Long seatNum) 
    {
        this.seatNum = seatNum;
    }

    public Long getSeatNum() 
    {
        return seatNum;
    }
    public void setFuelLabel(String fuelLabel) 
    {
        this.fuelLabel = fuelLabel;
    }

    public String getFuelLabel() 
    {
        return fuelLabel;
    }
    public void setGasCard(String gasCard) 
    {
        this.gasCard = gasCard;
    }

    public String getGasCard() 
    {
        return gasCard;
    }
    public void setEngineNumber(String engineNumber) 
    {
        this.engineNumber = engineNumber;
    }

    public String getEngineNumber() 
    {
        return engineNumber;
    }
    public void setCarBuyTime(Date carBuyTime) 
    {
        this.carBuyTime = carBuyTime;
    }

    public Date getCarBuyTime() 
    {
        return carBuyTime;
    }
    public void setCarState(String carState) 
    {
        this.carState = carState;
    }

    public String getCarState() 
    {
        return carState;
    }
    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }
    public void setOilCost(BigDecimal oilCost) 
    {
        this.oilCost = oilCost;
    }

    public BigDecimal getOilCost() 
    {
        return oilCost;
    }
    public void setOilConsumption(BigDecimal oilConsumption) 
    {
        this.oilConsumption = oilConsumption;
    }

    public BigDecimal getOilConsumption() 
    {
        return oilConsumption;
    }
    public void setAdministrators(String administrators) 
    {
        this.administrators = administrators;
    }

    public String getAdministrators() 
    {
        return administrators;
    }
    public void setDriverId(Long driverId) 
    {
        this.driverId = driverId;
    }

    public Long getDriverId() 
    {
        return driverId;
    }
    public void setSort(Long sort) 
    {
        this.sort = sort;
    }

    public Long getSort() 
    {
        return sort;
    }
    public void setNote(String note) 
    {
        this.note = note;
    }

    public String getNote() 
    {
        return note;
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
            .append("carId", getCarId())
            .append("carNumber", getCarNumber())
            .append("cateId", getCateId())
            .append("carType", getCarType())
            .append("brand", getBrand())
            .append("model", getModel())
            .append("seatNum", getSeatNum())
            .append("fuelLabel", getFuelLabel())
            .append("gasCard", getGasCard())
            .append("engineNumber", getEngineNumber())
            .append("carBuyTime", getCarBuyTime())
            .append("carState", getCarState())
            .append("price", getPrice())
            .append("oilCost", getOilCost())
            .append("oilConsumption", getOilConsumption())
            .append("administrators", getAdministrators())
            .append("driverId", getDriverId())
            .append("sort", getSort())
            .append("note", getNote())
            .append("sysUserId", getSysUserId())
            .append("isDelete", getIsDelete())
            .append("createTime", getCreateTime())
            .toString();
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
}
