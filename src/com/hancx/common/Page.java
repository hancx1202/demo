package com.hancx.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.util.Assert;
/**
 * @author hanchuanxing
 * @date 2018年8月24日
 */
public class Page<T> implements Serializable{
	
	private static final int DEFAULT_PAGE_SIZE = 10;
	private int pageSize = DEFAULT_PAGE_SIZE; //默认一页10条记录
	private long start; //起始页
	private List<T> rows = new ArrayList<T>(); //返回记录
	private long total; //总记录数
	
	public Page(List<T> data, long totalSize) {
		Assert.isTrue(totalSize >= 0, "Total size must not be negative!");
		this.rows = data;
		this.total = totalSize;
		if(this.rows == null){
			this.rows = new ArrayList<T>();
		}
	}
	
	public Page(long start, int pageSize, List<T> data, long totalSize){
		this(data, totalSize);
		Assert.isTrue(pageSize > 0, "Page size must be greater than 0!");
		this.pageSize =  pageSize;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public long getStart() {
		return start;
	}

	public void setStart(long start) {
		this.start = start;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}
	
    public long getPageCount() {
        if (total % pageSize == 0) {
            return total / pageSize;
        } else {
            return total / pageSize + 1;
        }
    }
    
    public long getPageIndex() {
        return start / pageSize;
    }
    
    public boolean hasNextPage() {
        return this.getPageIndex() < this.getPageCount() - 1;
    }

    public boolean hasPreviousPage() {
        return this.getPageIndex() > 0;
    }

    public static int getStartOfPage(int pageIndex, int pageSize) {
        return pageIndex * pageSize;
    }
}
