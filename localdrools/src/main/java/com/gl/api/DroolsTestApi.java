package com.gl.api;

import com.gl.rools.DroolsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/conf/business")
public class DroolsTestApi {

    @Autowired
    DroolsService mDroolsService;
    @RequestMapping(value = { "/getAll" }, method = { RequestMethod.POST })
    @ResponseBody
    public String getAll() {
        mDroolsService.fireRule();
        return "xxx";
    }
}