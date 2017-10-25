package com.ssm.util;

//分页帮助类
public class PageHelper {

	private int pageSize;//页面大小
	private int currentPage = 1;//当前页
	private int totalPage;//总页数
	private int totalNum;//总记录数
	
	private int pageInitNum;
	
	public PageHelper(int pageSize){
		this.pageSize = pageSize;//指定模块具体展示多少数据
	}
	

	public int getPageInitNum() {
		return pageInitNum;
	}
	public void setPageInitNum(int pageInitNum) {
		this.pageInitNum = pageInitNum;
	}



	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public int getCurrentPage() {
		if(currentPage>totalPage && totalPage!=0){//不能大于总页数且currentPage不能为0
			this.currentPage = totalPage;
		}
		return currentPage;
	}
	
	public void setCurrentPage(int currentPage) {
		    if(currentPage>0){
		    	this.currentPage = currentPage;
		    }else{
		    	this.currentPage = 1;
		    }
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getTotalNum() {
		return totalNum;
	}
	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
		this.totalPage = (int) Math.ceil((double)totalNum/pageSize);//计算出总页数
		this.pageInitNum = (this.getCurrentPage()-1)*this.getPageSize();
	}
	
	
	
	
	
	
	
	
}
