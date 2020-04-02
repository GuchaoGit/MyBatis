package com.guc.mybatis.mapper;

import com.guc.mybatis.entity.User;

import java.util.List;

/**
 * @Author guc
 * @Date 2020/4/2 11:30
 * @Description BaseMapper 基础 mapper
 */
public interface BaseMapper<T> {
    /*
     * 新增
     */
    public int insert(T t) throws Exception;

    /*
    修改
     */
    public int update(T t) throws Exception;
    /*
     * 刪除
     */
    public int delete(Integer id) throws Exception;
    /*
     * 根据 id 查询信息
     * @param id
     * @return
     * @throws Exception
     */
    public T selectById(Integer id) throws Exception;
    /*
     * 查询所有的信息
     * @return
     * @throws Exception
     */
    public List<T> selectAll() throws Exception;
}
