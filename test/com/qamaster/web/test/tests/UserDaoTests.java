package com.qamaster.web.test.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qamaster.web.dao.UserDao;
import com.qamaster.web.model.User;

@ActiveProfiles("dev")
@ContextConfiguration(locations={"classpath:com/qamaster/web/config/dao-context.xml",
		"classpath:com/qamaster/web/test/config/datasource.xml",
		"classpath:com/qamaster/web/config/security-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserDaoTests {
	
	private static final  Logger logger = Logger.getLogger(UserDaoTests.class);
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private DataSource dataSource;
	
	@Before
	public void init() {
		JdbcTemplate jdbc = new JdbcTemplate(dataSource);
	}
	
	@Test
	public void testCreateUser() {
		logger.debug("Running test, inside testcreateuser method()");
		User user = new User("jhon", "raghu123", "email",  true, "user");
		assertTrue("User creation should return true", userDao.create(user));
	
	}

}
