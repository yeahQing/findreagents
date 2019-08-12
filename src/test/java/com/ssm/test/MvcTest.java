package com.ssm.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.github.pagehelper.PageInfo;
import com.ssm.bean.Details;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:applicationContext.xml",
"file:src/main/webapp/WEB-INF/dispatcherServlet-servlet.xml" })
public class MvcTest {
	
	@Autowired
	WebApplicationContext context;
	
	MockMvc mockMvc;
	
	@Before
	public void initMokcMvc() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	

	@Test
	public void testPage() throws Exception {
		
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/details/1").param("pn", "5"))
				.andReturn();
	
		MockHttpServletRequest request = result.getRequest();
		
		PageInfo<Details> pi = (PageInfo<Details>) request.getAttribute("pageInfo");
		
		System.out.println("显示的页面数"+pi.getPageNum());
		System.out.println("当前页码"+pi.getPages());
		System.out.println("总记录数"+pi.getTotal());
		System.out.println("在页面需要连续显示的页码");
		int[] nums = pi.getNavigatepageNums();
		for (int i : nums) {
			System.out.print(" "+i);
		}
		
		System.out.println();
		
		List<Details> list = pi.getList();
		for (Details details : list) {
			System.out.println(
					"功能剂id:" + details.getDetailId() + 
					"\n中文名" + details.getCnName() + 
					"\n别名:" + details.getAliasesName() +
					"\n组成结构:" + details.getStructure() +
					"\n性能:" + details.getPerformance() + 
					"\n用途:" + details.getPurpose() +
					"\n染整工艺:" + details.getTechnology() +
					"\n简要制法:" + details.getMethod() +
					"\n生产单位" + details.getCompany() + 
					"\n功能剂类型:" + details.getReagent().getReagentType() + "\n");
		}
		
	}
}
