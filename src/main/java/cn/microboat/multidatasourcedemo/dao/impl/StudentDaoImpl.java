package cn.microboat.multidatasourcedemo.dao.impl;

import cn.microboat.multidatasourcedemo.dao.StudentDao;
import cn.microboat.multidatasourcedemo.pojo.po.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhouwei
 */
@Repository
public class StudentDaoImpl implements StudentDao {

    @Resource(name = "ds1JdbcTemplate")
    private JdbcTemplate ds1JdbcTemplate;

    @Resource(name = "ds2JdbcTemplate")
    private JdbcTemplate ds2JdbcTemplate;

    @Override
    public List<Student> ds1StudentList() {
        String query = "select * from student;";
        return ds1JdbcTemplate.query(query, new BeanPropertyRowMapper<>(Student.class));
    }

    @Override
    public List<Student> ds2StudentList() {
        String query = "select * from student;";
        return ds2JdbcTemplate.query(query, new BeanPropertyRowMapper<>(Student.class));
    }
}
