package com.jackpan.movietimelist.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.jackpan.movietimelist.Data.ChartData;
import com.jackpan.movietimelist.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public ArrayList<ChartData> chartDataList;
    public ChartData mChartData;
    public final String CHART = "https://tw.movies.yahoo.com/chart.html";

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chartDataList = new ArrayList<ChartData>();
        new Thread(){
            @Override
            public void run() {
                super.run();
                try {

                    Document doc = Jsoup.connect("https://tw.movies.yahoo.com/chart.html").get();
//                    for (Element movie_tab : doc.select("div.movie_tab")) {
//
//                        for (Element a_url : movie_tab.getElementsByTag("a")) {
//                            Log.d(TAG, "run: "+a_url.text());
//                            Log.d(TAG, "run: "+a_url.attr("href").toString());
//
//                        }
//
//                    }
//                    for (Element rankstyle1 : doc.select("div.rank_list.table.rankstyle1")) {
////                        "tr[class^=rowGroup]
//                        for (Element td : rankstyle1.select("div[class=tr]")) {
//                            Log.d(TAG, "run: "+td.text());
//                        }
//
//
//                    }
                    for (Element element : doc.select("div#list1.tab-pane")) {
                        Log.d(TAG, "run: "+element.select("div.rankin_time_r").text());
//                        Log.d(TAG, "run: "+element.select("ul.ranking_list_r").toString());
                        for (Element list : element.select("ul.ranking_list_r")) {
                            Log.d(TAG, "run: "+list.text());
                            for (Element a : list.getElementsByTag("a")) {
                                Log.d(TAG, "run: "+a.text());
                                Log.d(TAG, "run: "+a.attr("href").toString());
                            }
                        }


                    }

//                    Log.d(TAG, "doc: "+doc.select("div.area_timebox").toString());
                    //div.area_timebox

//                    for (Element element : doc.select("ul.release_list")) {
//                        for (Element movie_tab : doc.select("div.movie_tab")) {
//                            for (Element a : movie_tab.getElementsByTag("a")) {
//                                Log.d(TAG, "run: "+a.text());
//                                Log.d(TAG, "run: "+a.attr("href").toString());
//
//                            }
//
//                        }
//
//                        for (Element color_btnbox : doc.select("div.page_numbox")) {
////                                    Log.d(TAG, "button: "+color_btnbox.text());
//                            for (Element a : color_btnbox.getElementsByTag("a")) {
//                                Log.d(TAG, "buttnName: "+a.text());
//                                Log.d(TAG, "url: "+a.attr("href").toString());
//                            }
//
//                        }
//                        for (Element release_foto : element.select("div.release_foto")) {
//                            for (Element img : release_foto.getElementsByTag("img")) {
//                                Log.d(TAG, "img: "+      img.attr("src").toString());
//                            }
//
//
//                        }
//                        for (Element release_info : element.select("div.release_info")) {
////                            Log.d(TAG, "release_info_text: "+element2.select("div.release_info_text").text());
//                            for (Element release_info_text : release_info.select("div.release_info_text")) {
//                                Log.d(TAG, "time: "+element.select("div.release_movie_time").get(0).text());
//                                Log.d(TAG, "內文: "+element.select("div.release_text").text());
//                                Log.d(TAG, "點擊全文:" + element.getElementsByTag("a").attr("href").toString());
////
//                                for (Element release_movie_name : release_info_text.select("div.release_movie_name")) {
//                                    for (Element cn : release_movie_name.select("div.release_movie_name")) {
//                                        Log.d(TAG,"cn:"+cn.getElementsByTag("a").text());
//                                    }
////                                    Log.d(TAG,element3.select("div.level_name").text());
////                                    Log.d(TAG,"期待度:"+element3.select("div.leveltext").text());
//                                    for (Element leveltext : release_movie_name.select("div.leveltext")) {
//                                        Log.d(TAG, "期待度: "+leveltext.getElementsByTag("span").get(0).text());
//
//                                    }
//
//                                    for (Element starwithnum : release_movie_name.select("div.leveltext.starwithnum")) {
//                                        Log.d(TAG, "滿意度: "+starwithnum.getElementsByTag("span").attr("data-num").toString());
//                                    }
//                                }
//                                for (Element color_btnbox : release_info_text.select("div.release_btn.color_btnbox")) {
////                                    Log.d(TAG, "button: "+color_btnbox.text());
//                                    for (Element a : color_btnbox.getElementsByTag("a")) {
//                                        Log.d(TAG, "buttnName: "+a.text());
//                                        Log.d(TAG, "url: "+a.attr("href").toString());
//                                    }
//
//                                }
//
//                            }
//
//                        }

//                        Log.d(TAG, "element.text(): "+element.text());
//                        Log.d(TAG, "area_title: "+element.select("div.area_title").text());
//                        Log.d(TAG, "adds: "+element.select("li.adds").text());
//                        Log.d(TAG, "taps: "+element.select("li.taps").text());
//

//                        Log.d(TAG, "run: "+element.select("li.time._c").size());
//                        Log.d(TAG, "run: "+element.select("li.time._c").eq(0).text());
//                        for (String s : element.select("li.time._c").eq(0).text().split(" ")) {
//                            Log.d(TAG, "run: "+s.toString());
//                        }
//                        for (int i = 0; i < element.select("li.time._c").size(); i++) {
//                            for (Element element1 : element.select("li.time._c").eq(i)) {
//                                Log.d(TAG, "run: "+element1.text());
//                            }
//                        }

//                    }
//                    for (Element page : doc.select("div.page_numbox")) {
//                        Log.d(TAG, "run: "+page.getElementsByTag("a").text());
//                        for (Element a : page.getElementsByTag("a")) {
////                            Log.d(TAG, "run: "+a.attr("href"));
//                            Log.d(TAG, "run: "+a.attr("href").toString());
//
//                        }
//
//
//                    }
//                    for (Element element : doc.getElementsByTag("div")) {
//                        Log.d(TAG, "div: "+element.toString());
//                        Log.d(TAG, "text: "+element.text());
////                        for (Element td : element.getElementsByTag("td")) {
////                            for (Element div : td.getElementsByTag("div")) {
////                            }
////                        }
//                    }

                } catch (IOException e) {
                    e.printStackTrace();
                    Log.d(TAG, "run: "+e.getMessage());
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                    }
                });
            }

        }.start();

    }

    public void getMovieChart() {

        new Thread() {
            @Override
            public void run() {
                super.run();
                try {

                    Document doc = Jsoup.connect(CHART).get();
                    for (Element element : doc.select("div#list1.tab-pane")) {
                        for (Element list : element.select("ul.ranking_list_r")) {
//                            Log.d(TAG, "run: " + list.text());
                            for (Element a : list.getElementsByTag("a")) {
//                                Log.d(TAG, "run: " + a.text());
//                                Log.d(TAG, "run: " +);
                                mChartData = new ChartData(a.text(), a.attr("href").toString(), element.select("div.rankin_time_r").text());
                                chartDataList.add(mChartData);

                            }


                        }

                    }
                } catch (IOException e) {
                    e.printStackTrace();

                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                    }
                });

            }
        }.start();
    }
}
