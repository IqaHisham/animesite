package com.anime.demo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Syafiqah Nabilah
 */

public class Movie {

    private String id, title, original_title_romanised, description, director, producer, releasedate, runningtime,rtScorel;
    Object original_title;
    public Movie() {
        super();
    }

    public Movie(String id, String title, Object original_title, String original_title_romanised, String description, String director, String producer, String releasedate, String runningtime, String rtScorel) {
        super();
        this.id = id;
        this.title = title;
        this.original_title = original_title;
        this.original_title_romanised = original_title_romanised;
        this.description = description;
        this.director = director;
        this.producer = producer;
        this.releasedate = releasedate;
        this.runningtime = runningtime;
        this.rtScorel = rtScorel;
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(Object original_title) {
        this.original_title = original_title;
    }

    public String getOriginal_title_romanised() {
        return original_title_romanised;
    }

    public void setOriginal_title_romanised(String original_title_romanised) {
        this.original_title_romanised = original_title_romanised;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate;
    }

    public String getRunningtime() {
        return runningtime;
    }

    public void setRunningtime(String runningtime) {
        this.runningtime = runningtime;
    }

    public String getRtScorel() {
        return rtScorel;
    }

    public void setRtScorel(String rtScorel) {
        this.rtScorel = rtScorel;
    }
    
}
