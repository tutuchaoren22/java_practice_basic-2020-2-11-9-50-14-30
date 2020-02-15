package com.thoughtworks;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws ParseException {
        Student zhangSan = new Student("张三", "001", "2019.02.11");
        System.out.println(zhangSan);

        Student liSi = new Student("李四", "002", "2019.02.10");
        System.out.println(liSi);

        Student wangWu = new Student("王五", "001", "2019.02.09");
        System.out.println(wangWu);

        List<Student> students = new ArrayList<>();
        students.add(zhangSan);
        students.add(liSi);
        students.add(wangWu);

        Teacher teacher = new Teacher("张龙", students);
        List<Student> checkStudent = teacher.checkStudent();
    }
}
