package com.jackpan.movietimelist.Data;

import android.content.Context;
import android.util.Log;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by JackPan on 2017/10/28.
 */

public class MoiveResponse {
    public  static  ArrayList<ChartData> chartDataList = new ArrayList<>();
    private static final String TAG = "MoiveResponse";
    public static  final  String CHART = "https://tw.movies.yahoo.com/chart.html";



}
