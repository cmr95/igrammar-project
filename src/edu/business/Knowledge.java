package edu.business;

import java.util.ArrayList;

import edu.dao.ChapterDao;
import edu.dao.KnowledgePointDao;
import edu.dao.SectionDao;
import edu.dao.impl.ChapterDaoImpl;
import edu.dao.impl.KnowledgePointDaoImpl;
import edu.dao.impl.SectionDaoImpl;
import edu.entity.Chapter;

public class Knowledge {
	
	public static ArrayList<Chapter> getChapterList(){
		ChapterDao dao = new ChapterDaoImpl();
		ArrayList<Chapter> list = dao.getChapterList();
		return list;
	}
	
	public static ArrayList<?> getSections(String ch){
		SectionDao dao = new SectionDaoImpl();
		return dao.getSections(ch);
	}
	
	public static ArrayList<?> getKnowledgePoints(String secNum){
		KnowledgePointDao dao = new KnowledgePointDaoImpl();
		return dao.getKnowledgePoints(secNum);
	}
}
