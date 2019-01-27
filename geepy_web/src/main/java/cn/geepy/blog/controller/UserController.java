package cn.geepy.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.geepy.blog.pojo.custom.UserCustom;
import cn.geepy.blog.service.IUserService;

/**
 * 用户的handler
 * @author mac
 *
 */
@Controller
@RequestMapping("/User")
public class UserController {

	@Autowired
	IUserService userService ;
	
	@RequestMapping("/findUserById")
	public @ResponseBody UserCustom findUserById(Integer id) throws Exception{
		
		System.err.println("进入controller");
		UserCustom userCustom = (UserCustom) userService.findUserById(id) ;
	
		return userCustom ;
		
	}
	
	
	
}
