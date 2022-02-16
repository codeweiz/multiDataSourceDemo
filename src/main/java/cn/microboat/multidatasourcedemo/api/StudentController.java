package cn.microboat.multidatasourcedemo.api;

import cn.microboat.multidatasourcedemo.pojo.po.Student;
import cn.microboat.multidatasourcedemo.service.impl.StudentServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhouwei
 */
@RestController
public class StudentController {

    @Resource
    private StudentServiceImpl studentServiceImpl;

    @RequestMapping("/ds1/student/list")
    public List<Student> ds1StudentList() {
        return studentServiceImpl.ds1StudentList();
    }

    @RequestMapping("/ds2/student/list")
    public List<Student> ds2StudentList() {
        return studentServiceImpl.ds2StudentList();
    }
}
