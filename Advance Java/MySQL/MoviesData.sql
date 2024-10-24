CREATE DATABASE moviesdao;

USE moviesdao;

CREATE TABLE movies_info(
	movie_id int primary key auto_increment,
    movie_name varchar(255) not null,
    director varchar(255) not null,
    imdb_rating double not null,
    yor int not null
);

INSERT INTO movies_info(movie_id, movie_name, director, imdb_rating, yor) VALUES(101, "Rockstar", "Imtiaz Ali", 7.8, 2011);
INSERT INTO movies_info(movie_name, director, imdb_rating, yor) VALUES("Rockstar", "Imtiaz Ali", 7.8, 2011);