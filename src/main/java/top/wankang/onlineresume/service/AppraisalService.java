package top.wankang.onlineresume.service;

import top.wankang.onlineresume.entity.Appraisal;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author:qianhongshen
 * @Date:2019/9/23 9:43
 * @Desc:
 */
public interface AppraisalService {

    /**
     * 查询列表
     * @param page
     * @param limit
     * @return
     */
    List<Appraisal> queryList(Integer page, Integer limit);


    /**
     * 查询
     * @param id
     * @return
     */
    Appraisal query(Integer id);



}
