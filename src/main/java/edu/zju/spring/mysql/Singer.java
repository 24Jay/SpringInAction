package edu.zju.spring.mysql;

public class Singer
{
	private int id;
	private String name;
	private String state;
	private int albums;
	private int songs;
	private int mvs;
	private String followers;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public int getAlbums()
	{
		return albums;
	}

	public void setAlbums(int albums)
	{
		this.albums = albums;
	}

	public int getSongs()
	{
		return songs;
	}

	public void setSongs(int songs)
	{
		this.songs = songs;
	}

	public int getMvs()
	{
		return mvs;
	}

	public void setMvs(int mvs)
	{
		this.mvs = mvs;
	}

	public String getFollowers()
	{
		return followers;
	}

	public void setFollowers(String followers)
	{
		this.followers = followers;
	}

	public String toString()
	{
		StringBuilder s = new StringBuilder();
		s.append("{id=" + id);
		s.append(", name=" + name);
		s.append(", songs=" + songs);
		s.append(", state=" + state);
		s.append(", mvs=" + mvs);
		s.append(", followers=" + followers + "}");
		return s.toString();
	}

}
