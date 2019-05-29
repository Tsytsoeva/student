package com.epam.Marina_Tsytsoeva.java.lesson3.task3;

	import java.time.LocalDateTime;

		public class Report {

	    public static void getShortReport(Student[] students, LocalDateTime currentTime) {

	        for (Student student : students) {

	            System.out.print(student.getNameStudent() + " (" + student.getCurriculumStudend().getNameCurriculum() + ") - ");

	            if (Utils.programIsFinished(student, currentTime)) {
	                System.out.print("Обучение закончено. После окончания прошло ");
	            } else {
	                System.out.print("Обучение не закончено. До окончания осталось ");

	            }

	            int workhours = Utils.getDiffTimeHours(student, currentTime);

	            int day = workhours / (Main.ENDTIME - Main.STARTTIME);
	            int hours = workhours % (Main.ENDTIME - Main.STARTTIME);

	            System.out.println(day + " д " + hours + " ч.");

	        }
	    }

	    public static void printReportLong(Student[] students, LocalDateTime currentTime) {

	        for (Student currentStudent : students) {

	            System.out.println("\n"+ "STUDENT: " + currentStudent.getNameStudent());
	            System.out.println("WORKTIME: " + Main.STARTTIME + "-" + Main.ENDTIME);
	            System.out.println("CURRICULUM: " + currentStudent.getCurriculumStudend().getNameCurriculum() + "(" + currentStudent.getCurriculumStudend().getSumHours() + "ч. )");
	            System.out.println("START_DATE: " + currentStudent.getStartDate());
	            System.out.println("FINISH_DATE: " + currentStudent.getEndDate());
	            if (Utils.programIsFinished(currentStudent, currentTime)) {
	                System.out.print("Обучение закончено. После окончания прошло ");
	            } else {
	                System.out.print("Обучение не закончено. До окончания осталось ");

	            }
	            int workhours = Utils.getDiffTimeHours(currentStudent, currentTime);
	            int day = workhours / (Main.ENDTIME - Main.STARTTIME);
	            int hours = workhours % (Main.ENDTIME - Main.STARTTIME);
	            System.out.println(day + " д " + hours + " ч.");

	        }
	    }

	}

