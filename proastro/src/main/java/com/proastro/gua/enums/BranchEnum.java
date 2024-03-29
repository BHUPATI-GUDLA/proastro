package com.proastro.gua.enums;

public enum BranchEnum {

	Zi   ("Zi 子"),
	Chou ("Chou 丑"),
	Yin  ("Yin 寅"),
	Mao  ("Mao 卯"),
	Chen ("Chen 辰"),
	Si   ("Si 巳"),
	Wu   ("Wu 戊"),
	Wei  ("Wei 未"),
	Shen ("Shen 申"),
	You  ("You 酉"),
	Xu   ("Xu 戌"),
	Hai  ("Hai 亥");
	
	public String value;
	
	private BranchEnum(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
    }
}
