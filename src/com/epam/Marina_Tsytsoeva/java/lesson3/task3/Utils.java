package com.epam.Marina_Tsytsoeva.java.lesson3.task3;

	import java.time.LocalDateTime;
	
	public class Utils {

	    static public LocalDateTime getEndDate(LocalDateTime startDate, Curriculum curriculum) {

	        int amountWorkHours = curriculum.getSumHours();
	        int currentHour = 0;


	        LocalDateTime endDate = startDate;

	        while (!(amountWorkHours == 0)) {
	            endDate = endDate.plusHours(1);
	            currentHour = endDate.getHour();

	            if ((currentHour > Main.STARTTIME) && (currentHour <= Main.ENDTIME)) {
	                amountWorkHours--;
	            }
	        }
	        return endDate;
	    }


	    static public int getDiffTimeHours(Student student, LocalDateTime currentTime) {

	        LocalDateTime Date1 = currentTime;
	        LocalDateTime Date2 = student.getEndDate();

	        if (programIsFinished(student, currentTime)) {
	            Date1 = student.getEndDate();
	            Date2 = currentTime;
	        }

	        int workHoursBetween = 0;
	        int currentHour = 0;

	        while (Date1.isBefore(Date2)) {

	            Date1 = Date1.plusHours(1);
	            currentHour = Date1.getHour();

	            if ((currentHour > Main.STARTTIME) && (currentHour <= Main.ENDTIME)) {
	                workHoursBetween++;
	            }
	        }
	        return workHoursBetween;
	    }


	    static public boolean programIsFinished(Student student, LocalDateTime currentTime) {

	        boolean finished = true;
	        if (currentTime.isBefore(student.getEndDate())) {
	            finished = false;
	        }
	        return finished;
	    }

	}


