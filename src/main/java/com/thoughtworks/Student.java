package com.thoughtworks;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Student {
    private String name;
    private String studentId;
    private Date enrollmentDate;

    public Student() {
    }

    public Student(String name, String studentId, String enrollmentDate) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd");
        this.name = name;
        this.studentId = studentId;
        this.enrollmentDate = simpleDateFormat.parse(enrollmentDate);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    @Override
    public String toString() {
        int schoolAge = new Date().getYear() - enrollmentDate.getYear();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年M月dd日");
        return "我叫" + name + "，我的学号是" + studentId + "，" + simpleDateFormat.format(enrollmentDate) + "入学，学龄" + schoolAge + "年";
    }
}
