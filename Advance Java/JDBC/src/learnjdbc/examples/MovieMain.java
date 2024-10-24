package learnjdbc.examples;

import learnjdbc.examples.dao.MovieDao;
import learnjdbc.examples.dao.MovieDaoImpl;
import learnjdbc.examples.entity.Movie;

public class MovieMain {

	public static void main(String[] args) {
		
		MovieDao movieDao = new MovieDaoImpl();
		
//		Movie movie1 = new Movie("Jawan", "Atlee", 6.9, 2023);
//		movieDao.addMovie(movie1);
//		movieDao.updateMovie(102);
		movieDao.deleteMovie(103);
		movieDao.getAllMovies();
		

	}

}
