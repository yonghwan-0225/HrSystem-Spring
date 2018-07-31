package com.hr.emp2.dao;

import java.util.List;

import java.util.List;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hr.emp2.dto.EmpList;

@Repository
public class EmpListDAOimpl implements EmpListDAO {

	@Inject
	private SqlSession session;

	private static String namespace = "com.hr.mappers.BoardMapper";
	
	@Override
	public void create(EmpList dto) throws Exception {
		session.insert(namespace+".create", dto);
	}

	@Override
	public EmpList read(Integer id) throws Exception {
		return session.selectOne(namespace + ".read", id);
	}

	@Override
	public void update(EmpList dto) throws Exception {
		session.update(namespace+".update", dto);
	}

	@Override
	public void delete(Integer id) throws Exception {
		session.delete(namespace+".delete", id);
	}

	@Override
	public List<EmpList> listAll() throws Exception {
		return session.selectList(namespace + ".listAll");
	}

}
