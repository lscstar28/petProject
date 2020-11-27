package com.memeber.dto;

public class MemberDTO {
	private String id;
	private String pw;
	private String name;
	private int phone;
	private int addr_idx;
	public MemberDTO() {
		super();
	}
	public MemberDTO(String id, String pw, String name, int phone, int addr_idx) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
		this.addr_idx = addr_idx;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getAddr_idx() {
		return addr_idx;
	}
	public void setAddr_idx(int addr_idx) {
		this.addr_idx = addr_idx;
	}
	
	
}
