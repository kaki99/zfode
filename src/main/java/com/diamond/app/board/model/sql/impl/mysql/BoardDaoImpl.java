package com.diamond.app.board.model.sql.impl.mysql;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.diamond.app.board.model.sql.BoardDao;

@Repository("BoardRepo")
public class BoardDaoImpl implements BoardDao {

	@Autowired
	private SqlSession session;

	public static final String PREFIX = "com.diamond.app.board";

	@Override
	public int registerRow(Object obj) {
		System.out.println("-- Register Dao --");
		System.out.println("user dao loginRow: " + obj);
		System.out.println("user dao session: " + session);

		// BoardMapper.xml의 register에 해당되는 부분을 실행하고 객체를 받는다.
		return session.insert(PREFIX + ".register", obj);
	}

	// upCnt 추가
	public int upCnt(Object obj) {
		return session.update(PREFIX + ".upCnt", obj);
	}

	// 메소드 호출
	@Override
	public Object readRow(Object obj) {
		int upCntFlag = upCnt(obj);
		System.out.println("upCntFlag : " + upCntFlag);
		System.out.println("board dao readRow : " + obj);
		return session.selectOne(PREFIX + ".read", obj);
	}

	@Override
	public int removeRow(Object obj) {
		int resultDao = session.delete(PREFIX + ".delete", obj);
		return resultDao;
	}

	@Override
	public int modifyRow(Object obj) {
		int modifyDao = session.update(PREFIX + ".update", obj);
		return modifyDao;
	}

	@Override
	public List<Object> searchRow(HashMap<String, String> map) {
		List<Object> searchDao = session.selectList(PREFIX+".search", map) ;
		return searchDao;
	}
}
