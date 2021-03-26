package com.stydy.list;

import java.util.List;

/**
 * 自定义List分页
 * @author fengfasong
 * @date 2020/8/27
 */
public class PageUtil {
    /**
     * 需要分页的集合
     */
    private List list;
    /**
     * 数据总数
     */
    private Integer count;
    /**
     * 分页页码
     */
    private Integer page;
    /**
     * 分页大小
     */
    private Integer size;
    /**
     * 总页码
     */
    private Integer pageCount;
    /**
     * list取值开始索引
     */
    private Integer startIndex;
    /**
     * list取值结束索引
     */
    private Integer endIndex;

    public PageUtil(List list, Integer page, Integer size) {
        this.list = list;
        this.page = page;
        this.size = size;
        this.count = list.size();
        this.pageCount = 0;
        this.startIndex = 0;
        this.endIndex = 0;
    }

    public List pageData(){
        if(this.count == 0){
            return null;
        }
        if(count % size == 0){
            pageCount = count / size;
        }
        if(count % size != 0){
            pageCount = count / size + 1;
        }
        if(!page.equals(pageCount)){
            startIndex = (page-1) * size;
            endIndex = startIndex + size;
        }
        if(page.equals(pageCount)){
            startIndex = (page-1) * size;
            endIndex = count;
        }
        List pageList = list.subList(startIndex,endIndex);
        return pageList;
    }

}
