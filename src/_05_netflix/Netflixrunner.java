package _05_netflix;

import javax.swing.JOptionPane;

public class Netflixrunner {
public static void main(String[] args) {
	Movie movie1= new Movie("Black Panther", 4);
	Movie movie2= new Movie("Spiderman Far from Home", 5);
	Movie movie3= new Movie("Aquaman", 1);
	Movie movie4= new Movie("Endgame", 2);
	Movie movie5= new Movie("Infinity War", 2);
	String price;
	
	price=movie1.getTicketPrice();
	JOptionPane.showConfirmDialog(null, price);
	NetflixQueue net= new NetflixQueue();
	net.addMovie(movie1);
	net.addMovie(movie2);
	net.addMovie(movie3);
	net.addMovie(movie4);
	net.addMovie(movie5);
	
	net.printMovies();
	String r;
	
	Movie best = net.getBestMovie();
	r=best.getTitle();
	
System.out.println("The best movie is "+r);
String f;

Movie bes = net.getestMovie();
f=bes.getTitle();
System.out.println("The second best movie is "+f);
}
}
