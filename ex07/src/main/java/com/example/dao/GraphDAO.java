package com.example.dao;

import java.util.HashMap;
import java.util.List;

public interface GraphDAO {
	public List<HashMap<String, Object>> lcodeAvg();
	public List<HashMap<String, Object>> scodeAvg();
	public List<HashMap<String, Object>> deptCount();

}
