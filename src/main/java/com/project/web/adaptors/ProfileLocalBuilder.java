package com.project.web.adaptors;

import com.project.web.domains.Name;
import com.project.web.domains.NameLocal;
import com.project.web.domains.Profile;
import com.project.web.domains.ProfileLocal;

public class ProfileLocalBuilder {
	ProfileLocal pfl;
	Profile pf;

	public Profile getPf() {
		return pf;
	}

	public void setPf(Profile pf) {
		pfl = new ProfileLocal();
		this.pf = pf;
	}

	public void setId() {
		pfl.setId(pf.getId());
	}

	public void setActive() {
		pfl.setActive(pf.isActive());
	}

	public void setBlocked() {
		pfl.setBlocked(pf.isBlocked());
	}

	public void setBalance() {
		pfl.setBalance(pf.getBalance());
	}

	public void setPicture() {
		pfl.setPicture(pf.getPicture());
	}

	public void setAge() {
		pfl.setAge(pf.getAge());
	}

	public void setName() {
		NameLocal nl = new NameLocal();
		nl.setFirst(pf.getName().getFirst());
		nl.setLast(pf.getName().getLast());
		nl.setMiddle(pf.getName().getMiddle());
		pfl.setName(nl);
	}

	public void setEmail() {
		pfl.setEmail(pf.getEmail());
	}

	public void setPhone() {
		pfl.setPhone(pf.getPhone());
	}

	public void setAddress() {
		pfl.setAddress(pf.getAddress());
	}

	public void setProfile() {
		pfl.setProfile(pf.getProfile());
	}

	public void setDate_registered() {
		pfl.setDate_registered(pf.getDate_registered());
	}

	public ProfileLocal generateLocalProfile() {
		this.setId();
		this.setActive();
		this.setBlocked();
		this.setBalance();

		this.setPicture();

		this.setAge();

		this.setName();

		this.setEmail();

		this.setPhone();

		this.setAddress();

		this.setProfile();
		this.setDate_registered();

		return pfl;
	}
}
