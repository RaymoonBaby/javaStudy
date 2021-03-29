package com.fs.business.service.impl;

import java.util.List;
import com.fs.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fs.business.mapper.CarMapper;
import com.fs.business.domain.Car;
import com.fs.business.service.ICarService;

/**
 * 车辆登记Service业务层处理
 * 
 * @author fs
 * @date 2021-03-27
 */
@Service
public class CarServiceImpl implements ICarService 
{
    @Autowired
    private CarMapper carMapper;

    /**
     * 查询车辆登记
     * 
     * @param carId 车辆登记ID
     * @return 车辆登记
     */
    @Override
    public Car selectCarById(Long carId)
    {
        return carMapper.selectCarById(carId);
    }

    /**
     * 查询车辆登记列表
     * 
     * @param car 车辆登记
     * @return 车辆登记
     */
    @Override
    public List<Car> selectCarList(Car car)
    {
        return carMapper.selectCarList(car);
    }

    public List<Car> getCustomerCarList(Car car)
    {
        return carMapper.getCustomerCarList(car);
    }

    /**
     * 新增车辆登记
     * 
     * @param car 车辆登记
     * @return 结果
     */
    @Override
    public int insertCar(Car car)
    {
        car.setCreateTime(DateUtils.getNowDate());
        return carMapper.insertCar(car);
    }

    /**
     * 修改车辆登记
     * 
     * @param car 车辆登记
     * @return 结果
     */
    @Override
    public int updateCar(Car car)
    {
        return carMapper.updateCar(car);
    }

    /**
     * 批量删除车辆登记
     * 
     * @param carIds 需要删除的车辆登记ID
     * @return 结果
     */
    @Override
    public int deleteCarByIds(Long[] carIds)
    {
        return carMapper.deleteCarByIds(carIds);
    }

    /**
     * 删除车辆登记信息
     * 
     * @param carId 车辆登记ID
     * @return 结果
     */
    @Override
    public int deleteCarById(Long carId)
    {
        return carMapper.deleteCarById(carId);
    }
}
