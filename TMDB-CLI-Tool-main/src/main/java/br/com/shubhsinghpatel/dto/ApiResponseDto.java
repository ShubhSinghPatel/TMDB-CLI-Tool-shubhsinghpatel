package br.com.shubhsinghpatel.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResponseDto {

    private List<MovieDto> results;

    public List<MovieDto> getResults() {
        return results;
    }

    public void setResults(List<MovieDto> results) {
        this.results = results;
    }
}
