package edu.entity;

import java.util.ArrayList;

public class KnowledgePoint {
	
	private String knowledgeNum;
	private String knowledgeLable;
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
	public String getKnowledgeLable() {
		return knowledgeLable;
	}
	public void setKnowledgeLable(String knowledgeLable) {
		this.knowledgeLable = knowledgeLable;
	}
	public ArrayList<String> getKnowledgeEg() {
		return knowledgeEg;
	}
	public void setKnowledgeEg(ArrayList<String> knowledgeEg) {
		this.knowledgeEg = knowledgeEg;
	}
}
