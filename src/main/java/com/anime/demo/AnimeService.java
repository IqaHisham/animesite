/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anime.demo;

import java.util.List;

/**
 *
 * @author Syafiqah Nabilah
 */
public interface AnimeService {
    List<Movie> getFilms();
     Movie getProduct(String id);
}
