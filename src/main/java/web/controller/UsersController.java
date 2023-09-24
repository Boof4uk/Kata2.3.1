package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.models.User;
import web.service.UserServiceImplementation;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UsersController {

	@Autowired
	private UserServiceImplementation userServiceImplementation;



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