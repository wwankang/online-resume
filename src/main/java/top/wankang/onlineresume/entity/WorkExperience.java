package top.wankang.onlineresume.entity;

import top.wankang.onlineresume.entity.base.BaseEntity;

import java.io.Serializable;
import java.util.Date;

public class WorkExperience extends BaseEntity implements Serializable {

    private String companyName;

    private String job;

    private String workContent;

    private Date startTime;

    private Date endTime;

    private String companyImg;



    private Integer userId;

    private static final long serialVersionUID = 1L;



    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getWorkContent() {
        return workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent == null ? null : workContent.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getCompanyImg() {
        return companyImg;
    }

    public void setCompanyImg(String companyImg) {
        this.companyImg = companyImg == null ? null : companyImg.trim();
    }



    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", companyName=").append(companyName);
        sb.append(", job=").append(job);
        sb.append(", workContent=").append(workContent);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", companyImg=").append(companyImg);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }
}
