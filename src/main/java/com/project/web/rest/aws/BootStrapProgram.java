package com.project.web.rest.aws;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
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

	@EventListener(ApplicationReadyEvent.class)
	public void doSomethingAfterStartup() {
		System.out.println("hello world, I have just started up");

		RestTemplate restTemplate = new RestTemplate();
		Profile[] quote = restTemplate.getForObject("http://s3-ap-southeast-1.amazonaws.com/fundo/js/profiles.json",
				Profile[].class);
		System.out.println("hello world, I have just started up");
		System.out.println("hello world, I have just started up");

		System.out.println(quote.length);
		Profile gottenProfile = quote[0];

		ProfileToProfileLocal profileAdaptor = new ProfileToProfileLocal();

		;
		pd.saveAll(profileAdaptor.toProfileLocal(quote));
		System.out.println(pd.getOne("59914e16322c1b042d4fdf2b").getName().getFirst());
	}
}
