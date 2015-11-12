package com.dorian.wobe;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.Assert;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {
	
	private final UserRepository userRepository;
	
	@Autowired
	public RegistrationController(UserRepository userRepository) {
		Assert.notNull(userRepository);
		
		this.userRepository = userRepository;
	}
	
	@RequestMapping(value="/register")
	public String register(ModelMap modelMap) {
		modelMap.addAttribute("registrationForm", new RegistrationForm());
		return "register";
	}
	
	@RequestMapping(value="/registerNew")
	public String registerNew(@ModelAttribute("registrationForm") @Valid RegistrationForm registrationForm, BindingResult result) {
		//Throw back to registration page
		if(result.hasErrors() ) {
			return "register";
		}
		User user = new User(registrationForm.getFirstName(), registrationForm.getLastName());
		userRepository.save(user);
		
		return "redirect:/";
	}
	
	@RequestMapping(value="/registered")
	public String registered() {
		return "registered";
	}
}
