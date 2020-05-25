package top.wankang.onlineresume.entity;

import top.wankang.onlineresume.entity.base.BaseEntity;

import java.io.Serializable;
import java.util.Date;

public class ProjectExperience extends BaseEntity implements Serializable {

    private String projectName;

    private String projectSkill;

    private String projectTime;

    private String projectClass;

    private String projectImg;

    private Integer userId;

    private String projectDetails;

    private static final long serialVersionUID = 1L;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProjectSkill() {
        return projectSkill;
    }

    public void setProjectSkill(String projectSkill) {
        this.projectSkill = projectSkill == null ? null : projectSkill.trim();
    }

    public String getProjectTime() {
        return projectTime;
    }

    public void setProjectTime(String projectTime) {
        this.projectTime = projectTime == null ? null : projectTime.trim();
    }

    public String getProjectClass() {
        return projectClass;
    }

    public void setProjectClass(String projectClass) {
        this.projectClass = projectClass == null ? null : projectClass.trim();
    }

    public String getProjectImg() {
        return projectImg;
    }

    public void setProjectImg(String projectImg) {
        this.projectImg = projectImg == null ? null : projectImg.trim();
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getProjectDetails() {
        return projectDetails;
    }

    public void setProjectDetails(String projectDetails) {
        this.projectDetails = projectDetails == null ? null : projectDetails.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", projectName=").append(projectName);
        sb.append(", projectSkill=").append(projectSkill);
        sb.append(", projectTime=").append(projectTime);
        sb.append(", projectClass=").append(projectClass);
        sb.append(", projectImg=").append(projectImg);
        sb.append(", userId=").append(userId);
        sb.append(", projectDetails=").append(projectDetails);
        sb.append("]");
        return sb.toString();
    }
}
