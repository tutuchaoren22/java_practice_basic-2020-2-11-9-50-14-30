package com.thoughtworks;

import java.util.List;

public class Teacher {
//    创建一个教师类(Teacher)，有姓名和学生名单两个属性
//    教师类有一个查重方法，返回重复学生的名单
    private String name;
    private List<Student> studentList;

    public Teacher() {
    }

    public Teacher(String name, List<Student> studentList) {
        this.name = name;
        this.studentList = studentList;
    }

    public List<Student> checkStudent(List<Student>  studentList){
        for (int i = 0; i < studentList.size(); i++) {
            for (int j = i+1; j< studentList.size(); j++) {
                if (! studentList.get(j).equals(studentList.get(i))){
                    studentList.remove(j);
                }
            }
        }
        return studentList;

    }

}
