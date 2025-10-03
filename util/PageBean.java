package cn.kgc.util;

import java.util.ArrayList;
import java.util.List;

public class PageBean<T> {
    private Integer pageId = 1;      //当前页码
    private int rowNum = 5;      //每页行数
    private int totalPage = 1;    //总页数
    private int totalRow;     //总行数
    private int nextPageId;   //下一页页码
    private int prevPageId;   //上一页页码
    private List<T> result = new ArrayList<T>();

    public PageBean() {
    }

    public PageBean(int pageId, int rowNum, int totalPage, int totalRow, int nextPageId, int prevPageId, List<T> result) {
        this.pageId = pageId;
        this.rowNum = rowNum;
        this.totalPage = totalPage;
        this.totalRow = totalRow;
        this.nextPageId = nextPageId;
        this.prevPageId = prevPageId;
        this.result = result;
    }

    /**
     * 获取  当前页码
     * @return pageId
     */
    public int getPageId() {
        return pageId;
    }

    /**
     * 设置  页码
     * @param pageId
     */
    public void setPageId(Integer pageId) {
        if(pageId < 1 ){
            this.pageId = 1;
//        } else if (pageId > totalPage) {
//            this.pageId = totalPage;
        }
        else {
            this.pageId = pageId;
        }
    }

    /**
     * 获取 每页行数
     * @return rowNum
     */
    public int getRowNum() {
        return rowNum;

    }

    /**
     * 设置每页行数
     * @param rowNum
     */
    public void setRowNum(int rowNum) {
        this.rowNum = rowNum;
        this.totalPage =  (this.totalRow+(this.rowNum-1))/this.rowNum;
    }

    /**
     * 获取 总页数
     * @return totalPage
     */
    public int getTotalPage() {
        return (this.totalRow+(this.rowNum-1))/this.rowNum;
    }

    /**
     * 设置总页数
     * @param totalPage
     */
    public void setTotalPage(int totalPage) {

        this.totalPage =  (this.totalRow+(this.rowNum-1))/this.rowNum;
    }

    /**
     * 获取总行数
     * @return totalRow
     */
    public int getTotalRow() {
        return totalRow;
    }

    /**
     * 设置 总行数
     * @param totalRow
     */
    public void setTotalRow(int totalRow) {
        this.totalRow = totalRow;
        this.totalPage =  (this.totalRow+(this.rowNum-1))/this.rowNum;
    }

    /**
     * 获取下一页页码
     * @return nextPageId
     */
    public int getNextPageId() {
        return this.pageId == this.totalPage?this.totalPage:(this.pageId+1);
    }

    /**
     * 设置  下一页页码
     * @param nextPageId
     */
    public void setNextPageId(int nextPageId) {
        this.nextPageId = this.nextPageId;
    }

    /**
     * 获取 上一页页码
     * @return prevPageId
     */
    public int getPrevPageId() {
        return this.pageId == 1?1:(this.pageId-1);
    }

    /**
     * 设置
     * @param prevPageId
     */
    public void setPrevPageId(int prevPageId) {
        this.prevPageId = prevPageId;
    }

    /**
     * 获取
     * @return result
     */
    public List<T> getResult() {
        return result;
    }

    /**
     * 设置
     * @param result
     */
    public void setResult(List<T> result) {
        this.result = result;
    }

    public String toString() {
        return "PageBean{pageId = " + pageId + ", rowNum = " + rowNum + ", totalPage = " + totalPage + ", totalRow = " + totalRow + ", nextPageId = " + nextPageId + ", prevPageId = " + prevPageId + ", result = " + result + "}";
    }
}
