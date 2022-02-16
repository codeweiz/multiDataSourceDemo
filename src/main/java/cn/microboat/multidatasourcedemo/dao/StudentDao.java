package cn.microboat.multidatasourcedemo.dao;

import cn.microboat.multidatasourcedemo.pojo.po.Student;

import java.util.List;

/**
 * @author zhouwei
 */
public interface StudentDao {

    /**
     * 不分页查询ds1学生列表
     * @return list
     * */
    List<Student> ds1StudentList();

    /**
     * 不分页查询ds2学生列表
     * @return list
     * */
    List<Student> ds2StudentList();
}
