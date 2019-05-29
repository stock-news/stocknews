package com.cn.smile.entity;

import java.util.List;

public class Pager<T> {
	private Integer pageSize;

	private Integer totalRecord;

	private Integer totalPage;

	private Integer currentPage = 1;

	private List<T> list;

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(Integer totalRecord) {
		this.totalRecord = totalRecord;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public int getStartIndex() {
		return (this.currentPage - 1) * this.pageSize;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public Pager(Integer pageNo, Integer pageSize, Integer totalRecord) {
		// 总记录数
		this.totalRecord = totalRecord;

		// 每页显示多小条数据
		this.pageSize = pageSize;

		// 总页数
		this.totalPage = (totalRecord + pageSize-1) / pageSize;

		// 当前第几页
		if (this.totalPage < pageNo) {
			this.currentPage = this.totalPage;
		} else {
			this.currentPage = pageNo;
		}

		// 起始索引 将此字段作为数据库分页查询的开始索引
		Integer startIndex = this.pageSize * (this.currentPage - 1);
		// select * from table limit (currentPage-1)*limit,limit;
	}

	public Pager() {

	}

}
