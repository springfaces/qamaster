package com.qamaster.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.qamaster.web.model.Offer;
import com.qamaster.web.model.User;

@Component("userDao")
public class UserDao {

	private NamedParameterJdbcTemplate jdbc;

	public UserDao() {
		System.out.println("Successsfully loaded offer DAO");
	}

	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}

	public List<User> getUsers() {
		return jdbc.query("select * from users", new RowMapper<User>() {
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();
				user.setUsername(rs.getString("username"));
				user.setEmail(rs.getString("email"));
				
				return user;
			}
		});

	}

	

	@Transactional
	public boolean create(User user) {

		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(user);
		 jdbc.update("insert into users (username, password, email, enabled) "
				+ "values (:username, :password, :email, :enabled)", params);
		 return jdbc.update("insert into authorities (username, authority) values(:username, :authority)", params) ==  1;
	}
		
}
