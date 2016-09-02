package com.csair.smybatis.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.csair.smybatis.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml" })
public class UserServiceTest {
	
	@Autowired
	private IUserService userService;

	@Test
	public void testInsert(){
		User user = new User();
		user.setId("123");
		user.setName("马化腾");
		userService.addUser(user);
	}
}
