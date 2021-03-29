package com.fs.business.service;

import java.util.List;
import com.fs.business.domain.Driver;

/**
 * 驾驶员登记Service接口
 * 
 * @author fs
 * @date 2021-03-28
 */
public interface IDriverService 
{
    /**
     * 查询驾驶员登记
     * 
     * @param driverId 驾驶员登记ID
     * @return 驾驶员登记
     */
    public Driver selectDriverById(Long driverId);

    /**
     * 查询驾驶员登记列表
     * 
     * @param driver 驾驶员登记
     * @return 驾驶员登记集合
     */
    public List<Driver> selectDriverList(Driver driver);

    /**
     * 新增驾驶员登记
     * 
     * @param driver 驾驶员登记
     * @return 结果
     */
    public int insertDriver(Driver driver);

    /**
     * 修改驾驶员登记
     * 
     * @param driver 驾驶员登记
     * @return 结果
     */
    public int updateDriver(Driver driver);

    /**
     * 批量删除驾驶员登记
     * 
     * @param driverIds 需要删除的驾驶员登记ID
     * @return 结果
     */
    public int deleteDriverByIds(Long[] driverIds);

    /**
     * 删除驾驶员登记信息
     * 
     * @param driverId 驾驶员登记ID
     * @return 结果
     */
    public int deleteDriverById(Long driverId);
}
