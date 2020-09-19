package org.tek.code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tek.code.service.TimesService;

/**
 * @Author Nick
 * @CreateTime 2020/9/20
 */
@RestController
@RequestMapping("Time")
public class TimesController {

    @Autowired
    private TimesService timesService;

    @GetMapping(value="/findAll")
    public Object findAll() {
        return timesService.findAll();
    }
}
