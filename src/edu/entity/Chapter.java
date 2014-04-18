package edu.entity;

import java.util.ArrayList;

public class Chapter {
	private String chapterNum;
	private String chapterLabel;
	private String chapterTitle;
	private ArrayList<Section> sectionList;

	public ArrayList<Section> getSectionList() {
		return sectionList;
	}

	public void setSectionList(ArrayList<Section> sectionList) {
		this.sectionList = sectionList;
	}

	public String getChapterNum() {
		return chapterNum;
	}

	public void setChapterNum(String chapterNum) {
		this.chapterNum = chapterNum;
	}

	public String getChapterLabel() {
		return chapterLabel;
	}

	public void setChapterLabel(String chapterLabel) {
		this.chapterLabel = chapterLabel;
	}

	public String getChapterTitle() {
		return chapterTitle;
	}

	public void setChapterTitle(String chapterTitle) {
		this.chapterTitle = chapterTitle;
	}

}
