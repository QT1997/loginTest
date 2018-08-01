package com.controller;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Users;
import com.service.UsersService;

@Controller
@Scope("prototype")
public class LoginController extends GenericController {

	@Resource(name = "usersService")
	private UsersService usersService;

	public UsersService getUsersService() {
		return usersService;
	}

	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}

	@RequestMapping(value = "/LoginController_login.do")
	public String login(Users users) {
		Users currentUser = this.usersService.loginValidate(users.getUsername());
		if (currentUser == null) {
			this.request.setAttribute("error", "该账户不存在");
			return "login";
		} else {
			if (currentUser.getPassword().equals(users.getPassword())) {
				this.session.setAttribute("currentUser", currentUser);
				return "index";
			} else {
				this.request.setAttribute("error", "密码错误");
				return "login";
			}
		}
	}

	@RequestMapping(value = "/LoginController_logout.do")
	public String logout() {
		return "success";
	}

}
