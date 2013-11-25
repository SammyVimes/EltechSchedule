package com.danilov.eltechschedule.model;

import java.util.List;

public class Week {
	
	private boolean isEven = false;
	private List<Day> days;
	
	public Week() {
		
	}
	
	public Week(final List<Day> days) {
		this.days = days;
	}
	
	public Week(final List<Day> days, final boolean isEven) {
		this.days = days;
		this.isEven = isEven;
	}

	public boolean isEven() {
		return isEven;
	}

	public void setEven(boolean isEven) {
		this.isEven = isEven;
	}

	public List<Day> getDays() {
		return days;
	}

	public void setDays(List<Day> days) {
		this.days = days;
	}
	
}
