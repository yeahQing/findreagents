package com.ssm.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.bean.Details;
import com.ssm.bean.DetailsExample;
import com.ssm.bean.DetailsExample.Criteria;
import com.ssm.dao.DetailsMapper;
import com.ssm.dao.ReagentMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
	
	@Autowired
	ReagentMapper reagentmapper;
	
	@Autowired
	DetailsMapper detailmapper;
	

	//按输入的字段模糊查询
	@Test
	public void test1() {
		DetailsExample de = new DetailsExample();
		Criteria c = de.createCriteria();
		c.andCnNameLike("%静电%");
		List<Details> list = detailmapper.selectByExample(de);
		System.out.println(list.get(0).getCnName());
	}
}
