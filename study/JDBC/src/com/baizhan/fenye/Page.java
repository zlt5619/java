package com.baizhan.fenye;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Page {
    //当前页数
    private Integer currentPage;
    //每页显示的记录数
    private Integer pageSize;
    //总记录数
    private Integer totalCount;
    //总页数
    private Integer totalPage;
    //每页显示的数据
    private List<Map<String, Object>> list = new ArrayList<>();

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<Map<String, Object>> getList() {
        return list;
    }

    public void setList(List<Map<String, Object>> list) {
        this.list = list;
    }
}
