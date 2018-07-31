package com.hr.emp2.dao;

import java.util.List;

import com.hr.emp2.dto.EmpList;

public interface EmpListDAO {

	public void create(EmpList dto) throws Exception;
	public EmpList read(Integer id) throws Exception;
	public void update(EmpList dto) throws Exception;
	public void delete(Integer id) throws Exception;
	public List<EmpList> listAll() throws Exception;
	
	
}
