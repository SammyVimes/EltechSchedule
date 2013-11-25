package com.danilov.eltechschedule.model;

import com.danilov.eltechschedule.enums.LessonType;

public class Lesson {
	
	private String classroom;
	private String lectorName;
	private String subjectName;
	
	private LessonType lessonType;

	public Lesson() {
		this(null, null, null, null);
	}
	
	public Lesson(final String subjectName, final LessonType lessonType) {
		this(subjectName, lessonType, null, null);
	}
	
	public Lesson(final String subjectName,
			      final LessonType lessonType,
			      final String classroom, 
			      final String lectorName) {
		this.subjectName = subjectName;
		this.lessonType = lessonType;
		this.classroom = classroom;
		this.lectorName = lectorName;
	}
	
	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public String getLectorName() {
		return lectorName;
	}

	public void setLectorName(String lectorName) {
		this.lectorName = lectorName;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public LessonType getLessonType() {
		return lessonType;
	}

	public void setLessonType(LessonType lessonType) {
		this.lessonType = lessonType;
	}
	
}
