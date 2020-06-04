package ge.edu.vakhtangiKavtaradze.Repo;

import ge.edu.vakhtangiKavtaradze.MovieModel.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repository extends JpaRepository<Movie, Long> {
}