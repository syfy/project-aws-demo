package com.project.web.rest.aws;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.project.web.adaptors.ProfileToProfileLocal;
import com.project.web.domains.Profile;
import com.project.web.repository.ProfileDao;

@Component
@Transactional
public class BootStrapProgram {
	@Autowired
	ProfileDao pd;
	@Value("${profiles.url}")
	private String profilesPath;
	@EventListener(ApplicationReadyEvent.class)
	public void doSomethingAfterStartup() {

		RestTemplate restTemplate = new RestTemplate();
		Profile[] quote = restTemplate.getForObject(profilesPath,
				Profile[].class);



		ProfileToProfileLocal profileAdaptor = new ProfileToProfileLocal();

		;
		pd.saveAll(profileAdaptor.toProfileLocal(quote));

	}
}
