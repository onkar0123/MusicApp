package com.jspider.project1.musicplayer;

public class Songs {
	  int songid;
	  String songName;
      String songArtist;
       
      Songs(String songName,int songid,String songArtist){
    	  this.songid=songid;
    	  this.songName=songName;
    	  this.songArtist=songArtist;
      }
      public int getsongid() {
    	  return songid;
      }
      public void setsongid(int songid) {
    	  this.songid=songid;
      }
      public String getsongName() {
    	  return songName;
      }
      public void setsongName(String songName) {
    	  this.songName=songName;
      }
      public String getsongArtist() {
    	  return songArtist;
      }
      public void setsongArtist(String songArtist) {
    	  this.songArtist=songArtist;
      }
}
