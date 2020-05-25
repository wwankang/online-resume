package top.wankang.onlineresume.service;


import top.wankang.onlineresume.entity.ProjectExperience;
import top.wankang.onlineresume.entity.Skill;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author:qianhongshen
 * @Date:2019/9/23 16:23
 * @Desc:
 */
public interface SkillService {
    /**
     * 查询列表
     * @param page
     * @param limit
     * @return
     */
        List<Skill> queryList(Integer page, Integer limit);


    /**
     * 查询
     * @param id
     * @return
     */
    Skill query(Integer id);


    List<Skill> queryByUserId(Integer id);
}
