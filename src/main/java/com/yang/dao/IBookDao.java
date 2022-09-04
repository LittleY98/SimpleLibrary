package com.yang.dao;

import com.yang.entity.Book;

import java.util.HashSet;

/**
 * 持久层接口
 */
public interface IBookDao {
    /**
     * 添加书籍
     * @param book 书籍信息
     * @return true-成功 false-失败
     */
    boolean addBook(Book book);

    /**
     * 展示书籍列表
     * @return HashSet
     */
    HashSet<Book> list();

    /**
     * 删除书籍
     * @param book uuid不可为空，根据uuid删除
     * @return true-成功 false-失败
     */
    boolean remove(Book book);

    /**
     * 更新书籍
     * @param book 书籍信息
     * @return true-成功 false-失败
     */
    boolean updateBook(Book book);

    /**
     * 判断数据库中是否有此uuid的书
     * @param book uuid不可为空，根据uuid查询
     * @return true-有 false-无
     */
    Boolean isContainBook(Book book);
}
