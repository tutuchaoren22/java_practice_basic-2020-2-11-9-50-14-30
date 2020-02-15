package com.thoughtworks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        Set<Student> checkedStudents = new HashSet<>();
        for (Student student : this.studentList) {
            if (!checkedStudents.add(student)) {
                repeatStudent.add(student);
            }
        }
        return repeatStudent;
    }

}
