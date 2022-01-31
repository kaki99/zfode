package com.diamond.app.board.svc.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diamond.app.board.dao.BoardDao;
import com.diamond.app.board.svc.BoardService;

@Service("boardSvc")
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDao dao;
	
	public Object list() {
		return null;
	};
	
	@Override
	public int register(Object obj) {
		System.out.println("-- Register Service --");
		return dao.registerRow(obj);
	}

	@Override
	public Object read(Object obj) {
		return dao.readRow(obj);
	}
	
	@Override
	public int remove(Object obj) {
		int resultService = dao.removeRow(obj);
		return resultService;
	}
	
	@Override
	public int modify(Object obj) {
		int modifyService = dao.modifyRow(obj);
		return modifyService;
	}
	
	@Override
	public List<Object> search(HashMap<String, String> map) {
		List<Object> searchService = dao.searchRow(map);
		return searchService;
	}
}
