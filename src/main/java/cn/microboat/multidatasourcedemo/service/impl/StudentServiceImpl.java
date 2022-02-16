package cn.microboat.multidatasourcedemo.service.impl;

import cn.microboat.multidatasourcedemo.dao.impl.StudentDaoImpl;
import cn.microboat.multidatasourcedemo.pojo.po.Student;
import cn.microboat.multidatasourcedemo.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhouwei
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDaoImpl studentDaoImpl;

    @Override
    public List<Student> ds1StudentList() {
        return studentDaoImpl.ds1StudentList();
    }

    @Override
    public List<Student> ds2StudentList() {
        return studentDaoImpl.ds2StudentList();
    }
}
