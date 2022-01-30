package com.diamond.app.board.svc;

import java.util.HashMap;
import java.util.List;

public interface BoardService {
	public Object list();
	public int register(Object obj);
	public Object read(Object obj);
	public int remove(Object obj);
	public int modify(Object obj);
	public List<Object> search(HashMap<String, String> map);
}
