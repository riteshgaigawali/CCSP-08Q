package learnjdbc.examples.entity;

import java.util.Date;

public class Movie {
	
	private int movie_id; 
	private String movie_name;
	private String director;
	private double imdb_rating;
	private int yor;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(String movie_name, String director, double imdb_rating, int yor) {
		super();
		this.movie_name = movie_name;
		this.director = director;
		this.imdb_rating = imdb_rating;
		this.yor = yor;
	}
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public double getImdb_rating() {
		return imdb_rating;
	}
	public void setImdb_rating(double imdb_rating) {
		this.imdb_rating = imdb_rating;
	}
	public int getYor() {
		return yor;
	}
	public void setYor(int yor) {
		this.yor = yor;
	}
	
	
	
	

}
