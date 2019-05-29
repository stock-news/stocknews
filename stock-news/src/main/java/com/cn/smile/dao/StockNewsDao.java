package com.cn.smile.dao;

import org.springframework.stereotype.Repository;

import com.cn.smile.entity.StockNews;

@Repository
public class StockNewsDao extends AbstractDao<StockNews> {
	public StockNewsDao() {
		setTableName("t_stock_news");
	}
}
