package com.jackpan.movietimelist.Data;

/**
 * Created by JackPan on 2017/10/28.
 */

public class ChartData {
    public String movieName = "";
    public String movieUrl = "";
    public String moviwUpdataTime = "";
    public ChartData(String name ,String url ,String time) {


        this.movieName = name;
        this.movieUrl = url;
        this.moviwUpdataTime = time;
    }

    public ChartData() {

        this.movieName = "";
        this.movieUrl = "";
        this.moviwUpdataTime = "";
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieUrl(String movieUrl) {
        this.movieUrl = movieUrl;
    }

    public String getMovieUrl() {
        return movieUrl;
    }

    public void setMoviwUpdataTime(String moviwUpdataTime) {
        this.moviwUpdataTime = moviwUpdataTime;
    }

    public String getMoviwUpdataTime() {
        return moviwUpdataTime;
    }
}
