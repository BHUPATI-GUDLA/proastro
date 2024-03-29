package com.proastro.gua.enums;

public enum StemsEnum {

	Jia  ("Jia 甲"),
	Yi   ("Yi 乙"),
	Bing ("Bing "),
	Ding ("Ding 丁"),
	Wu   ("Wu 午"),
	Ji   ("Ji 己"),
	Geng ("Geng 庚"),
	Xin  ("Xin 辛"),
	Ren  ("Ren 壬"),
	Gui  ("Gui 癸");

	public String value;

	private StemsEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}