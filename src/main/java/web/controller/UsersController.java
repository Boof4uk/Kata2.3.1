package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.UserServiceImplementation;

@Controller
public class UsersController {

	private final UserServiceImplementation usil;

	@Autowired
	UsersController(UserServiceImplementation usil) {
		this.usil = usil;
	}

	@GetMapping(value = "/")
	public String printUsersTable(ModelMap model) {
//		userServiceImplementation.addUser("Vlad", "Egorov");
//		userServiceImplementation.addUser("Sasha", "Lopuxov");
//		userServiceImplementation.addUser("Egor", "Koninov");
//		userServiceImplementation.addUser("Dima", "Pavlov");
//		model.addAttribute("usersList", userServiceImplementation.getUserTable());
		return "index";
	}
}