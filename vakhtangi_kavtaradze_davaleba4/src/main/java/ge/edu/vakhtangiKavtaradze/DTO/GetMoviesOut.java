package ge.edu.vakhtangiKavtaradze.DTO;

import lombok.Data;

import java.util.List;

@Data
public class GetMoviesOut {
    private List<MoviesDTO> Movies;
}
