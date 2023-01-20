package application;
import java.util.ArrayList;

import models.*; 
public class Program {

	public static void main(String[] args) {
	   
		ArrayList<String> TOP = new ArrayList<>();
	   TOP.add("Stressed Out");
	   ArrayList<String> favoritos = new ArrayList<String>();
	   favoritos.add("Stressed Out");
	   
	   Artista artista = new Artista("Twenty One Pilots", 34, "Norte-americanos", TOP);
	   Album album = new Album("BlurryFace", 2015, Genero.pop, 14); 
	   Letra letra = new Letra("ingles", "I wish I found some better sounds no one's ever heard\r\n"
	   		+ "I wish I had a better voice that sang some better words\r\n"
	   		+ "I wish I found some chords in an order that is new\r\n"
	   		+ "I wish I didn't have to rhyme every time I sang\r\n"
	   		+ "I was told when I get older all my fears would shrink\r\n"
	   		+ "But now I'm insecure and I care what people think\r\n"
	   		+ "\r\n"
	   		+ "My name's Blurryface and I care what you think\r\n"
	   		+ "My name's Blurryface and I care what you think\r\n"
	   		+ "\r\n"
	   		+ "Wish we could turn back time to the good old days\r\n"
	   		+ "When our momma sang us to sleep, but now we're stressed out\r\n"
	   		+ "Wish we could turn back time to the good old days\r\n"
	   		+ "When our momma sang us to sleep, but now we're stressed out\r\n"
	   		+ "\r\n"
	   		+ "We're stressed out\r\n"
	   		+ "\r\n"
	   		+ "Sometimes a certain smell will take me back to when I was young\r\n"
	   		+ "How come I'm never able to identify where it's coming from?\r\n"
	   		+ "I'd make a candle out of it if I ever found it\r\n"
	   		+ "Try to sell it, never sell out of it, I'd probably only sell one\r\n"
	   		+ "\r\n"
	   		+ "It'd be to my brother, 'cause we have the same nose\r\n"
	   		+ "Same clothes, homegrown, a stone's throw from a creek we used to roam\r\n"
	   		+ "But it would remind us of when nothing really mattered\r\n"
	   		+ "Out of student loans and treehouse homes, we all would take the latter\r\n"
	   		+ "\r\n"
	   		+ "My name's Blurryface and I care what you think\r\n"
	   		+ "My name's Blurryface and I care what you think\r\n"
	   		+ "\r\n"
	   		+ "Wish we could turn back time to the good old days\r\n"
	   		+ "When our momma sang us to sleep, but now we're stressed out\r\n"
	   		+ "Wish we could turn back time to the good old days\r\n"
	   		+ "When our momma sang us to sleep, but now we're stressed out\r\n"
	   		+ "\r\n"
	   		+ "We used to play pretend, give each other different names\r\n"
	   		+ "We would build a rocket ship, and then we'd fly it far away\r\n"
	   		+ "Used to dream of outer space, but now they're laughing at our face\r\n"
	   		+ "Saying: Wake up, you need to make money, yeah\r\n"
	   		+ "\r\n"
	   		+ "We used to play pretend, give each other different names\r\n"
	   		+ "We would build a rocket ship, and then we'd fly it far away\r\n"
	   		+ "Used to dream of outer space, but now they're laughing at our face\r\n"
	   		+ "Saying: Wake up, you need to make money, yeah\r\n"
	   		+ "\r\n"
	   		+ "Wish we could turn back time to the good old days\r\n"
	   		+ "When our momma sang us to sleep, but now we're stressed out\r\n"
	   		+ "Wish we could turn back time to the good old days\r\n"
	   		+ "When our momma sang us to sleep, but now we're stressed out\r\n"
	   		+ "\r\n"
	   		+ "Used to play pretend, used to play pretend, money\r\n"
	   		+ "We used to play pretend, wake up, you need the money\r\n"
	   		+ "Used to play pretend, used to play pretend, money\r\n"
	   		+ "We used to play pretend, wake up, you need the money\r\n"
	   		+ "\r\n"
	   		+ "We used to play pretend, give each other different names\r\n"
	   		+ "We would build a rocket ship, and then we'd fly it far away\r\n"
	   		+ "Used to dream of outer space, but now they're laughing at our face\r\n"
	   		+ "Saying: Wake up, you need to make money, yeah" );
	   Musica musica = new Musica("Stressed Out", 2015, "3:45", "BlurryFace", Genero.pop);
	   Playlist playlist = new Playlist("Playlist do Nick", 1, "Stressed out");
	   Usuario usuario = new Usuario("Nicolas", 19, "Brasileiro", favoritos);
	   
	   
	   
	   System.out.print(artista);
	   System.out.println(album);
	   System.out.println(musica);
	   System.out.println(letra);
	   System.out.println(usuario);
	   System.out.println(playlist);
	   
	   
	   
	}
	

}
