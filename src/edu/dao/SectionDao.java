package edu.dao;

import java.util.ArrayList;

import edu.entity.Section;

public interface SectionDao {
	
	public ArrayList<Section> getSections(String ch);
}
