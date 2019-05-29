package com.cn.smile.service;

import java.util.List;

import com.cn.smile.entity.Pager;
import com.cn.smile.entity.StockNews;

public interface StockNewsService {
	void add(StockNews news);
    void delete(String id);

	void update(StockNews news);
	List<StockNews> getAll(Pager<StockNews> pager);
}
