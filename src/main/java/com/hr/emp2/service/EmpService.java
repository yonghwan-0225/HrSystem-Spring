package com.hr.emp2.service;

import java.util.List;

import com.hr.emp2.dto.EmpList;

public interface EmpService {
	public void regist(EmpList emp) throws Exception;

	public EmpList read(Integer id) throws Exception;

	public void modify(EmpList emp) throws Exception;

	public void remove(Integer id) throws Exception;

	public List<EmpList> listAll() throws Exception;

}
