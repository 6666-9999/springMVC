package com.cssl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cssl.pojo.Street;
import com.cssl.service.DistrictService;

@Controller
public class DistrictController {
	
	@Autowired
	private DistrictService ds;

	@RequestMapping("/street")
	@ResponseBody
	public List<Street> getStreet(int did){
		List<Street> list=ds.getStreetByDid(did);
		return list;
	}
}
