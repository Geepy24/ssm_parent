package cn.geepy.blog.mapper;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.geepy.blog.pojo.User;
import cn.geepy.blog.pojo.UserExample;

public class UserMapperTest {
	
	private ApplicationContext applicationContext ;
	private UserMapper userMapper ;
	
	@Before
	public void setUp() {
	
		applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext-dao.xml") ; 
		userMapper = (UserMapper) applicationContext.getBean("userMapper") ;
		
	}
	
	@Test
	public void testSelectByPrimaryKey() {
		
		//普通查询
		System.out.println("test1 begin");
		User user = userMapper.selectByPrimaryKey(1) ;
		System.out.println("test1 result:"+user.getUsername());
		
		//example查询
		System.out.println("test2 begin");
		UserExample userExample = new UserExample() ;
		UserExample.Criteria criteria = userExample.createCriteria() ;
		criteria.andUsernameEqualTo("Geepy") ;
		List<User> list = userMapper.selectByExample(userExample) ;
		System.out.println("test2 result:"+list.get(0).getUid());
		
	}

}
