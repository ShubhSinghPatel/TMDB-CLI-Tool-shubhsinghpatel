package br.com.shubhsinghpatel;

import java.util.List;
import java.util.Map;

import br.com.shubhsinghpatel.dto.MovieDto;
import br.com.shubhsinghpatel.service.ServiceApi;

public class Main {
    public static void main(String[] args) {
        ServiceApi serviceApi = new ServiceApi();

        Map<String, String> mapTypes = Map.of("playing", "now_playing",
                "popular", "popular",
                "top", "top_rated",
                "upcoming", "upcoming");

        if (args.length == 0 || !mapTypes.containsKey(args[0].toLowerCase())) {
            System.err.println("Error: Please provide a valid --type. Read README.md");
            System.exit(0);
        }

        String type = mapTypes.get(args[0]);

        List<MovieDto> movies = serviceApi.getMoviesByType(type);
        for (MovieDto movie : movies) {
            System.out.println(movie);
        }
    }
}
