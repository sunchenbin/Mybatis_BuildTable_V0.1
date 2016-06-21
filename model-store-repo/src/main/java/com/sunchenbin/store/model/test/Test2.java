package com.sunchenbin.store.model.test;

import java.sql.Date;

import com.sunchenbin.store.annotation.Column;
import com.sunchenbin.store.annotation.Table;
import com.sunchenbin.store.constants.SqlTypeConstant;

@Table(name = "test2")
public class Test2{

	@Column(name = "id",type = SqlTypeConstant.INT,length = 11,isKey = true,isNull = false,isAutoIncrement = true)
	private int		id;

	@Column(name = "name",type = SqlTypeConstant.VARCHAR,length = 100)
	private String	name;

	@Column(name = "description",type = SqlTypeConstant.TEXT,length = 0)
	private String	description;

	@Column(name = "create_time",type = SqlTypeConstant.DATETIME,length = 0)
	private Date	create_time;

	@Column(name = "update_time", type = SqlTypeConstant.DATETIME, length = 0)
	private Date	update_time;

	@Column(name = "number",type = SqlTypeConstant.NUMERIC,length = 5,decimalLength = 2)
	private Long	number;

	@Column(name = "lifecycle",type = SqlTypeConstant.CHAR,length = 1)
	private String	lifecycle;

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public Date getCreate_time(){
		return create_time;
	}

	public void setCreate_time(Date create_time){
		this.create_time = create_time;
	}

	public Date getUpdate_time(){
		return update_time;
	}

	public void setUpdate_time(Date update_time){
		this.update_time = update_time;
	}

	public String getDescription(){
		return description;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public Long getNumber(){
		return number;
	}

	public void setNumber(Long number){
		this.number = number;
	}

	public String getLifecycle(){
		return lifecycle;
	}

	public void setLifecycle(String lifecycle){
		this.lifecycle = lifecycle;
	}

}
