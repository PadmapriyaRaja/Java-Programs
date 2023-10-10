package com.edu.practice;

public class Insect {

	private String insectName;
	private int insectWeight;

	public Insect(String insectName, int insectWeight) {
		super();
		this.insectName = insectName;
		this.insectWeight = insectWeight;
	}

	public String getInsectName() {
		return insectName;
	}

	public void setInsectName(String insectName) {
		this.insectName = insectName;
	}

	public int getInsectWeight() {
		return insectWeight;
	}

	public void setInsectWeight(int insectWeight) {
		this.insectWeight = insectWeight;
	}

	@Override
	public String toString() {
		return "Insect {insectName='" + insectName + "', insectWeight=" + insectWeight + "}";
	}

}
