package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import dto.Dto;

public class Dao {

	private JdbcTemplate jdbcTemplate;
	
	public Dao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	// 등록
	public void insertDto(Dto dto){
		String sql = "insert into member(id, name, age) values(?,?,?)";
		jdbcTemplate.update(sql, dto.getId(), dto.getName(), dto.getAge());
	}
	
	// id로 검색
	public Dto searchId(String id){
		String sql = "select * from member where id = ?";
		Dto dto = jdbcTemplate.queryForObject(sql, 
				new RowMapper<Dto>() {
					@Override
					public Dto mapRow(ResultSet rs, int rowNum) throws SQLException {
						Dto dto = new Dto();
						dto.setId(rs.getString("id"));
						dto.setName(rs.getString("name"));
						dto.setAge(rs.getInt("age"));
						return dto;
					}
		}, id);
		return dto;
	}
	
	// 모두 출력
	public List<Dto> selectAll(){
		String sql = "select * from member";
		List<Dto> results = jdbcTemplate.query(sql, new RowMapper<Dto>() {

			@Override
			public Dto mapRow(ResultSet rs, int rowNum) throws SQLException {
				Dto dto = new Dto();
				dto.setName(rs.getString("name"));
				dto.setId(rs.getString("id"));
				dto.setAge(rs.getInt("age"));
				return dto;
			}
			
		});
		return results;
	}
	
	public int allCount() {
		String sql = "select count(*) from member";
		Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
		return count;
	}
}
