package edu.demo;

import java.util.ArrayList;

import edu.dao.ChapterDao;
import edu.dao.KnowledgePointDao;
import edu.dao.impl.ChapterDaoImpl;
import edu.dao.impl.KnowledgePointDaoImpl;
import edu.entity.Chapter;
import edu.entity.KnowledgePoint;
import edu.entity.Section;

public class Demo2 {
	public static void main(String[] args) {
		
		KnowledgePointDao dao = new KnowledgePointDaoImpl();
		ArrayList<KnowledgePoint> list = dao.getKnowledgePoints("sec11");
		
		for (KnowledgePoint k : list) {
			System.out.println(k.getKnowledgeLabel());
		}
		/**
		ChapterDao dao = new ChapterDaoImpl();
		ArrayList<Chapter> list = dao.getChapterList();
		for (Chapter ch : list) {
			System.out.println(ch.getChapterNum());
			ArrayList<Section> s = ch.getSectionList();
			for (Section sec : s) {
				System.out.println(sec.getSectionLabel());
			}
		}
		**/
	}
}
