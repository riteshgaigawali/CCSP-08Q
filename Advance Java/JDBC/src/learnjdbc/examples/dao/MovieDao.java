package learnjdbc.examples.dao;

import learnjdbc.examples.entity.Movie;

public interface MovieDao {

	public void addMovie(Movie movie);
	public void getAllMovies();
	public void updateMovie(int id);
	public void deleteMovie(int id);
	
}
