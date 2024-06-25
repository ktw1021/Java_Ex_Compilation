package com.javaex.jdbc.dao.hrapp;

import java.util.List;

public interface HrDAO {

	public List<HrVO> getList();
	public List<HrVO> search(String search_key);
	public List<HrVO> getSalary(int min_sal, int max_sal);
}
