package org.tek.code.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tek.code.dao.TimesDAO;
import org.tek.code.model.Times;
import org.tek.code.service.TimesService;

import java.util.List;

/**
 * @Author Nick
 * @CreateTime 2020/9/20
 */
@Service
public class TimesServiceImpl implements TimesService {

    @Autowired
    private TimesDAO timesDAO;

    @Override
    public List<Times> findAll() {
        return timesDAO.findAll();
    }
}
