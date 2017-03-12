package edu.zju.spring.mysql;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class SingerJDBCTemplateDAO implements SingerDAO
{
	private DataSource dataSource;

	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource ds)
	{
		this.dataSource = ds;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public Singer getSinger(Integer id)
	{
		String SQL = "select * from singers where id=?";
		Singer singer = jdbcTemplate.queryForObject(SQL, new Object[]
			{ 2980 }, new SingerMapper());

		return singer;
	}

	public void create(String name)
	{

	}

	public List<Singer> listSingers()
	{
		String SQL = "select * from singers";
		List<Singer> singers = jdbcTemplate.query(SQL, new SingerMapper());

		return singers;
	}

}
