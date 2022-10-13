package com.example.demo.spring.cloud.dubbo.commons.entity;

import lombok.Data;

import java.util.List;

@Data
public class Pagination<T> {
    private long page;
    private long size;
    private long total;
    private long totalPages;
    private List<T> data;

    public Pagination() {
    }

    public Pagination(long page, long size, long total, long totalPages, List<T> data) {
        this.page = page;
        this.size = size;
        this.total = total;
        this.totalPages = totalPages;
        this.data = data;
    }
}
