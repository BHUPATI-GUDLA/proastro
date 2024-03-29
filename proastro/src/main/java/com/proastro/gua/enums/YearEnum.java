package com.proastro.gua.enums;

public enum YearEnum {
	
	Year(2024);
	
	private int value;
	
	private YearEnum(int value){
		this.value = value;
	}
	
	public int getValue() {
        return value;
    }

}
