package com.jspider.project1.musicplayer;
  import java.util.Scanner;
public class MultiPlayer extends SongsOperation {

	MultiPlayer(String songName, int songid, String songArtist) {
		super(songName, songid, songArtist);
		// TODO Auto-generated constructor stub
	}
      static Scanner sc=new Scanner(System.in);
      static boolean loop=true;
      
      public static void manu() {
    	  System.out.println("Select anything from the menu\n1.PlaySongs\n2.AddSongs\n3.RemoveSongs\n4.EditSong\n5.DisplayAllSongs\n6.Exit");
    	  int a=sc.nextInt();
    	  switch(a) {
    	  case 1:PlaySongs();
    	  break;
    	  case 2:AddSongs();
    	  break;
    	  case 3:RemoveSongs();
    	  break;
    	  case 4:EditSong();
    	  break;
    	  case 5:DisplayAll();
    	  break;
    	  case 6:
    	     System.out.println("Thank You");
    	     loop=false;
    	     break;
    	     default:
    	    	 System.out.println("Input Invalid");
    	    	 return;
      }
}
//      PlaySongs
	public static void PlaySongs() {
		
		System.out.println("Select from the below options\n1.chooseSongToPlay\n2.PlayAllSongs\n3.PlayRandomSongs");
		int a=sc.nextInt();
		switch(a) {
		case 1:
			SongsOperation.ChooseSongToPlay();
			break;
		case 2:
			SongsOperation.PlayAllSongs();
			break;
		case 3:
			SongsOperation.PlayRandomSongs();
			break;
			default:
				System.out.println("Wrong Option Selected");
		}
		
		
	}
//	AddSongs
	public static void AddSongs() {
		System.out.println("Do Want Add Now Songs\n1.Yes\n2.No");
		int a=sc.nextInt();
		switch(a) {
		case 1:
			SongsOperation.AddSongs();
			break;
		case 2:
			return;
		}
	}
//	RemoveSongs
	public static void RemoveSongs() {
	 System.out.println("Do you want to remove songs\n1.Yes\n2.No");
	 int a=sc.nextInt();
	 switch(a) {
	 case 1:
		 SongsOperation.RemoveSongs();
		 break;
	 case 2:
		 return;
		 default:
			 break;
	 }
	}
//  EditSongs
	public static void EditSong() {
		System.out.println("Do you want Edit ur Song\n1.Yes\n2.No");
		int a=sc.nextInt();
		switch(a) {
		case 1:
			SongsOperation.EditSongs();
			break;
		case 2:
			return;
			default:
				break;
		}
		
	}
//	DisPlayAll
	public static void DisplayAll() {
	    for(Songs var:list) {
	    	int srno=0;
		System.out.println(srno+1+" songld "+var.getsongid()+"songsName"+var.getsongName()+"songArtist"+var.getsongArtist());
	    }
		return;
		}
	public static void main(String[] args) {
		while(loop) {
			System.out.println("Welcome to the Music Player Mr.XYZ");
			manu();
		}
	}
}
