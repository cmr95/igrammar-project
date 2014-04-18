package edu.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.dao.SectionDao;
import edu.entity.Section;
import edu.util.DBUtil;

public class SectionDaoImpl implements SectionDao {
	
	@Override
	public ArrayList<Section> getSections(String ch) {
		
		String sql = "select section_chapter.sec_num, chapter_num, sec_label " +
				"from section_chapter left join section_label " +
				"on section_chapter.sec_num = section_label.sec_num " +
				"where chapter_num=?;";
		
		DBUtil util = new DBUtil();
		Connection conn = util.getConn();
		PreparedStatement pstmt;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ch);
			
			ResultSet rs = pstmt.executeQuery();
			ArrayList<Section> list = new ArrayList<Section>();
			while(rs.next()){
				String sec_num = rs.getString("sec_num");
				String chapter_num = rs.getString("chapter_num");
				String sec_label = rs.getString("sec_label");
				Section sec = new Section();
				sec.setChapter_num(chapter_num);
				sec.setSectionNum(sec_num);
				sec.setSectionLabel(sec_label);
				list.add(sec);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
