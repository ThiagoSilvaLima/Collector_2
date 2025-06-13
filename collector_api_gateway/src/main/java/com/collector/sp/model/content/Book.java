package com.collector.sp.model.content;

import java.util.UUID;

@Getters
@Setters
public class Book{
    private UUID id;
    private String name;
    private ContentType type;
    private String url_content;
    private String url_cover;


}