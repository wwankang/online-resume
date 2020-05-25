package top.wankang.onlineresume.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.wankang.onlineresume.entity.*;
import top.wankang.onlineresume.service.*;

import java.util.List;

@Service
public class ResumeServiceImpl implements ResumeService {
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private ProjectExperienceService projectService;
    @Autowired
    private SkillService skillService;
    @Autowired
    private WorkExperienceService workService;
    @Autowired
    private SelfAppraisalService appraisalService;

    @Override
    public ResumeInfo getResumeInfoByName(String name){
        UserInfo info = userInfoService.getUserInfoByName(name);
        Integer id = info.getId();
        List<ProjectExperience> projectExperiences = projectService.queryByUserId(id);
        List<Skill> skills = skillService.queryByUserId(id);
        List<WorkExperience> workExperiences = workService.queryByUserId(id);
        SelfAppraisal selfAppraisal = appraisalService.queryByUserId(id);
        ResumeInfo resumeInfo = new ResumeInfo();
        resumeInfo.setUserInfo(info);
        resumeInfo.setProjectExperiences(projectExperiences);
        resumeInfo.setSelfAppraisal(selfAppraisal);
        resumeInfo.setSkills(skills);
        resumeInfo.setWorkExperiences(workExperiences);

        return resumeInfo;
    }
}
