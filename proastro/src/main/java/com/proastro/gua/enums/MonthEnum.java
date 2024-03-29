package com.proastro.gua.enums;

public enum MonthEnum {
	
	Jan("January"),
	Feb("February"),
	Mar("March"),
	Apr("April"),
	May("May"),
	Jun("June"),
	Jul("July"),
	Aug("August"),
	Sep("September"),
	Oct("October"),
	Nov("November"),
	Dec("December");
	
	private String value;
	
	private MonthEnum(String value){
		this.value = value;
	}
	
	public String getValue() {
        return value;
    }

}
