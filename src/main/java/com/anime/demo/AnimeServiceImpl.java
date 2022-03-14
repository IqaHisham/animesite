/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anime.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Syafiqah Nabilah
 */
@Service
public class AnimeServiceImpl implements AnimeService {

    JSONParser jsonParser = new JSONParser();
    JSONObject jsonObject;
    JSONObject jsonObject2;

//    String url = "https://ghibliapi.herokuapp.com/films";
    List<Movie> movieList = new ArrayList<Movie>();

    public List<Movie> intoArray() {
        try {
            URL url = new URL("https://ghibliapi.herokuapp.com/films");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responsecode = conn.getResponseCode();

            if (responsecode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responsecode);
            } else {

                String inline = "";
                Scanner scanner = new Scanner(url.openStream());

                //Write all the JSON data into a string using a scanner
                while (scanner.hasNext()) {
                    inline += scanner.nextLine();
                }
                    System.out.println(inline);

                //Close the scanner
                scanner.close();
//                this.jsonObject = (JSONObject) jsonParser.parse(inline);
//            JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader("C:/Users/User/Documents/Projects/anime/src/main/java/com/anime/demo/movie.json"));
            JSONArray jsonArray =(JSONArray) jsonParser.parse(inline);

            for(int i =0;i < jsonArray.size();i++){
//                
                jsonObject2 = (JSONObject) jsonArray.get(i);
//                String s = (String) jsonObject2.get("original_title").toString();
//                System.out.println(s);
//                byte[] data = s.getBytes(StandardCharsets.UTF_8);
//                System.out.println(Arrays.toString(data));
//                String s1 = "天空の城ラピュタ";
//                System.out.println(s1);
//                
//                String convertString = new String(data, StandardCharsets.UTF_8);
                System.out.println(jsonObject2.get("title").toString());
                Movie movie = new Movie();
                movie.setId(jsonObject2.get("id").toString());
                movie.setTitle(jsonObject2.get("title").toString());
                movie.setDescription(jsonObject2.get("description").toString());
                movie.setOriginal_title(jsonObject2.get("original_title"));
                movie.setOriginal_title_romanised(jsonObject2.get("original_title_romanised").toString());
                movie.setDirector(jsonObject2.get("director").toString());
                movie.setProducer(jsonObject2.get("producer").toString());
                movie.setReleasedate(jsonObject2.get("release_date").toString());
                movie.setRunningtime(jsonObject2.get("running_time").toString());
                movie.setRtScorel(jsonObject2.get("rt_score").toString());
                movieList.add(movie);
            }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(AnimeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ParseException ex) {
            Logger.getLogger(AnimeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RuntimeException e) {
        }
        return movieList;
    }

    @Override
    public List<Movie> getFilms() {
        movieList = intoArray();
        return movieList;
    }

    @Override
    public Movie getProduct(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
