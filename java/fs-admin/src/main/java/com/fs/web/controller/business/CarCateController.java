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
import com.fs.business.domain.CarCate;
import com.fs.business.service.ICarCateService;
import com.fs.common.utils.poi.ExcelUtil;
import com.fs.common.core.page.TableDataInfo;

/**
 * 车辆分类Controller
 * 
 * @author fs
 * @date 2021-03-27
 */
@RestController
@RequestMapping("/business/cate")
public class CarCateController extends BaseController
{
    @Autowired
    private ICarCateService carCateService;

    /**
     * 查询车辆分类列表
     */
    @PreAuthorize("@ss.hasPermi('business:cate:list')")
    @GetMapping("/list")
    public TableDataInfo list(CarCate carCate)
    {
        startPage();
        List<CarCate> list = carCateService.selectCarCateList(carCate);
        return getDataTable(list);
    }

    /**
     * 导出车辆分类列表
     */
    @PreAuthorize("@ss.hasPermi('business:cate:export')")
    @Log(title = "车辆分类", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(CarCate carCate)
    {
        List<CarCate> list = carCateService.selectCarCateList(carCate);
        ExcelUtil<CarCate> util = new ExcelUtil<CarCate>(CarCate.class);
        return util.exportExcel(list, "cate");
    }

    /**
     * 获取车辆分类详细信息
     */
    @PreAuthorize("@ss.hasPermi('business:cate:query')")
    @GetMapping(value = "/{cateId}")
    public AjaxResult getInfo(@PathVariable("cateId") Long cateId)
    {
        return AjaxResult.success(carCateService.selectCarCateById(cateId));
    }

    /**
     * 新增车辆分类
     */
    @PreAuthorize("@ss.hasPermi('business:cate:add')")
    @Log(title = "车辆分类", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CarCate carCate)
    {
        return toAjax(carCateService.insertCarCate(carCate));
    }

    /**
     * 修改车辆分类
     */
    @PreAuthorize("@ss.hasPermi('business:cate:edit')")
    @Log(title = "车辆分类", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CarCate carCate)
    {
        return toAjax(carCateService.updateCarCate(carCate));
    }

    /**
     * 删除车辆分类
     */
    @PreAuthorize("@ss.hasPermi('business:cate:remove')")
    @Log(title = "车辆分类", businessType = BusinessType.DELETE)
	@DeleteMapping("/{cateIds}")
    public AjaxResult remove(@PathVariable Long[] cateIds)
    {
        return toAjax(carCateService.deleteCarCateByIds(cateIds));
    }
}
