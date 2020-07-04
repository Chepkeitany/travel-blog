package com.chepkeitany.travelblog.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.chepkeitany.travelblog.http.Blog;

@Database(entities = {Blog.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract BlogDAO blogDao();
}