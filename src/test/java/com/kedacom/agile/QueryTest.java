package com.kedacom.agile;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;
import static org.junit.Assert.*;

/**
 * @Description: assets-manager.
 * @author: Hu Zhongyuan
 * @version: 2014/5/15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class QueryTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void myQueryTest () {
        String sql = "select now()";
        List<Map<String, Object>> data = jdbcTemplate.queryForList(sql);
        assertNotNull(data);
    }
}
