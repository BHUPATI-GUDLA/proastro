package com.proastro.gua.enums;

public enum BranchEnum {

	Jia  ("Jia"),
	Yi   ("Yi"),
	Bing ("Bing"),
	Ding ("Ding"),
	Wu   ("Wu"),
	Ji   ("Ji"),
	Geng ("Geng"),
	Xin  ("Xin"),
	Ren  ("Ren"),
	Gui  ("Gui");

	public String value;

	private BranchEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}