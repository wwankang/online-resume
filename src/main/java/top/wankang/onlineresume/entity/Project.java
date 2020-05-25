package top.wankang.onlineresume.entity;

import java.io.Serializable;
import java.util.Date;

public class Project implements Serializable {
    private Integer id;

    private String projectName;

    private String projectSkill;

    private String projectTime;

    private String projectClass;

    private String projectImg;

    private Date gmtCreateTime;

    private Date gmtUpdateTime;

    private String projectDetails;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Date getGmtCreateTime() {
        return gmtCreateTime;
    }

    public void setGmtCreateTime(Date gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
    }

    public Date getGmtUpdateTime() {
        return gmtUpdateTime;
    }

    public void setGmtUpdateTime(Date gmtUpdateTime) {
        this.gmtUpdateTime = gmtUpdateTime;
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
        sb.append(", id=").append(id);
        sb.append(", projectName=").append(projectName);
        sb.append(", projectSkill=").append(projectSkill);
        sb.append(", projectTime=").append(projectTime);
        sb.append(", projectClass=").append(projectClass);
        sb.append(", projectImg=").append(projectImg);
        sb.append(", gmtCreateTime=").append(gmtCreateTime);
        sb.append(", gmtUpdateTime=").append(gmtUpdateTime);
        sb.append(", projectDetails=").append(projectDetails);
        sb.append("]");
        return sb.toString();
    }
}