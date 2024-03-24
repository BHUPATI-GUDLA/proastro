package com.proastro.gua.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Stems {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String hourRange;

	private String stems;

	private String month;

	private String branch;

	public Stems() {
		super();
	}

	public Stems(long id, String hourRange, String stems, String month, String branch) {
		super();
		this.id = id;
		this.hourRange = hourRange;
		this.stems = stems;
		this.month = month;
		this.branch = branch;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getHourRange() {
		return hourRange;
	}

	public void setHourRange(String hourRange) {
		this.hourRange = hourRange;
	}

	public String getStems() {
		return stems;
	}

	public void setStems(String stems) {
		this.stems = stems;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "StemsTable [id=" + id + ", hourRange=" + hourRange + ", stems=" + stems + ", month=" + month
				+ ", branch=" + branch + "]";
	}

}
