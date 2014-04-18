package edu.dao;

import java.util.ArrayList;

import edu.entity.KnowledgePoint;

public interface KnowledgePointDao {
	public ArrayList<KnowledgePoint> getKnowledgePoints(String secNum);
}
