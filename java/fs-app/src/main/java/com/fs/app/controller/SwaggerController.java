package com.fs.app.controller;

import com.fs.common.core.controller.BaseController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * swagger 接口
 * 
 
 */
@Controller
@RequestMapping("/api")
public class SwaggerController extends BaseController
{

    @GetMapping()
    public String index()
    {
        return redirect("/swagger-ui.html");
    }
}
