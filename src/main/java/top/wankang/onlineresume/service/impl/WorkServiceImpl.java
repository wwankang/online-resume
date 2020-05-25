package top.wankang.onlineresume.service.impl;

import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.wankang.onlineresume.dao.WorkExperienceMapper;
import top.wankang.onlineresume.entity.Skill;
import top.wankang.onlineresume.entity.SkillExample;
import top.wankang.onlineresume.entity.WorkExperience;
import top.wankang.onlineresume.entity.WorkExperienceExample;
import top.wankang.onlineresume.service.WorkExperienceService;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author:qianhongshen
 * @Date:2019/9/23 9:44
 * @Desc:
 */
@Service
public class WorkServiceImpl implements WorkExperienceService {
//    private static final Logger logger = LoggerFactory.getLogger(com.hongshen.boke.jianli.service.impl.WorkServiceImpl.class);

    @Autowired
    private WorkExperienceMapper workExperienceMapper;

    @Override
    public List<WorkExperience> queryList(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        WorkExperienceExample example = new WorkExperienceExample();
        return workExperienceMapper.selectByExample(example);
    }

    @Override
    public WorkExperience query(Integer id) {
        return workExperienceMapper.selectByPrimaryKey(id);
    }
    @Override
    public List<WorkExperience> queryByUserId(Integer UserId) {
        WorkExperienceExample example = new WorkExperienceExample();
        WorkExperienceExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(UserId);
        List<WorkExperience> workExperiences = workExperienceMapper.selectByExample(example);
        return workExperiences;
    }
}
