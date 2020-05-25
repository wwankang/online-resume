package top.wankang.onlineresume.service;


import top.wankang.onlineresume.entity.UserInfo;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author:qianhongshen
 * @Date:2019/9/23 9:43
 * @Desc:
 */
public interface UserInfoService {

    /**
     * 查询列表
     * @param page
     * @param limit
     * @return
     */
    List<UserInfo> queryList(Integer page, Integer limit);



}
