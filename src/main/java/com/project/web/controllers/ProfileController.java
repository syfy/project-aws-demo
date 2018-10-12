package com.project.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.web.domains.ProfileLocal;
import com.project.web.repository.ProfileDao;

@Controller
public class ProfileController {
	@Autowired
	ProfileDao pD;
	
	@RequestMapping("view_profile")
	public ModelAndView getProfile(Model model,@RequestParam(value = "profileId", required = true)  String profileId) {

		ProfileLocal retNote = pD.getOne(profileId);
		model.addAttribute("profile",retNote);
	
		return new ModelAndView("view_profile");

	}
}
