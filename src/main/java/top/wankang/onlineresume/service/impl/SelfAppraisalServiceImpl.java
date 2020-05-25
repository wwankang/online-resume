package top.wankang.onlineresume.service.impl;

import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.wankang.onlineresume.dao.SelfAppraisalMapper;
import top.wankang.onlineresume.entity.ProjectExperience;
import top.wankang.onlineresume.entity.ProjectExperienceExample;
import top.wankang.onlineresume.entity.SelfAppraisal;
import top.wankang.onlineresume.entity.SelfAppraisalExample;
import top.wankang.onlineresume.service.SelfAppraisalService;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author:qianhongshen
 * @Date:2019/9/23 9:44
 * @Desc:
 */
@Service
public class SelfAppraisalServiceImpl implements SelfAppraisalService {
//    private static final Logger logger = LoggerFactory.getLogger(com.hongshen.boke.jianli.service.impl.AppraisalServiceImpl.class);

    @Autowired
    private SelfAppraisalMapper selfAppraisalMapper;

    @Override
    public List<SelfAppraisal> queryList(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        SelfAppraisalExample example = new SelfAppraisalExample();
        return selfAppraisalMapper.selectByExample(example);
    }

    @Override
    public SelfAppraisal query(Integer id) {
        return selfAppraisalMapper.selectByPrimaryKey(id);
    }


    @Override
    public SelfAppraisal queryByUserId(Integer UserId) {
        SelfAppraisalExample example = new SelfAppraisalExample();
        SelfAppraisalExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(UserId);
        List<SelfAppraisal> selfAppraisals = selfAppraisalMapper.selectByExample(example);
        if (!selfAppraisals.isEmpty()) {
            return selfAppraisals.get(0);
        }
        return null;
    }
}
