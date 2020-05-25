package top.wankang.onlineresume.service;


import top.wankang.onlineresume.entity.SelfAppraisal;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author:qianhongshen
 * @Date:2019/9/23 9:43
 * @Desc:
 */
public interface SelfAppraisalService {

    /**
     * 查询列表
     * @param page
     * @param limit
     * @return
     */
    List<SelfAppraisal> queryList(Integer page, Integer limit);


    /**
     * 查询
     * @param id
     * @return
     */
    SelfAppraisal query(Integer id);



}
