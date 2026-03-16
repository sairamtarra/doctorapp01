package pack1;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImpl implements RowMapper<Doctor> {

	@Override
	public Doctor mapRow(ResultSet rs, int rowNum) throws SQLException {

		Doctor doctor = new Doctor();
		doctor.setId(rs.getInt("id"));
		doctor.setName(rs.getString("name"));
		doctor.setEmail(rs.getString("email"));
		doctor.setSpecialist(rs.getString("specialist"));
		doctor.setCity(rs.getString("city"));
		doctor.setCountry(rs.getString("country"));

		return doctor;
	}
}