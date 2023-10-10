package com.edu.country;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserCountry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	@Column(name = "username",nullable = false)
	private String uname;
	@Column(name = "userage")
	private int uage;
	
	//OneToOne Mapping
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "countryid")
	private Country country;
	public UserCountry() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserCountry(String uname, int uage) {
		super();
		this.uname = uname;
		this.uage = uage;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getUage() {
		return uage;
	}
	public void setUage(int uage) {
		this.uage = uage;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "UserCountry [uid=" + uid + ", uname=" + uname + ", uage=" + uage + "]";
	}
	
	
	
}
