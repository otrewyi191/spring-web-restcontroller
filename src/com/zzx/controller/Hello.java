package com.zzx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/5/7 0007.
 */

@RestController
@RequestMapping("/user")
public class Hello {

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String view(@PathVariable("name") String name) {
        return "hello:" + name;
    }
}
