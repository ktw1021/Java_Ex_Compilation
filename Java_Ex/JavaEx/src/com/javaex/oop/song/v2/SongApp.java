package com.javaex.oop.song.v2;

public class SongApp {

	public static void main(String[] args) {
		
		Song song1 = new Song();
		Song song2 = new Song();
		Song song3 = new Song();
		
		song1.setTitle("좋은날");
		song1.setArtist("아이유");
		song1.setAlbum("Real");
		song1.setComposer("이민수");
		song1.setYear(2010);
		song1.setTrack(3);
		
		song2.setTitle("거짓말");
		song2.setArtist("BIGBANG");
		song2.setAlbum("Always");
		song2.setComposer("G-DRAGON");
		song2.setYear(2007);
		song2.setTrack(2);
		
		song3.setTitle("벚꽃엔딩");
		song3.setArtist("버스커버스커");
		song3.setAlbum("버스커버스커1집");
		song3.setComposer("장범준");
		song3.setYear(2012);
		song3.setTrack(4);
		
		
		song1.showInfo();
		song2.showInfo();
		song3.showInfo();
		System.out.println();
		
		Song s1 = new Song("네버엔딩스토리","김태원","이얍","김태원",1994,2);
		s1.showInfo();
		
	}

}
