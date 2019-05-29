package com.epam.Marina_Tsytsoeva.java.lesson3.task3;
/**
 * @author  Marina Tsytsoeva
 * Lesson3.task3
 */

import java.time.LocalDateTime;


public class Main {


    public static final int STARTTIME = 10;
    public static final int ENDTIME = 18;


    public static void main(String[] args) {


       LocalDateTime currentTime=LocalDateTime.now();

        LocalDateTime startDate1=LocalDateTime.of(2019, 5, 28, 10, 0, 0);
        LocalDateTime startDate2=LocalDateTime.of(2019, 5, 29, 12, 0, 0);

        Course[] coursesJ2EEDev = {new Course("Технология Java Servlets", 16), new Course("Struts Framework", 24)};
        Course[] coursesJavaDev = {new Course("Обзор технологий Java", 8), new Course("Библиотека JFC/Swing", 16), new Course("Технология JDBC", 16)};

        Curriculum curriculumJ2EEDev = new Curriculum("J2EE Developer", coursesJ2EEDev);
        Curriculum curriculumJavaDev = new Curriculum("Java Developer", coursesJavaDev);
        Student[] students = {new Student("Ivanov Ivan", curriculumJ2EEDev, startDate1),new Student("Petrov Petr", curriculumJavaDev, startDate2)};


        if (args.length==0||args[0].equals("0")) {
            Report.getShortReport(students, currentTime);
        } else {
            Report.printReportLong(students, currentTime);
        }
    }

}



	
