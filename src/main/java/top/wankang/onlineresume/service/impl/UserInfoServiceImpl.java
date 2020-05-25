package top.wankang.onlineresume.service.impl;

import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.wankang.onlineresume.dao.UserInfoMapper;
import top.wankang.onlineresume.entity.UserInfo;
import top.wankang.onlineresume.entity.UserInfoExample;
import top.wankang.onlineresume.service.UserInfoService;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author:qianhongshen
 * @Date:2019/9/23 9:44
 * @Desc:
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    private static final Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> queryList(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        UserInfoExample example = new UserInfoExample();
        return userInfoMapper.selectByExample(example);
    }

    @Override
    public UserInfo getUserInfoByName(String name) {
        UserInfoExample example = new UserInfoExample();
        UserInfoExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(name);
        List<UserInfo> userInfos = userInfoMapper.selectByExample(example);
        if (!userInfos.isEmpty()){
            return userInfos.get(0);
        }
        return null;
    }

}
