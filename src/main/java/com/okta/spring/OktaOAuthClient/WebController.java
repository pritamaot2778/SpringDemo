package com.okta.spring.OktaOAuthClient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class WebController {
	private static final Logger logger = LogManager.getLogger(WebController.class);

	@RequestMapping("/landingPage")
	public String landingPage(Model model, Principal principal) {
		//logger.info("WebController : landingPage"+ principal);
		//logger.info("Profile-Data : "+ principal);
		System.out.println(principal);
		// Auth layer will be intercepted here to authorize user to access target resource.
		// Auth options : 1) DB roles lookup. 2) Okta roles.
		return "landingPage";
	}

	@RequestMapping("/")
	public String index(Model model, Principal principal) {
		logger.info("WebController : indexPage");
		return "index";
	}
}