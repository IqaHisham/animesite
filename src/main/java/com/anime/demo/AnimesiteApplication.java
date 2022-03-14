package com.anime.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AnimesiteApplication {

    private static final Logger log = LoggerFactory.getLogger(AnimesiteApplication.class);

    @Bean
    public RestTemplate getRestTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    public static void main(String[] args) {
        SpringApplication.run(AnimesiteApplication.class, args);
//        try {
//            URL url = new URL("https://ghibliapi.herokuapp.com/films");
//
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//            conn.setRequestMethod("GET");
//            conn.connect();
//
//            //Getting the response code
//            int responsecode = conn.getResponseCode();
//
//            if (responsecode != 200) {
//                throw new RuntimeException("HttpResponseCode: " + responsecode);
//            } else {
//                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));
//                FileOutputStream fo = new FileOutputStream("C:/Users/User/Documents/Projects/anime/src/main/java/com/anime/demo/movie.json");
//                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fo));
//                String inline = br.readLine();
////
//                //Write all the JSON data into a string using a scanner
//                while (inline != null) {
//                    bw.write(inline);
//                    bw.newLine();
//                    inline = br.readLine();
//                }
//
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
                              
    }

}
