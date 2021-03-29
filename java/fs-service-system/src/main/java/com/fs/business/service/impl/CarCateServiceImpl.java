package com.fs.business.service.impl;

import java.util.List;
import com.fs.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fs.business.mapper.CarCateMapper;
import com.fs.business.domain.CarCate;
import com.fs.business.service.ICarCateService;

/**
 * 车辆分类Service业务层处理
 * 
 * @author fs
 * @date 2021-03-27
 */
@Service
public class CarCateServiceImpl implements ICarCateService 
{
    @Autowired
    private CarCateMapper carCateMapper;

    /**
     * 查询车辆分类
     * 
     * @param cateId 车辆分类ID
     * @return 车辆分类
     */
    @Override
    public CarCate selectCarCateById(Long cateId)
    {
        return carCateMapper.selectCarCateById(cateId);
    }

    /**
     * 查询车辆分类列表
     * 
     * @param carCate 车辆分类
     * @return 车辆分类
     */
    @Override
    public List<CarCate> selectCarCateList(CarCate carCate)
    {
        return carCateMapper.selectCarCateList(carCate);
    }

    /**
     * 新增车辆分类
     * 
     * @param carCate 车辆分类
     * @return 结果
     */
    @Override
    public int insertCarCate(CarCate carCate)
    {
        carCate.setCreateTime(DateUtils.getNowDate());
        return carCateMapper.insertCarCate(carCate);
    }

    /**
     * 修改车辆分类
     * 
     * @param carCate 车辆分类
     * @return 结果
     */
    @Override
    public int updateCarCate(CarCate carCate)
    {
        return carCateMapper.updateCarCate(carCate);
    }

    /**
     * 批量删除车辆分类
     * 
     * @param cateIds 需要删除的车辆分类ID
     * @return 结果
     */
    @Override
    public int deleteCarCateByIds(Long[] cateIds)
    {
        return carCateMapper.deleteCarCateByIds(cateIds);
    }

    /**
     * 删除车辆分类信息
     * 
     * @param cateId 车辆分类ID
     * @return 结果
     */
    @Override
    public int deleteCarCateById(Long cateId)
    {
        return carCateMapper.deleteCarCateById(cateId);
    }
}
