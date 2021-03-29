package com.fs.business.service.impl;

import java.util.List;
import com.fs.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fs.business.mapper.DriverMapper;
import com.fs.business.domain.Driver;
import com.fs.business.service.IDriverService;

/**
 * 驾驶员登记Service业务层处理
 * 
 * @author fs
 * @date 2021-03-28
 */
@Service
public class DriverServiceImpl implements IDriverService 
{
    @Autowired
    private DriverMapper driverMapper;

    /**
     * 查询驾驶员登记
     * 
     * @param driverId 驾驶员登记ID
     * @return 驾驶员登记
     */
    @Override
    public Driver selectDriverById(Long driverId)
    {
        return driverMapper.selectDriverById(driverId);
    }

    /**
     * 查询驾驶员登记列表
     * 
     * @param driver 驾驶员登记
     * @return 驾驶员登记
     */
    @Override
    public List<Driver> selectDriverList(Driver driver)
    {
        return driverMapper.selectDriverList(driver);
    }

    /**
     * 新增驾驶员登记
     * 
     * @param driver 驾驶员登记
     * @return 结果
     */
    @Override
    public int insertDriver(Driver driver)
    {
        driver.setCreateTime(DateUtils.getNowDate());
        return driverMapper.insertDriver(driver);
    }

    /**
     * 修改驾驶员登记
     * 
     * @param driver 驾驶员登记
     * @return 结果
     */
    @Override
    public int updateDriver(Driver driver)
    {
        return driverMapper.updateDriver(driver);
    }

    /**
     * 批量删除驾驶员登记
     * 
     * @param driverIds 需要删除的驾驶员登记ID
     * @return 结果
     */
    @Override
    public int deleteDriverByIds(Long[] driverIds)
    {
        return driverMapper.deleteDriverByIds(driverIds);
    }

    /**
     * 删除驾驶员登记信息
     * 
     * @param driverId 驾驶员登记ID
     * @return 结果
     */
    @Override
    public int deleteDriverById(Long driverId)
    {
        return driverMapper.deleteDriverById(driverId);
    }
}
