package com.proastro.gua.utils;

import org.springframework.stereotype.Component;

import com.proastro.gua.entities.Stems;
import com.proastro.gua.enums.BranchEnum;

@Component
public class StemsUtils {

	public String getHourBranch(String hour) {
		switch (hour) {
		case "00:00-00:59":
			return BranchEnum.Zi.getValue();
		case "01:00-01:59":
			return BranchEnum.Chou.getValue();
		case "03:00-04:59":
			return BranchEnum.Yin.getValue();
		case "05:00-06:59":
			return BranchEnum.Mao.getValue();
		case "07:00-08:59":
			return BranchEnum.Chen.getValue();
		case "09:00-10:59":
			return BranchEnum.Si.getValue();
		case "11:00-12:59":
			return BranchEnum.Wu.getValue();
		case "13:00-14:59":
			return BranchEnum.Wei.getValue();
		case "15:00-16:59":
			return BranchEnum.Shen.getValue();
		case "17:00-18:59":
			return BranchEnum.You.getValue();
		case "19:00-20:59":
			return BranchEnum.Xu.getValue();
		case "21:00-22:59":
			return BranchEnum.Hai.getValue();
		case "23:00-23:59":
			return BranchEnum.Zi.getValue();
		default:
			return null;
		}
	}
	
	public String getHourStem(String hour, Stems stems) {
		switch (hour) {
		case "00:00-00:59":
			return stems.getHour1();
		case "01:00-01:59":
			return stems.getHour2();
		case "03:00-04:59":
			return stems.getHour3();
		case "05:00-06:59":
			return stems.getHour4();
		case "07:00-08:59":
			return stems.getHour5();
		case "09:00-10:59":
			return stems.getHour6();
		case "11:00-12:59":
			return stems.getHour7();
		case "13:00-14:59":
			return stems.getHour8();
		case "15:00-16:59":
			return stems.getHour9();
		case "17:00-18:59":
			return stems.getHour10();
		case "19:00-20:59":
			return stems.getHour11();
		case "21:00-22:59":
			return stems.getHour12();
		case "23:00-23:59":
			return stems.getHour13();
		default:
			return null;
		}
	}
	
}
