package com.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.bean.Details;
import com.ssm.dao.DetailsMapper;

@Service
public class DetailsService {
	
	@Autowired
	DetailsMapper detailsMapper;
	
	public List<Details> getAll(int id) {
		// TODO Auto-generated method stub
		return detailsMapper.selectByExampleWithReagent(id);
	}

	public Details getDetails(int d_id) {
		// TODO Auto-generated method stub
		return detailsMapper.selectByPrimaryKey(d_id);
	}

}
