package com.how2java.springboot.pojo;

public class Yonghu {

	private int id;
    
	private String yhmc;
	private String mima;
	private String name;

	

	
	public String getYhmc() {
		return yhmc;
	}
	public void setYhmc(String yhmc) {
		this.yhmc = yhmc;
	}
	public String getMima() {
		return mima;
	}
	public void setMima(String mima) {
		this.mima = mima;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Yonghu [id=" + id + ", yhmc=" + yhmc + ", mima=" + mima + ", name=" + name + "]";
	}

	

	
	
	
}
