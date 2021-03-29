package com.fs.web.controller.business;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fs.common.annotation.Log;
import com.fs.common.core.controller.BaseController;
import com.fs.common.core.domain.AjaxResult;
import com.fs.common.enums.BusinessType;
import com.fs.business.domain.Car;
import com.fs.business.service.ICarService;
import com.fs.common.utils.poi.ExcelUtil;
import com.fs.common.core.page.TableDataInfo;

/**
 * 车辆登记Controller
 * 
 * @author fs
 * @date 2021-03-27
 */
@RestController
@RequestMapping("/business/car")
public class CarController extends BaseController
{
    @Autowired
    private ICarService carService;

    /**
     * 查询车辆登记列表
     */
    @PreAuthorize("@ss.hasPermi('business:car:list')")
    @GetMapping("/list")
    public TableDataInfo list(Car car)
    {
        startPage();
//        List<Car> list = carService.selectCarList(car);
        List<Car> list = carService.getCustomerCarList(car);
        return getDataTable(list);
    }

    /**
     * 导出车辆登记列表
     */
    @PreAuthorize("@ss.hasPermi('business:car:export')")
    @Log(title = "车辆登记", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Car car)
    {
        List<Car> list = carService.selectCarList(car);
        ExcelUtil<Car> util = new ExcelUtil<Car>(Car.class);
        return util.exportExcel(list, "car");
    }

    /**
     * 获取车辆登记详细信息
     */
    @PreAuthorize("@ss.hasPermi('business:car:query')")
    @GetMapping(value = "/{carId}")
    public AjaxResult getInfo(@PathVariable("carId") Long carId)
    {
        return AjaxResult.success(carService.selectCarById(carId));
    }

    /**
     * 新增车辆登记
     */
    @PreAuthorize("@ss.hasPermi('business:car:add')")
    @Log(title = "车辆登记", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Car car)
    {
        return toAjax(carService.insertCar(car));
    }

    /**
     * 修改车辆登记
     */
    @PreAuthorize("@ss.hasPermi('business:car:edit')")
    @Log(title = "车辆登记", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Car car)
    {
        return toAjax(carService.updateCar(car));
    }

    /**
     * 删除车辆登记
     */
    @PreAuthorize("@ss.hasPermi('business:car:remove')")
    @Log(title = "车辆登记", businessType = BusinessType.DELETE)
	@DeleteMapping("/{carIds}")
    public AjaxResult remove(@PathVariable Long[] carIds)
    {
        return toAjax(carService.deleteCarByIds(carIds));
    }
}
