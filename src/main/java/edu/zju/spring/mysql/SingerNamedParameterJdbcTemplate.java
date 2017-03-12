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
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		return null;
	}

}
