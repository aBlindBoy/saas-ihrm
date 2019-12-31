package cn.itcast.generate.entity.db;

import java.util.List;

/**
 * 表实体
 * @author Administrator
 *
 */
public class Table {
	
	private String name;//表名称
	private String name2;//处理后的表名称
	private String comment;//介绍
	private String key;// 主键列
	private List<Column> columns;//列集合

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public List<Column> getColumns() {
		return columns;
	}

	public void setColumns(List<Column> columns) {
		this.columns = columns;
	}
}
