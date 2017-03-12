package edu.zju.spring.mysql;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SingerMapper implements RowMapper<Singer>
{

	public Singer mapRow(ResultSet rs, int count) throws SQLException
	{
		Singer singer = new Singer();
		singer.setId(rs.getInt("id"));
		singer.setName(rs.getString("name"));
		singer.setState(rs.getString("state"));
		singer.setAlbums(rs.getInt("albums"));
		singer.setSongs(rs.getInt("songs"));
		singer.setMvs(rs.getInt("mvs"));
		singer.setFollowers(rs.getString("followers"));
		return singer;
	}

}
