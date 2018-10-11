package com.project.web.service;

import com.project.web.domains.Profile;

public interface ProfileService {
		void saveAll(Profile[] profiles);
		Profile[] getAll();
		
}
