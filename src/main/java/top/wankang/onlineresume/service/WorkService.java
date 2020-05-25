package top.wankang.onlineresume.service;


import top.wankang.onlineresume.entity.Work;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author:qianhongshen
 * @Date:2019/9/23 9:43
 * @Desc:
 */
public interface WorkService {

    /**
     * 查询列表
     * @param page
     * @param limit
     * @return
     */
    List<Work> queryList(Integer page, Integer limit);


    /**
     * 查询
     * @param id
     * @return
     */
    Work query(Integer id);




}
