package edu.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import edu.dao.ChapterDao;
import edu.entity.Chapter;
import edu.util.DBUtil;

public class ChapterDaoImpl implements ChapterDao {

	@Override
	public ArrayList<Chapter> getChapterList() {

		String sql = "select chapter_label.chapter_num,label_name,title_name " +
				"from chapter_label left join chapter_title " +
				"on chapter_label.chapter_num = chapter_title.chapter_num;";
		
		DBUtil util = new DBUtil();
		Connection conn = util.getConn();
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			ArrayList<Chapter> list = new ArrayList<Chapter>();
			while(rs.next()){
				String num = rs.getString("chapter_num");
				String label = rs.getString("label_name");
				String title = rs.getString("title_name");
				
				Chapter ch = new Chapter();
				ch.setChapterNum(num);
				ch.setChapterLabel(label);
				ch.setChapterTitle(title);
				ch.setSectionList(new SectionDaoImpl().getSections(num));
				list.add(ch);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
