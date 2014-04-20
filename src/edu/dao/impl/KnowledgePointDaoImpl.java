package edu.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.dao.KnowledgePointDao;
import edu.entity.KnowledgePoint;
import edu.util.DBUtil;

public class KnowledgePointDaoImpl implements KnowledgePointDao {

	@Override
	public ArrayList<KnowledgePoint> getKnowledgePoints(String secNum) {
		String sql = "select knowledge_section.know_num,sec_num, label " +
				"from knowledge_section left join knowledge_label " +
				"on knowledge_section.know_num = knowledge_label.know_num " +
				"where sec_num=?";
		
		DBUtil util = new DBUtil();
		Connection conn = util.getConn();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, secNum);
			ResultSet rs = pstmt.executeQuery();
			ArrayList<KnowledgePoint> list = new ArrayList<KnowledgePoint>();
			while(rs.next()){
				String know_num = rs.getString("know_num");
				String sec_num = rs.getString("sec_num");
				String label = rs.getString("label");
				KnowledgePoint k = new KnowledgePoint();
				k.setKnowledgeNum(know_num);
				k.setSectionNum(sec_num);
				k.setKnowledgeLabel(label);
				list.add(k);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
