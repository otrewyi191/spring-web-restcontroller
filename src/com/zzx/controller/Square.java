package com.zzx.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/5/7 0007.
 */

@RestController
@RequestMapping("/square")
public class Square {

    @RequestMapping(value = "/{num}", method = RequestMethod.GET)
    public String view(@PathVariable("num") Long num) {
        return "Square of " + num + " is:" + num * num;
    }
}
