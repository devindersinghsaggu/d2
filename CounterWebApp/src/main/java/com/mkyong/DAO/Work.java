package com.mkyong.DAO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Work")
public class Work {
	
	
	private long workid;
	
	@Id
	public long getWorkid() {
		return workid;
	}
	public void setWorkid(long workid) {
		this.workid = workid;
	}
	String type;
	String Position;
	
	public Work() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	@Override
	public String toString() {
		return "Work [type=" + type + ", Position=" + Position + "]";
	}
	
	
	

}
