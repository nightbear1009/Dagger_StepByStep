package com.fanpage.tedliang.simpledagger.Modules;

import com.fanpage.tedliang.simpledagger.MyActivity;
import com.fanpage.tedliang.simpledagger.model.Teacher;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tedliang on 14/11/8.
 */

@Module(
        injects = MyActivity.class,overrides = true
)
public class MockSchool {

    @Provides
    Teacher providesTeacher() {
        return new MockTeacher();
    }
}


