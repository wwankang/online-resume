package top.wankang.onlineresume.service.impl;

import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.wankang.onlineresume.dao.WorkMapper;
import top.wankang.onlineresume.entity.Work;
import top.wankang.onlineresume.entity.WorkExample;
import top.wankang.onlineresume.service.WorkService;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author:qianhongshen
 * @Date:2019/9/23 9:44
 * @Desc:
 */
@Service
public class WorkServiceImpl implements WorkService {
//    private static final Logger logger = LoggerFactory.getLogger(com.hongshen.boke.jianli.service.impl.WorkServiceImpl.class);

    @Autowired
    private WorkMapper workMapper;

    @Override
    public List<Work> queryList(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        WorkExample example = new WorkExample();
        return workMapper.selectByExample(example);
    }

    @Override
    public Work query(Integer id) {
        return workMapper.selectByPrimaryKey(id);
    }

}
