package com.javaex.oop.song.v2;

public class Song {
	//	필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public Song () {
		
	}
	
	public Song (String title) {
		this.title=title;
		System.out.println("title 생성자");
	}
	
	public Song (String title, String artist) {
		this.title=title;
		this.artist=artist;
		System.out.println("title, artist 생성자");
	}
	
	public Song (String title, String artist, String album, String composer, int year, int track) {
		this(title,artist);
		this.album=album;
		this.composer=composer;
		this.year=year;
		this.track=track;
		System.out.println("전체 생성자");
	}
	
	//	getters/setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist=artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album=album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer=composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track=track;
	}
	//	일반 메서드
	public void showInfo() {
		System.out.printf("%s, %s( %s, %d, %d번 track, %s 작곡 )%n",
				artist,title,album,year,track,composer);
		return;
	}
	
	
}
