package com.tejshri.springmvcboot;

import javax.annotation.Priority;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.context.annotation.Primary;
@Primary
@Entity
public class Alien {
	
	@Id
	private int aid;
	private String aname;
	public Alien(){}
	
	public Alien(int aid, String aname) {
		super();
		this.aid = aid;
		this.aname = aname;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	@Override
	public String toString() {
		return "Alien [id=" + aid + ", name=" + aname + "]";
	}
	

}
