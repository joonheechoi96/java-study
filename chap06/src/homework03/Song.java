package homework03;

public class Song {
	public String songTitle;
	protected String singer;
	private static int publishYear = 2009;
	private static final String albumName = "1집";
	
	public Song(String songTitle, String singer) {
		this.songTitle = songTitle;
		this.singer = singer;
	}
	
	void printInfo() {
		System.out.println(publishYear + "년, " + singer + "의 " + albumName + " 수록곡 " + songTitle + "입니다.");
	}
	
	
}
