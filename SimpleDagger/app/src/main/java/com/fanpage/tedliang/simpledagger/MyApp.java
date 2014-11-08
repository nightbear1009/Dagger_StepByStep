package com.fanpage.tedliang.simpledagger;

import android.app.Application;

import com.fanpage.tedliang.simpledagger.Modules.MyAppModules;
import com.fanpage.tedliang.simpledagger.Modules.SchoolModules;


import java.util.Arrays;

import dagger.ObjectGraph;

/**
 * Created by tedliang on 14/11/8.
 */
public class MyApp extends Application {
    ObjectGraph graph;

    @Override
    public void onCreate() {
        super.onCreate();

        graph = ObjectGraph.create(new MyAppModules());
        graph.inject(this);
    }

}
