package cn.kgc.util.xiao;

import java.util.ArrayList;
import java.util.List;

/**
 * 用来封装和分页有关的信息
 */
public class PageBean<T> {
    private int pageId = 1;                         //当前页码
    private int pageSize = 5;                       //每页的行数
    private int totalPages=1;                       //总页数
    private int totalRows;                          //总行数
    private int nextPageId;                         //下一页的页码
    private int prevPageId;                         //上一页的页码
    private List<T> result = new ArrayList<T>();    //当前页的查询结果

    public PageBean() {
    }

    public PageBean(int pageId, int pageSize, int totalPages, int totalRows, int nextPageId, int prevPageId, List<T> result) {
        this.pageId = pageId;
        this.pageSize = pageSize;
        this.totalPages = totalPages;
        this.totalRows = totalRows;
        this.nextPageId = nextPageId;
        this.prevPageId = prevPageId;
        this.result = result;
    }

    public int getPageId() {
        return pageId;
    }

    public void setPageId(int pageId) {
        if(pageId < 1){
            this.pageId = 1;
        //}else if(pageId > totalPages){
        //    this.pageId = totalPages;
        }else{
            this.pageId = pageId;
        }
    }

    public int getPageSize() {
        return pageSize;
    }


    public int getTotalPages() {
        return totalPages;
    }

    /*public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }*/

    public int getTotalRows() {
        return totalRows;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
        //顺便计算出总页数
        this.totalPages = (this.totalRows + (this.pageSize - 1)) / this.pageSize;
    }
    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
        //顺便计算出总页数
        this.totalPages = (this.totalRows + (this.pageSize - 1)) / this.pageSize;
    }
    public int getNextPageId() {
        return this.pageId+1 > this.totalPages ? this.totalPages : this.pageId+1;
    }

    /*public void setNextPageId(int nextPageId) {
        this.nextPageId = nextPageId;
    }*/
    public int getPrevPageId() {
        return this.pageId-1 < 1 ? 1 : this.pageId-1;
    }

   /* public void setPrevPageId(int prevPageId) {
        this.prevPageId = prevPageId;
    }*/

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }
}
