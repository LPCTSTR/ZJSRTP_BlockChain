package cn.lpctstr.node.data.model;

import cn.lpctstr.node.data.AbstractDataInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:LPCTSTR_MSR
 * @Description: Null
 * @Date: 18:48 2019/6/25
 * @Project: ZJSRTP
 */
public class Stud_Info extends AbstractDataInfo {
    private String name;
    private String id;


    private List<Course> courseList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Stud_Info(String name, String id) {
        this.name = name;
        this.id = id;
        courseList = new ArrayList<>();
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public String getCourseAbstract() {
        StringBuilder tmp = new StringBuilder();
        for (Course course : courseList)
            tmp.append(course.getHash());
        return tmp.toString();
    }
}
