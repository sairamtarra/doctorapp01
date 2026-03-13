package pack1;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class DoctorDAO {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Doctor doctor) {
		String sql = "insert into doctor (name,email,specialist,city,country) values (?,?,?,?,?)";
		return jdbcTemplate.update(sql, doctor.getName(), doctor.getEmail(), doctor.getSpecialist(), doctor.getCity(),
				doctor.getCountry());
	}

	public int update(Doctor doctor) {
		String sql = "update doctor set name=?, email=?, specialist=?, city=?, country=? where id=?";
		return jdbcTemplate.update(sql, doctor.getName(), doctor.getEmail(), doctor.getSpecialist(), doctor.getCity(),
				doctor.getCountry(), doctor.getId());
	}

	public int delete(int id) {
		String sql = "delete from doctor where id=?";
		return jdbcTemplate.update(sql, id);
	}

	public Doctor getDoctorById(int id) {
		String sql = "select * from doctor where id=?";
		return jdbcTemplate.queryForObject(sql, new RowMapperImpl(), id);
	}

	public List<Doctor> getListOfDoctors() {
		String sql = "select * from doctor";
		return jdbcTemplate.query(sql, new RowMapperImpl());
	}
}