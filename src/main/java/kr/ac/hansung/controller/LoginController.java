package kr.ac.hansung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String  doLogin(@RequestParam(value="error", required=false)String error,
							@RequestParam(value="logout", required=false)String logout,
							Model model) {
		if(error != null) {
			model.addAttribute("errorMsg", "login_error");
		}
		if(logout != null) {
			model.addAttribute("logoutMsg", "logout_success");
		}
		return "login";
	}
}
