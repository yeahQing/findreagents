package com.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.bean.Details;
import com.ssm.service.DetailsService;
import com.ssm.utils.MsgUtil;

@Controller
public class DetailsController {
	
	@Autowired
	DetailsService detailsService;
	
	/*
	 * 
	 * 导入json
	 * */
	@ResponseBody
	@RequestMapping(value="/details/{id}",method=RequestMethod.GET)
	public MsgUtil getDetailsListWithJson(@PathVariable("id") int id,@RequestParam(value = "pn", defaultValue = "1") Integer pn) throws JsonProcessingException {
		PageHelper.startPage(pn, 5);
		
		List<Details> details = detailsService.getAll(id);
		
		PageInfo<Details> page = new PageInfo<Details>(details, 5);
		
		return MsgUtil.success().add("pageInfo", page);
	}
	
//	
//	@RequestMapping(value="/details/{id}",method=RequestMethod.GET)
//	public String getDetailsList(@PathVariable("id") int id,@RequestParam(value = "pn", defaultValue = "1") Integer pn,Model model) {
//		
//		PageHelper.startPage(pn, 5);
//		List<Details> details = detailsService.getAll(id);
//		
//		PageInfo<Details> page = new PageInfo<Details>(details, 5);
//		model.addAttribute("pageInfo", page);
//		
//		return "list";
//	}
	
	@ResponseBody
	@RequestMapping(value="/getDetail/{d_id}",method=RequestMethod.GET)
	public MsgUtil getDetailsWithJson(@PathVariable("d_id") int d_id) throws JsonProcessingException {
		
		Details details = detailsService.getDetails(d_id);
		
		return MsgUtil.success().add("detailsInfo", details);
	}
	
}
