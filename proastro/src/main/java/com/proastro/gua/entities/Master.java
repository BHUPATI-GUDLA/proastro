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
public class Master {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private int year;

	private String month;

	private int date;

	private String yearStem;

	private String yearBranch;

	private String monthStem;

	private String monthBranch;

	private String dateStem;

	private String dateBranch;

	private String day;

	public Master() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Master(long id, int year, String month, int date, String yearStem, String yearBranch, String monthStem,
			String monthBranch, String dateStem, String dateBranch, String day) {
		super();
		this.id = id;
		this.year = year;
		this.month = month;
		this.date = date;
		this.yearStem = yearStem;
		this.yearBranch = yearBranch;
		this.monthStem = monthStem;
		this.monthBranch = monthBranch;
		this.dateStem = dateStem;
		this.dateBranch = dateBranch;
		this.day = day;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getYearStem() {
		return yearStem;
	}

	public void setYearStem(String yearStem) {
		this.yearStem = yearStem;
	}

	public String getYearBranch() {
		return yearBranch;
	}

	public void setYearBranch(String yearBranch) {
		this.yearBranch = yearBranch;
	}

	public String getMonthStem() {
		return monthStem;
	}

	public void setMonthStem(String monthStem) {
		this.monthStem = monthStem;
	}

	public String getMonthBranch() {
		return monthBranch;
	}

	public void setMonthBranch(String monthBranch) {
		this.monthBranch = monthBranch;
	}

	public String getDateStem() {
		return dateStem;
	}

	public void setDateStem(String dateStem) {
		this.dateStem = dateStem;
	}

	public String getDateBranch() {
		return dateBranch;
	}

	public void setDateBranch(String dateBranch) {
		this.dateBranch = dateBranch;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "MasterTable [id=" + id + ", year=" + year + ", month=" + month + ", date=" + date + ", yearStem="
				+ yearStem + ", yearBranch=" + yearBranch + ", monthStem=" + monthStem + ", monthBranch=" + monthBranch
				+ ", dateStem=" + dateStem + ", dateBranch=" + dateBranch + ", day=" + day + "]";
	}

}
