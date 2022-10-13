package com.example.demo.spring.cloud.dubbo.rds.commons.entity;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.PageInfo;
import lombok.Data;
import org.springframework.data.domain.Page;

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

    public Pagination(Page<T> page) {
        this(page.getNumber() + 1, page.getSize(), page.getTotalElements(), page.getTotalPages(), page.getContent());
    }

    public Pagination(IPage<T> iPage) {
        this(iPage.getCurrent(), iPage.getSize(), iPage.getTotal(), iPage.getPages(), iPage.getRecords());
    }

    public Pagination(PageInfo<T> pageInfo) {
        this(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getTotal(), pageInfo.getPages(), pageInfo.getList());
    }

    public Pagination(long page, long size, long total, long totalPages, List<T> data) {
        this.page = page;
        this.size = size;
        this.total = total;
        this.totalPages = totalPages;
        this.data = data;
    }
}
