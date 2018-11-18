package fr.emiage.agence.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import fr.emiage.agence.dao.UserAppRepository;
import fr.emiage.agence.entity.User_App;
import fr.emiage.agence.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/pages/users", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("users", userService.listAllUsers());
		return "pages/users";
	}

	@RequestMapping(value = "/pages/user/{id}", method = RequestMethod.GET)
	public String showUser(@PathVariable Long id, Model model) {
		model.addAttribute("user", userService.getUserById(id));
		return "pages/usershow";
	}

	@RequestMapping(value = "/pages/user/edit/{id}", method = RequestMethod.GET)
	public String edit(@PathVariable Long id, Model model) {
		model.addAttribute("user", userService.getUserById(id));
		return "pages/userform";
	}

	@RequestMapping(value = "/user/new", method = RequestMethod.GET)
	public String newUser(Model model) {
		model.addAttribute("user", new User_App());
		return "pages/userform";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String saveProduct(User_App user) {
		userService.saveUser(user);
		return "redirect:/pages/user/" + user.getId();
	}

	@RequestMapping(value = "/user/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable Long id) {
		userService.deleteUser(id);
		return "redirect:/pages/users";
	}
}
