package com.proastro.gua.enums;

public enum HourRangeEnum {

	HOUR_00_00_TO_00_59("00:00-00:59"),
    HOUR_01_00_TO_02_59("01:00-01:59"),
	HOUR_03_00_TO_04_59("03:00-04:59"),
	HOUR_05_00_TO_06_59("05:00-06:59"),
	HOUR_07_00_TO_08_59("07:00-08:59"),
	HOUR_09_00_TO_10_59("09:00-10:59"),
	HOUR_11_00_TO_12_59("11:00-12:59"),
	HOUR_13_00_TO_14_59("13:00-14:59"),
	HOUR_15_00_TO_16_59("15:00-16:59"),
	HOUR_17_00_TO_18_59("17:00-18:59"),
	HOUR_19_00_TO_20_59("19:00-20:59"),
	HOUR_21_00_TO_22_59("21:00-22:59"),
	HOUR_23_00_TO_23_59("23:00-23:59");

    private String value;

    HourRangeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
