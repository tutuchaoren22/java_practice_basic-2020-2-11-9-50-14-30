package com.thoughtworks;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws ParseException {
        List<Student> students = new ArrayList<>();
        students.add(new Student("张三", "001", "2019.02.11"));
        students.add(new Student("李四", "002", "2019.02.10"));
        students.add(new Student("王五", "001", "2019.02.09"));

        Teacher teacher = new Teacher("张龙", students);
        System.out.println("下面同学的学号重复：");
        List<Student> repeatStudent = teacher.checkStudent();
        for (Student student : repeatStudent) {
            System.out.println(student);
        }
    }
}
