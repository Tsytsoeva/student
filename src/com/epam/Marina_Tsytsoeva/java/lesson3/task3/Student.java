package com.epam.Marina_Tsytsoeva.java.lesson3.task3;

import java.time.LocalDateTime;

public class Student {

	private String nameStudent;
	private Curriculum curriculumStudend;
	private LocalDateTime startDate;
	private LocalDateTime endDate;


	public Student(String nameStudent, Curriculum curriculumStudend, LocalDateTime startDate) {
		this.nameStudent = nameStudent;
		this.curriculumStudend = curriculumStudend;
		this.startDate = startDate;
		this.endDate = Utils.getEndDate(startDate, curriculumStudend);
	}

	public String getNameStudent() {
		return nameStudent;
	}

	public Curriculum getCurriculumStudend() {
		return curriculumStudend;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	@Override
	public String toString() {
		return "Student{" +
				"nameStudent='" + nameStudent + '\'' +
				", curriculumStudend=" + curriculumStudend +
				", startDate=" + startDate +
				", endDate=" + endDate +
				'}';
	}
}


