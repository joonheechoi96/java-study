package chap13.sec01.exam06.quiz;

import java.util.Objects;

public class Song {
	private String name;
	private String singer;
	
	public Song() {
		
	}

	public Song(String name, String singer) {
		super();
		this.name = name;
		this.singer = singer;
	}

	public String getName() {
		return name;
	}

	public String getSinger() {
		return singer;
	}

	@Override
	public String toString() {
		return "{제목=" + name + ", 가수=" + singer + "}";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, singer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Song))
			return false;
		Song other = (Song) obj;
		return Objects.equals(name, other.name) && Objects.equals(singer, other.singer);
	}
	
	
}
