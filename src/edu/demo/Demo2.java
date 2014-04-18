package edu.demo;

import java.util.ArrayList;

import edu.dao.ChapterDao;
import edu.dao.impl.ChapterDaoImpl;
import edu.entity.Chapter;
import edu.entity.Section;

public class Demo2 {
	public static void main(String[] args) {
		ChapterDao dao = new ChapterDaoImpl();
		ArrayList<Chapter> list = dao.getChapterList();
		for (Chapter ch : list) {
			System.out.println(ch.getChapterNum());
			ArrayList<Section> s = ch.getSectionList();
			for (Section sec : s) {
				System.out.println(sec.getSectionLabel());
			}
		}
	}
}
