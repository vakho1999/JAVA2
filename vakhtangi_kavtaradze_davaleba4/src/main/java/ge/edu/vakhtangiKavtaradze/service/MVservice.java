package ge.edu.vakhtangiKavtaradze.service;


import ge.edu.vakhtangiKavtaradze.DTO.*;

public interface MVservice {
    AddMovieOut addMovie(AddMovieIN addMovieInput);

    DeleteMovieOut deleteMovie(DeleteMovieIN deleteMovieInput);

    GetMoviesOut getMovies(GetMoviesIN getMoviesInput);

    GetMovieOut getMovie(GetMovieIN getMovieInput);
}