package edu.entity;

import java.util.ArrayList;

public class KnowledgePoint {
	
	private String knowledgeNum;
	private String knowledgeLabel;
	private ArrayList<String> knowledgeEg;
	private String sectionNum;
	
	public String getSectionNum() {
		return sectionNum;
	}
	public void setSectionNum(String sectionNum) {
		this.sectionNum = sectionNum;
	}
	public String getKnowledgeNum() {
		return knowledgeNum;
	}
	public void setKnowledgeNum(String knowledgeNum) {
		this.knowledgeNum = knowledgeNum;
	}
	public String getKnowledgeLabel() {
		return knowledgeLabel;
	}
	public void setKnowledgeLabel(String knowledgeLabel) {
		this.knowledgeLabel = knowledgeLabel;
	}
	public ArrayList<String> getKnowledgeEg() {
		return knowledgeEg;
	}
	public void setKnowledgeEg(ArrayList<String> knowledgeEg) {
		this.knowledgeEg = knowledgeEg;
	}
}
