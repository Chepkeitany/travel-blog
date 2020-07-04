package com.chepkeitany.travelblog.repository;

import java.util.List;
import com.chepkeitany.travelblog.http.Blog;

public interface DataFromNetworkCallback {
    void onSuccess(List<Blog> blogList);
    void onError();
}