package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private List<Student> studentList;

    public Teacher() {
    }

    public Teacher(String name, List<Student> studentList) {
        this.name = name;
        this.studentList = studentList;
    }

    public List<Student> checkStudent() {
        List<Student> repeatStudent = new ArrayList<>();
        for (int i = 0; i < this.studentList.size(); i++) {
            for (int j = i + 1; j < this.studentList.size(); j++) {
                if (this.studentList.get(j).equals(this.studentList.get(i))) {
                    repeatStudent.add(this.studentList.get(j));
                    System.out.println(studentList.get(j).getName() + "同学的学号发生重复。");
                }
            }
        }
        return repeatStudent;
    }

}
