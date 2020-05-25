package top.wankang.onlineresume.service;


import top.wankang.onlineresume.entity.Project;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author:qianhongshen
 * @Date:2019/9/23 9:43
 * @Desc:
 */
public interface ProjectService {

    /**
     * 查询列表
     * @param page
     * @param limit
     * @return
     */
    List<Project> queryList(Integer page, Integer limit);


    /**
     * 查询
     * @param id
     * @return
     */
    Project query(Integer id);



}
