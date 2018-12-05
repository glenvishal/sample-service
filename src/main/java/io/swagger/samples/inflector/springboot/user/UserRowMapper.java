package io.swagger.samples.inflector.springboot.user;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper
{
	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		//user.setDob(rs.getString("DoB"));
		user.setName(rs.getString("Name"));
		return user;
	}

}
