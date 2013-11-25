package com.danilov.eltechschedule.enums;

public enum LessonType {
	LECTURE("������"),
	LABORATORY("������������ ������"),
	PRACTICE("��������");
	
	private String title;
	
	private LessonType(final String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
}
