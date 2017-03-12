package edu.zju.spring.mysql;

import java.util.List;

import javax.sql.DataSource;

public interface SingerDAO
{
	public void setDataSource(DataSource ds);

	public void create(String name);

	public Singer getSinger(Integer id);
	
	public List<Singer> listSingers();

}
