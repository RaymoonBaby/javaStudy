package com.fs.business.mapper;

import java.util.List;
import com.fs.business.domain.Car;

/**
 * 车辆登记Mapper接口
 * 
 * @author fs
 * @date 2021-03-27
 */
public interface CarMapper 
{
    /**
     * 查询车辆登记
     * 
     * @param carId 车辆登记ID
     * @return 车辆登记
     */
    public Car selectCarById(Long carId);

    /**
     * 查询车辆登记列表
     * 
     * @param car 车辆登记
     * @return 车辆登记集合
     */
    public List<Car> selectCarList(Car car);


    public List<Car> getCustomerCarList(Car car);

    /**
     * 新增车辆登记
     * 
     * @param car 车辆登记
     * @return 结果
     */
    public int insertCar(Car car);

    /**
     * 修改车辆登记
     * 
     * @param car 车辆登记
     * @return 结果
     */
    public int updateCar(Car car);

    /**
     * 删除车辆登记
     * 
     * @param carId 车辆登记ID
     * @return 结果
     */
    public int deleteCarById(Long carId);

    /**
     * 批量删除车辆登记
     * 
     * @param carIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteCarByIds(Long[] carIds);
}
