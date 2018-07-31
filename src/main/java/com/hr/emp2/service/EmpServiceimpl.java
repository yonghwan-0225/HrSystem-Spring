package com.hr.emp2.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.hr.emp2.dao.EmpListDAO;
import com.hr.emp2.dto.EmpList;

@Service
public class EmpServiceimpl implements EmpService {

	@Inject
	private EmpListDAO dao;
	
	@Override
	public void regist(EmpList emp) throws Exception {
		dao.create(emp);
	}

	@Override
	public EmpList read(Integer id) throws Exception {
		return dao.read(id);
	}

	@Override
	public void modify(EmpList emp) throws Exception {
		dao.update(emp);
	}

	@Override
	public void remove(Integer id) throws Exception {
		dao.delete(id);
	}

	@Override
	public List<EmpList> listAll() throws Exception {
		return dao.listAll();
	}
	
	

}
