package edu.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import edu.util.DBUtil;
import edu.dao.QuestionDao;
import edu.entity.Question;


public class QuestionDaoImpl implements QuestionDao {

	@Override
	public ArrayList<Question> listQuestions(String knowledgeNum) {
		String sql ="SELECT question_label.question_num,question_label.question_label FROM question_knowledge " +
				"INNER JOIN question_label ON question_knowledge.question_num=question_label.question_num WHERE question_knowledge.know_num = '";
		
		
		sql = sql + knowledgeNum + "';";
		DBUtil util = new DBUtil();
		Connection conn = util.getConn();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			ArrayList<Question> list = new ArrayList<Question>();
			
			while(rs.next()){
				String qnum = rs.getString("question_num");
				String qlabel = rs.getString("question_label");
				Question q = new Question();
				q.setQnum(qnum);
				q.setQlabel(qlabel);
				String sqlChoice = "SELECT choice FROM question_choice WHERE question_num= '";
				sqlChoice = sqlChoice + qnum + "';";
				Statement stmtChoice = conn.createStatement();
				ResultSet rsChoice = stmtChoice.executeQuery(sqlChoice);			
				while (rsChoice.next()) {
					String choice = rsChoice.getString("choice");
					q.setChoice(choice);
				}		
				list.add(q);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
