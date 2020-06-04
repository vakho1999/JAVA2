package ge.edu.vakhtangiKavtaradze.service.imple;

import ge.edu.vakhtangiKavtaradze.DTO.*;
import ge.edu.vakhtangiKavtaradze.MovieModel.Movie;

import ge.edu.vakhtangiKavtaradze.Repo.repository;
import ge.edu.vakhtangiKavtaradze.service.MVservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MVServiceImplement implements MVservice{

    @Autowired
    repository MVRepository;

    @Override
    public AddMovieOut addMovie(AddMovieIN addMovieInput) {
        Movie movie = new Movie();
        movie.setTitle(addMovieInput.getTitle());
        movie.setCountry(addMovieInput.getCountry());

        MVRepository.save(movie);

        AddMovieOut addMovieOutput = new AddMovieOut();
        addMovieOutput.setAddStatus(" 200 ");
        return addMovieOutput;
    }

    @Override
    public DeleteMovieOut deleteMovie(DeleteMovieIN deleteMovieInput) {
        Movie movie = MVRepository.getOne(deleteMovieInput.getId());
        MVRepository.delete(movie);

        DeleteMovieOut deleteMovieOutput = new DeleteMovieOut();
        deleteMovieOutput.setDeleteStatus(" 200 ");
        return deleteMovieOutput;
    }

    @Override
    public GetMoviesOut getMovies(GetMoviesIN getMoviesInput) {
        List<MoviesDTO> movies = new ArrayList<>();

        for (Movie movie : MVRepository.findAll()) {
            MoviesDTO movieDTO = new MoviesDTO();
            movieDTO.setId(movie.getId());
            movieDTO.setTitle(movie.getTitle());
            movieDTO.setCountry(movie.getCountry());

            movies.add(movieDTO);
        }

        GetMoviesOut getMoviesOutput = new GetMoviesOut();
        getMoviesOutput.setMovies(movies);
        return getMoviesOutput;
    }

    @Override
    public GetMovieOut getMovie(GetMovieIN getMovieInput) {
        Movie movie = MVRepository.getOne(getMovieInput.getId());

        GetMovieOut getMovieOutput = new GetMovieOut();
        getMovieOutput.setTitle(movie.getTitle());
        getMovieOutput.setCountry(movie.getCountry());

        return getMovieOutput;
    }
}