package com.proastro.gua.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @author bgudla
 * 
 */
@Entity
public class Stems {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

//	00:00 to 00:59
	private String hour1;
	
//	01:00 to 02:59	
	private String hour2;

//	03:00 to 04:49	
	private String hour3;
	
//	05:00 to 06:59	
	private String hour4;
	
//	07:00 to 08:59
	private String hour5;
	
//	09:00 to 10:59	
	private String hour6;
	
//	11:00 to 12:59
	private String hour7;
	
//	13:00 to 14:59
	private String hour8;
	
//	15:00 to 16:59
	private String hour9;
	
//	17:00 to 18:59
	private String hour10;
	
//	19:00 to 20:59
	private String hour11;
	
//	21:00 to 22:59
	private String hour12;

//	23:00 to 23:59
	private String hour13;
	
	private String branch;

	public Stems() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stems(long id, String hour1, String hour2, String hour3, String hour4, String hour5, String hour6,
			String hour7, String hour8, String hour9, String hour10, String hour11, String hour12, String hour13,
			String branch) {
		super();
		this.id = id;
		this.hour1 = hour1;
		this.hour2 = hour2;
		this.hour3 = hour3;
		this.hour4 = hour4;
		this.hour5 = hour5;
		this.hour6 = hour6;
		this.hour7 = hour7;
		this.hour8 = hour8;
		this.hour9 = hour9;
		this.hour10 = hour10;
		this.hour11 = hour11;
		this.hour12 = hour12;
		this.hour13 = hour13;
		this.branch = branch;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getHour1() {
		return hour1;
	}

	public void setHour1(String hour1) {
		this.hour1 = hour1;
	}

	public String getHour2() {
		return hour2;
	}

	public void setHour2(String hour2) {
		this.hour2 = hour2;
	}

	public String getHour3() {
		return hour3;
	}

	public void setHour3(String hour3) {
		this.hour3 = hour3;
	}

	public String getHour4() {
		return hour4;
	}

	public void setHour4(String hour4) {
		this.hour4 = hour4;
	}

	public String getHour5() {
		return hour5;
	}

	public void setHour5(String hour5) {
		this.hour5 = hour5;
	}

	public String getHour6() {
		return hour6;
	}

	public void setHour6(String hour6) {
		this.hour6 = hour6;
	}

	public String getHour7() {
		return hour7;
	}

	public void setHour7(String hour7) {
		this.hour7 = hour7;
	}

	public String getHour8() {
		return hour8;
	}

	public void setHour8(String hour8) {
		this.hour8 = hour8;
	}

	public String getHour9() {
		return hour9;
	}

	public void setHour9(String hour9) {
		this.hour9 = hour9;
	}

	public String getHour10() {
		return hour10;
	}

	public void setHour10(String hour10) {
		this.hour10 = hour10;
	}

	public String getHour11() {
		return hour11;
	}

	public void setHour11(String hour11) {
		this.hour11 = hour11;
	}

	public String getHour12() {
		return hour12;
	}

	public void setHour12(String hour12) {
		this.hour12 = hour12;
	}

	public String getHour13() {
		return hour13;
	}

	public void setHour13(String hour13) {
		this.hour13 = hour13;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Stems [id=" + id + ", hour1=" + hour1 + ", hour2=" + hour2 + ", hour3=" + hour3 + ", hour4=" + hour4
				+ ", hour5=" + hour5 + ", hour6=" + hour6 + ", hour7=" + hour7 + ", hour8=" + hour8 + ", hour9=" + hour9
				+ ", hour10=" + hour10 + ", hour11=" + hour11 + ", hour12=" + hour12 + ", hour13=" + hour13
				+ ", branch=" + branch + "]";
	}

}
