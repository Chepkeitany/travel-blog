package com.chepkeitany.travelblog.http;

import java.util.List;
import java.util.ArrayList;

public class BlogData {

    private List<Blog> data;

    public List<Blog> getData() {
        return data != null ? data : new ArrayList<>();
    }
}