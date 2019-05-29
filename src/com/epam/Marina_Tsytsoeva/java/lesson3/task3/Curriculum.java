package com.epam.Marina_Tsytsoeva.java.lesson3.task3;

public class Curriculum {

	private String nameCurriculum;
	private Course coursesInCurriculum[];
	private int sumHours;


	public Curriculum(String nameCurriculum, Course[] courses) {
		this.nameCurriculum = nameCurriculum;
		this.sumHours = 0;
		int i = courses.length;
		this.coursesInCurriculum = new Course[i];
		for (int j = 0; j < i; j++) {
			this.coursesInCurriculum[j] = new Course(courses[j].getNameCourse(), courses[j].getDurationHrs());
			this.sumHours = this.sumHours + courses[j].getDurationHrs();
		}
	}

	public int getSumHours() {
		return sumHours;
	}

	public String getNameCurriculum() {
		return nameCurriculum;
	}

	public Course[] getCoursesInCurriculum() {
		return coursesInCurriculum;
	}



}
