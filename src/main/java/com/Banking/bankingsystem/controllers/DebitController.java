package com.Banking.bankingsystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DebitController {

	@RequestMapping("/")
	public String getData()
	{
		return "getData";
	}
	
	@RequestMapping("/data")
	public String getDataa()
	{
		return "getData";
	}
	
	
}
