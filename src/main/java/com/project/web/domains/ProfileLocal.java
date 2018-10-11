package com.project.web.domains;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class ProfileLocal {
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public boolean isBlocked() {
		return blocked;
	}
	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getDate_registered() {
		return date_registered;
	}
	public void setDate_registered(String date_registered) {
		this.date_registered = date_registered;
	}
	public NameLocal getName() {
		return name;
	}
	public void setName(NameLocal name) {
		this.name = name;
	}
	@Id
	String id;
	boolean active;
	boolean blocked;
	String balance;
	String picture;
	int age;
	
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	NameLocal name;

	String email;
	String phone;
	String address;
	@Column( length = 100000 )
	String profile;
	String date_registered;
}
