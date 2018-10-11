package com.project.web.adaptors;

import java.util.ArrayList;

import com.project.web.domains.Profile;
import com.project.web.domains.ProfileLocal;

public class ProfileToProfileLocal {
	
	
	public static ArrayList<ProfileLocal> toProfileLocal(Profile[] tmp) {
		ProfileLocalBuilder profileBuilder = new ProfileLocalBuilder();
		ArrayList<ProfileLocal> returnValue = new ArrayList<ProfileLocal>();
		for(Profile t : tmp){
			profileBuilder.setPf(t);
			returnValue.add(profileBuilder.generateLocalProfile());
		}
		return returnValue;
		
	}
}
