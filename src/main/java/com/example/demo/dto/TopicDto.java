package com.example.demo.dto;

public class TopicDto {
    public String Sort;
    public String Filter;
    public int  Page;
    public int PerPage;

    public TopicDto(String sort, String filter, int page, int perPage) {
        Sort = sort;
        Filter = filter;
        Page = page;
        PerPage = perPage;
    }
}
