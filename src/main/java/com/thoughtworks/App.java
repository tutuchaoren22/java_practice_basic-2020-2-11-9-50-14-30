package com.thoughtworks;

import java.text.ParseException;

public class App {

  public static void main(String[] args) throws ParseException {
    Student student=new Student("xiaoming","001","2019.12.10");
    System.out.println(student);
  }
}
