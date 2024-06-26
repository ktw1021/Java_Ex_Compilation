package com.javaex.ex03;

public class Song {
	
	/*
	 * 에상 결과:
	 * Song(파라미터6개)
	 * 실제 결과:
	 * Song(파라미터5개)
	 * Song(파라미터6개)
	 * - 5개 파라미터를 가진 메소드에 들락날락하도록 설계되어있어, 
	 * 두 줄이 출력되는 것임.
	 */
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	
	public Song() {
		System.out.println("Song(파라미터0개)");	
		}
	
	public Song(String title, String artist, String album, String composer, String year) {
		this.title=title;
		this.artist=artist;
		this.album=album;
		this.composer=composer;
		this.year=year;
		System.out.println("Song(파라미터5개)");
	}
	
	public Song(String title, String artist, String album, String composer, String year, int track) {
	this(title, artist, album, composer,year);
	this.track=track;
	System.out.println("Song(파라미터6개)");
	}
	
}
