package com.cssl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.cssl.pojo.District;
import com.cssl.pojo.Type;
import com.cssl.service.DistrictService;
import com.cssl.service.TypeService;

@ControllerAdvice
public class AdviceController {
	
	@Autowired
	private TypeService ts;

	@Autowired
	private DistrictService ds;

	/**
	 * 优先查询街道，类型
	 * @param mo
	 * @return
	 */
	@ModelAttribute
	public Model advice(Model mo) {
		List<District> dlist = ds.getAll();
		mo.addAttribute("dlist", dlist);
		List<Type> tlist = ts.getAll();
		mo.addAttribute("tylist", tlist);
		return mo;
	}
}
