package top.wankang.onlineresume.service.impl;

import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.wankang.onlineresume.dao.AppraisalMapper;
import top.wankang.onlineresume.entity.Appraisal;
import top.wankang.onlineresume.entity.AppraisalExample;
import top.wankang.onlineresume.service.AppraisalService;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author:qianhongshen
 * @Date:2019/9/23 9:44
 * @Desc:
 */
@Service
public class AppraisalServiceImpl implements AppraisalService {
//    private static final Logger logger = LoggerFactory.getLogger(com.hongshen.boke.jianli.service.impl.AppraisalServiceImpl.class);

    @Autowired
    private AppraisalMapper appraisalMapper;

    @Override
    public List<Appraisal> queryList(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        AppraisalExample example = new AppraisalExample();
        return appraisalMapper.selectByExample(example);
    }

    @Override
    public Appraisal query(Integer id) {
        return appraisalMapper.selectByPrimaryKey(id);
    }

}
