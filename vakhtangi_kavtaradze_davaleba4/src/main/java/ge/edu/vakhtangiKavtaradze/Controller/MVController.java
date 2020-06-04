package ge.edu.vakhtangiKavtaradze.Controller;

import ge.edu.vakhtangiKavtaradze.DTO.*;
import ge.edu.vakhtangiKavtaradze.service.MVservice;

import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MVController {

    @Autowired
    MVservice movieService; //zura am errors shentanac agdebda da vegar gavixsene rogor gamoaswore

    @PostMapping("/addMovie")
    public AddMovieOut addMovie(@RequestBody AddMovieIN addMovieInput) {
        return movieService.addMovie(addMovieInput);
    }

    @PostMapping("/deleteMovie")
    public DeleteMovieOut deleteMovie(@RequestBody DeleteMovieIN deleteMovieInput) {
        return movieService.deleteMovie(deleteMovieInput);
    }

    @PostMapping("/getMovies")
    public GetMoviesOut getMovies(@RequestBody GetMoviesIN getMoviesInput) {
        return movieService.getMovies(getMoviesInput);
    }

    @PostMapping("/getMovie")
    public GetMovieOut getMovie(@RequestBody GetMovieIN getMovieInput) {
        return movieService.getMovie(getMovieInput);
    }
}