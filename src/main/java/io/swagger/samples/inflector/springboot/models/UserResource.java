package io.swagger.samples.inflector.springboot.models;

import java.util.Collections;
import java.util.List;

import javax.ws.rs.core.Link;

import org.apache.commons.lang3.NotImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import io.swagger.samples.inflector.springboot.user.User;
import io.swagger.samples.inflector.springboot.user.UserRowMapper;

@Component
public class UserResource implements Resource {
  @Autowired
  private JdbcTemplate jdbcTemplate;
  
    
  private String name_sql = "SELECT Name FROM UserDetails";
  private String dob_sql = "SELECT DoB FROM UserDetails";

  @Override
  public List<Link> getLinks() {
    return Collections.emptyList();
  }

  public String getSurname() {
	  
	User user = (User)jdbcTemplate.queryForObject(name_sql, new UserRowMapper());
	String fullName = user.getName();
	
	//throw new NotImplementedException("TODO");
	return fullName.substring(0, fullName.indexOf(","));
  }

}
