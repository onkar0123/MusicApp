package com.jspider.project1.musicplayer;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class SongsOperation extends Songs{
       
	   static ArrayList<Songs>list=new ArrayList<Songs>();
	   static Scanner sc=new Scanner(System.in);
	SongsOperation(String songName, int songid, String songArtist) {
		super(songName, songid, songArtist);
	}
//    CHOOSE SONG TO PLAY
	public static void ChooseSongToPlay() {
		int srno=0;
		if(list.isEmpty()){
			System.out.println("Songs Not Found!! Download OR Add Songs");
		}
		else{
			for(Songs var:list) {
				System.out.println("Press "+ (srno + 1) +"To Select"+ var.getsongName());
				srno++;
			}
			int a=sc.nextInt();
			System.out.println(list.get(a-1).getsongName()+"is now Running");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
//	PlayAllSongs
	public static void PlayAllSongs() {
		if(list.isEmpty()) {
			System.out.println("No Songs Found In Library");
		}
		else {
			for(Songs var:list) {
				System.out.println(var.getsongName()+"is now running");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
//	PLAY RANDOM SONGS
	public static void PlayRandomSongs() {
		if (list.isEmpty()) {
			System.out.println("Songs Are Not Founds!!");
		} else {
           System.out.println("Playing Random Songs.......!1");
           int max=list.size()-1;
           int min=0;
           System.out.println(list.get((int)(Math.random()*( max-min+1)+min)).getsongName()+"is now running");
           Random rand=new Random();
           System.out.println(list.get((int)(rand.nextInt(list.size()))).getsongName()+"is now Running");
           
		}
	}
//	ADD SONGS
	public static void AddSongs() {
		System.out.println("Please enter the song details like (id,Sname,SArtist");
		try {
			list.add(new Songs(sc.next(),sc.nextInt(),sc.next()));
			System.out.println("Songs added Successfully");
		} catch (InputMismatchException e) {
			System.out.println("Please enter the details again\nwrong credentials were added\n");
		}
	}
//	Remove Songs
	public static void RemoveSongs() {
		if (list.isEmpty()) {
			System.out.println("Songs Not Founds!!");
			return;
		} else {
            int srno=0;
            System.out.println("Which Songs To Want You Remove ");
            for(Songs var:list) {
            	System.out.println(srno + 1 +""+var.songName);
            	srno++;
            }
            int a=sc.nextInt();
            System.out.println(list.get(a-1).getsongName()+"Songs Removed");
            list.remove(a-1);
		}
	}
//	Edit Songs
	public static void EditSongs() {
		if (list.isEmpty()) {
			System.out.println("Songs Not Found!!");
			return;
		} else {
          System.out.println("Which Songs To You Want Edit");
          int srno=0;
          for(Songs var:list) {
        	  System.out.println((srno+1)+ " "+var.songName);
        	  srno++;
          }
          int a=sc.nextInt();
          System.out.println("What you want to change in the song\n1.songid\n2.songName\n3.songAetist");
          int b=sc.nextInt();
          
          switch (b) {
		case 1:
			list.get(a-1).setsongid(sc.nextInt());
			System.out.println("Song Name changed to "+list.get(a-1).getsongid());
			break;
		case 2:
			list.get(a-1).setsongName(sc.next());
			System.out.println("song name changed to "+ list.get(a-1).getsongName());
			break;
		case 3:
			list.get(a-1).setsongArtist(sc.next());
             System.out.println("song Artist changed to "+list.get(a-1).getsongArtist());
			break;
		   }
          
		}
	}
	public static void Back() {
		return;
	}
	
}
