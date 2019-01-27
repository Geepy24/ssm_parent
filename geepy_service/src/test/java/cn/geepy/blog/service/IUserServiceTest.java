package cn.geepy.blog.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.geepy.blog.pojo.User;

public class IUserServiceTest {
	
	@Autowired
	IUserService userService ;
	
	@Test
	public void testFindUserById()  {
		
		System.out.println("service test1 begin");
		User user;
		try {
			user = userService.findUserById(1);
			System.out.println("service test1 result:"+user.getUsername());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
