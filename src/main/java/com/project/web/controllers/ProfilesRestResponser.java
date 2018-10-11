package com.project.web.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.web.domains.ProfileLocal;
import com.project.web.repository.ProfileDao;

@RestController
@Transactional
public class ProfilesRestResponser {
	@Autowired
	ProfileDao pD;
	@RequestMapping(value = "profiles/", method = RequestMethod.GET, produces = "application/json")
	public List<ProfileLocal> getAllProfiles() {
		
		
		return pD.findAll();

	}

}
