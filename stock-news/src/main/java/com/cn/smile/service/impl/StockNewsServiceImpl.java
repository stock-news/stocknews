package com.cn.smile.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.smile.dao.StockNewsDao;
import com.cn.smile.entity.Pager;
import com.cn.smile.entity.StockNews;
import com.cn.smile.service.StockNewsService;

@Service
public class StockNewsServiceImpl implements StockNewsService {
	@Autowired
	private StockNewsDao stockNewsDao;
	@Override
	public void add(StockNews news) {
		stockNewsDao.add(news, true);

	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(StockNews news) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<StockNews> getAll(Pager<StockNews> pager) {
		// TODO Auto-generated method stub
		return null;
	}

}
