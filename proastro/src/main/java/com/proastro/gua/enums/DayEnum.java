package com.proastro.gua.enums;

public enum DayEnum {

	Mon  ("Monday"),
	Tue  ("Tuesday"),
	Wed  ("Wednesday"),
	Thu ("Thursday"),
	Fri  ("Friday"),
	Sat  ("Saturday"),
	Sun  ("Sunday");

	public String value;

	private DayEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
