package cn.geepy.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.geepy.blog.mapper.UserMapper;
import cn.geepy.blog.pojo.User;
import cn.geepy.blog.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userMapper ;
	
	
	@Override
	public User findUserById(int id) throws Exception {
		
		return userMapper.selectByPrimaryKey(id) ;
	}

}
