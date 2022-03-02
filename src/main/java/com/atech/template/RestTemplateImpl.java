package com.atech.template;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestTemplateImpl implements RestTemplateInterface{

	@Override
	public RestTemplate getRestTemplate() {
		
			
		return new RestTemplate();
	}

}
