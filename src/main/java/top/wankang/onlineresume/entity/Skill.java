package top.wankang.onlineresume.entity;

import top.wankang.onlineresume.entity.base.BaseEntity;

import java.io.Serializable;

public class Skill extends BaseEntity implements Serializable {

    private String skillDetails;

    private Integer userId;

    private static final long serialVersionUID = 1L;



    public String getSkillDetails() {
        return skillDetails;
    }

    public void setSkillDetails(String skillDetails) {
        this.skillDetails = skillDetails == null ? null : skillDetails.trim();
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
        sb.append(", skillDetails=").append(skillDetails);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }
}
