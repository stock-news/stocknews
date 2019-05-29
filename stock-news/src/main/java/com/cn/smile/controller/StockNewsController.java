package com.cn.smile.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.smile.service.StockNewsService;

@Controller
@RequestMapping("/sn")
public class StockNewsController {
	@RequestMapping(value = "/get")
	@ResponseBody
	public String getToday(HttpServletRequest request, HttpServletResponse res) {
		/*
		 * String callback = request.getParameter("callback"); return callback +
		 * '(' + JSON.toJSONString(wrapResult(sks)) + ')';
		 */
		stockNewsService.getAll(null);
		return null;
	}

	@Autowired
	private StockNewsService stockNewsService;
}
