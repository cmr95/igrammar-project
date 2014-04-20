package edu.entity;

import java.util.ArrayList;

public class Question {
	private String qnum;
	private String qlabel;
	private ArrayList<String> choiceList = new ArrayList<String>();
	
	public String getQnum() {
		return qnum;
	}
	public void setQnum(String qnum) {
		this.qnum = qnum;
	}
	public String getQlabel() {
		return qlabel;
	}
	public void setQlabel(String qlabel) {
		this.qlabel = qlabel;
	}
	public ArrayList<String> getChoice() {
		return choiceList;
	}
	public void setChoice(String choice) {
		this.choiceList.add(choice);
	}
	
}
