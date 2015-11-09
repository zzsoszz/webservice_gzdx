package dinamica.util;


import java.util.ArrayList;

import java.util.List;

public class ListAndTotalCount<T> {
	
	private String total;
	private List<T> rows;
	
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	
	public ListAndTotalCount()
	{
		setTotal("0");
		setRows(new ArrayList<T>());
	}
	public ListAndTotalCount(String total,List<T> rows){
		setTotal(total);
		setRows(rows);
	}
}
