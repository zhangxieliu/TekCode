package org.tek.code.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.tek.code.model.Times;

import java.util.List;

/**
 * @Author Nick
 * @CreateTime 2020/9/20
 */
@Repository
public class TimesDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Times> findAll() {
        String sql = "SELECT * FROM TIMES";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper(Times.class));
    }
}
