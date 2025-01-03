package com.selleniumexpress.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Generated;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Entity
public class Song {
	
	@Id
	@Column(name="songId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String songName;
	
	@Column(name="artist")
	private String singer;
	public Song() {
		// TODO Auto-generated constructor stub
	}
	public Song(String songName, String singer) {
			
		this.songName = songName;
		this.singer = singer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	@Override
	public String toString() {
		return "Song [id=" + id + ", songName=" + songName + ", singer=" + singer + "]";
	}
	
	
	
	

}
