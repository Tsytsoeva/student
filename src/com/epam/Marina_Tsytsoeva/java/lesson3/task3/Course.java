package com.epam.Marina_Tsytsoeva.java.lesson3.task3;


public class Course {

	private String nameCourse;
	private int durationHrs;


	public Course(String nameCourse, int durationHrs) {
		this.nameCourse = nameCourse;
		this.durationHrs = durationHrs;
	}


	public String getNameCourse() {
		return nameCourse;
	}


	public int getDurationHrs() {
		return durationHrs;
	}

@Override
public String toString() {
return "Course [nameCourse=" + nameCourse + ", durationHrs=" + durationHrs + "]";
}

}
