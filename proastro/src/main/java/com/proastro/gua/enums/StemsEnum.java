package com.proastro.gua.enums;

public enum StemsEnum {

	Zi   ("Zi"),
	Chou ("Chou"),
	Yin  ("Yin"),
	Mao  ("Mao"),
	Chen ("Chen"),
	Si   ("Si"),
	Wu   ("Wu"),
	Wei  ("Wei"),
	Shen ("Shen"),
	You  ("You"),
	Xu   ("Xu"),
	Hai  ("Hai");
	
	private String value;
	
	StemsEnum(String value){
		this.value = value;
	}
	
	public String getValue() {
        return value;
    }
}
