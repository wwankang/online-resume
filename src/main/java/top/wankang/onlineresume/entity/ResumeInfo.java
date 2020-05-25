package top.wankang.onlineresume.entity;

import java.util.List;

public class ResumeInfo {
//    UserInfo info = userInfoService.getUserInfoByName(name);
//    Integer id = info.getId();
//    List<ProjectExperience> projectExperiences = projectService.queryByUserId(id);
//    List<Skill> skills = skillService.queryByUserId(id);
//    List<WorkExperience> workExperiences = workService.queryByUserId(id);
//    SelfAppraisal selfAppraisal = appraisalService.queryByUserId(id);
    private UserInfo userInfo;
    private List<ProjectExperience> projectExperiences;
    private List<Skill> skills;
    private List<WorkExperience> workExperiences;
    private SelfAppraisal selfAppraisal;

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public List<ProjectExperience> getProjectExperiences() {
        return projectExperiences;
    }

    public void setProjectExperiences(List<ProjectExperience> projectExperiences) {
        this.projectExperiences = projectExperiences;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<WorkExperience> getWorkExperiences() {
        return workExperiences;
    }

    public void setWorkExperiences(List<WorkExperience> workExperiences) {
        this.workExperiences = workExperiences;
    }

    public SelfAppraisal getSelfAppraisal() {
        return selfAppraisal;
    }

    public void setSelfAppraisal(SelfAppraisal selfAppraisal) {
        this.selfAppraisal = selfAppraisal;
    }
}
