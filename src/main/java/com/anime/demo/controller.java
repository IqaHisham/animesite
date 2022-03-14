/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.anime.demo;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Syafiqah Nabilah
 */
@org.springframework.stereotype.Controller
public class controller {
    @Autowired
    AnimeService anime;
    private RestTemplate restTemplate;
    
    private static String url  = "https://ghibliapi.herokuapp.com/";
    @GetMapping("/")
    public String root(RestTemplate restTemplate, Model model)
    {
        return "index";
    }
    
    
    @RequestMapping("/films")
    public String getFilms(Model model)
    {
        List<Movie> list = anime.getFilms();
        model.addAttribute("films", list);
        return "listFilm";
    }
//    @GetMapping("films/{id}")
//    public Movie movieInfo(String id){
//        Movie movie = restTemplate.getForObject(url, responseType)
//    }
}
