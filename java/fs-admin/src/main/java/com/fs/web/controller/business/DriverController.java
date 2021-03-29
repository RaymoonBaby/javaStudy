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
import com.fs.business.domain.Driver;
import com.fs.business.service.IDriverService;
import com.fs.common.utils.poi.ExcelUtil;
import com.fs.common.core.page.TableDataInfo;

/**
 * 驾驶员登记Controller
 * 
 * @author fs
 * @date 2021-03-28
 */
@RestController
@RequestMapping("/business/driver")
public class DriverController extends BaseController
{
    @Autowired
    private IDriverService driverService;

    /**
     * 查询驾驶员登记列表
     */
    @PreAuthorize("@ss.hasPermi('business:driver:list')")
    @GetMapping("/list")
    public TableDataInfo list(Driver driver)
    {
        startPage();
        List<Driver> list = driverService.selectDriverList(driver);
        return getDataTable(list);
    }

    /**
     * 导出驾驶员登记列表
     */
    @PreAuthorize("@ss.hasPermi('business:driver:export')")
    @Log(title = "驾驶员登记", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Driver driver)
    {
        List<Driver> list = driverService.selectDriverList(driver);
        ExcelUtil<Driver> util = new ExcelUtil<Driver>(Driver.class);
        return util.exportExcel(list, "driver");
    }

    /**
     * 获取驾驶员登记详细信息
     */
    @PreAuthorize("@ss.hasPermi('business:driver:query')")
    @GetMapping(value = "/{driverId}")
    public AjaxResult getInfo(@PathVariable("driverId") Long driverId)
    {
        return AjaxResult.success(driverService.selectDriverById(driverId));
    }

    /**
     * 新增驾驶员登记
     */
    @PreAuthorize("@ss.hasPermi('business:driver:add')")
    @Log(title = "驾驶员登记", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Driver driver)
    {
        return toAjax(driverService.insertDriver(driver));
    }

    /**
     * 修改驾驶员登记
     */
    @PreAuthorize("@ss.hasPermi('business:driver:edit')")
    @Log(title = "驾驶员登记", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Driver driver)
    {
        return toAjax(driverService.updateDriver(driver));
    }

    /**
     * 删除驾驶员登记
     */
    @PreAuthorize("@ss.hasPermi('business:driver:remove')")
    @Log(title = "驾驶员登记", businessType = BusinessType.DELETE)
	@DeleteMapping("/{driverIds}")
    public AjaxResult remove(@PathVariable Long[] driverIds)
    {
        return toAjax(driverService.deleteDriverByIds(driverIds));
    }
}
