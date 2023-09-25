package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.UserService;
import web.service.UserServiceImplementation;

@Controller
public class UsersController {

	private final UserService us;

	@Autowired
	UsersController(UserService us) {
		this.us = us;
	}

	@GetMapping(value = "/")
	public String printUsersTable(ModelMap model) {
		return "index";
	}
}