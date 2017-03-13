package edu.zju.spring.mysql;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class SingerNamedParameterJdbcTemplate implements SingerDAO
{

	private DataSource dataSource;

	private NamedParameterJdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource ds)
	{
		this.dataSource = ds;
		this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	public void create(String name)
	{
		// TODO Auto-generated method stub

	}

	public Singer getSinger(Integer id)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public List<Singer> listSingers()
	{
		final String SQL = "select * from singers";
		List<Singer> list = jdbcTemplate.query(SQL, new SingerMapper());
		return list;
	}

}
