package edu.dao;

import java.util.ArrayList;
import edu.entity.Question;

public interface QuestionDao {
	public ArrayList<Question> listQuestions(String knowledgeNum);
}
