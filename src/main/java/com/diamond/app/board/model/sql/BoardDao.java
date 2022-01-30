package com.diamond.app.board.model.sql;

import java.util.HashMap;
import java.util.List;

public interface BoardDao {
	public int registerRow(Object obj);
	public Object readRow(Object obj);
	public int removeRow(Object obj);
	public int modifyRow(Object obj);
	public List<Object> searchRow(HashMap<String, String> map);
}
