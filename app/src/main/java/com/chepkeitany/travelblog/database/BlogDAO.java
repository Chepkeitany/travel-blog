package com.chepkeitany.travelblog.database;

import androidx.room.*;
import java.util.List;

import com.chepkeitany.travelblog.http.Blog;

@Dao
public interface BlogDAO {
    @Query("SELECT * FROM blog")
    List<Blog> getAll();

    @Insert
    void insertAll(List<Blog> blogList);

    @Query("DELETE FROM blog")
    void deleteAll();
}
