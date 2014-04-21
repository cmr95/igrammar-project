package edu.business;

import java.util.ArrayList;

import edu.dao.QuestionDao;
import edu.dao.impl.QuestionDaoImpl;
import edu.entity.Question;

public class BQuestion {
	
	public static ArrayList<Question> getQuestions(){
		QuestionDao dao = new QuestionDaoImpl();
		ArrayList<Question> qlists = dao.listQuestions();
		return qlists;
	}

}
