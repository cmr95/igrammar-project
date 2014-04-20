package edu.dao;

import java.util.ArrayList;
import Entity.Question;

public interface QuestionDao {
	public ArrayList<Question> listQuestions(String knowledgeNum);
}
