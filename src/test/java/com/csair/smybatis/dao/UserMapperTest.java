package com.csair.smybatis.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.csair.smybatis.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml"  })
public class UserMapperTest {
	@Autowired
	private UserMapper userMapper;
	
	public UserMapper getUserMapper() {
		return userMapper;
	}


	
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Test
	public void testDeleteByPrimaryKey(){
		userMapper.deleteByPrimaryKey("123");
	}
	

	@Test
	public void testInsert(){
		User user = new User();
		user.setId("123");
		user.setName("马化腾");
		userMapper.insert(user);
	}
	
	@Test
	public void testGetAll(){
		List<User> users = userMapper.getAll();
		for (User user : users) {
			System.out.println(user.getName());
		}
	}
}
