package com.proastro.gua.enums;

public enum BranchTableEnum {
	
	HOUR_00_00_TO_00_59("00:00-00:59","Zi"),
    HOUR_01_00_TO_02_59("01:00-01:59","Chou"),
	HOUR_03_00_TO_04_59("03:00-04:59","Yin"),
	HOUR_05_00_TO_06_59("05:00-06:59","Mao"),
	HOUR_07_00_TO_08_59("07:00-08:59","Chen"),
	HOUR_09_00_TO_10_59("09:00-10:59","Si"),
	HOUR_11_00_TO_12_59("11:00-12:59","Wu"),
	HOUR_13_00_TO_14_59("13:00-14:59","Wei"),
	HOUR_15_00_TO_16_59("15:00-16:59","Shen"),
	HOUR_17_00_TO_18_59("17:00-18:59","You"),
	HOUR_19_00_TO_20_59("19:00-20:59","Xu"),
	HOUR_21_00_TO_22_59("21:00-22:59","Hai"),
	HOUR_23_00_TO_23_59("23:00-23:59","Zi");
	
	
	
	public String hour;
	public String branch;

	private BranchTableEnum(String hour, String branch){
		this.hour = hour;
		this.branch = branch;
	}

	 public String getHour() {
	        return hour;
	 }
	 
	 public String getBranch() {
	        return branch;
	 }

}
