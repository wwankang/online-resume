package top.wankang.onlineresume.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.wankang.onlineresume.dao.ProjectMapper;
import top.wankang.onlineresume.entity.Project;
import top.wankang.onlineresume.entity.ProjectExample;
import top.wankang.onlineresume.service.ProjectService;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author:qianhongshen
 * @Date:2019/9/23 9:44
 * @Desc:
 */
@Service
public class ProjectServiceImpl implements ProjectService {
//    private static final Logger logger = LoggerFactory.getLogger(com.hongshen.boke.jianli.service.impl.ProjectServiceImpl.class);


    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public List<Project> queryList(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        ProjectExample example = new ProjectExample();
        return projectMapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public Project query(Integer id) {
        return projectMapper.selectByPrimaryKey(id);
    }
}
