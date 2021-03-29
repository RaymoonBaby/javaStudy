package com.fs.business.service;

import java.util.List;
import com.fs.business.domain.CarCate;

/**
 * 车辆分类Service接口
 * 
 * @author fs
 * @date 2021-03-27
 */
public interface ICarCateService 
{
    /**
     * 查询车辆分类
     * 
     * @param cateId 车辆分类ID
     * @return 车辆分类
     */
    public CarCate selectCarCateById(Long cateId);

    /**
     * 查询车辆分类列表
     * 
     * @param carCate 车辆分类
     * @return 车辆分类集合
     */
    public List<CarCate> selectCarCateList(CarCate carCate);

    /**
     * 新增车辆分类
     * 
     * @param carCate 车辆分类
     * @return 结果
     */
    public int insertCarCate(CarCate carCate);

    /**
     * 修改车辆分类
     * 
     * @param carCate 车辆分类
     * @return 结果
     */
    public int updateCarCate(CarCate carCate);

    /**
     * 批量删除车辆分类
     * 
     * @param cateIds 需要删除的车辆分类ID
     * @return 结果
     */
    public int deleteCarCateByIds(Long[] cateIds);

    /**
     * 删除车辆分类信息
     * 
     * @param cateId 车辆分类ID
     * @return 结果
     */
    public int deleteCarCateById(Long cateId);
}
