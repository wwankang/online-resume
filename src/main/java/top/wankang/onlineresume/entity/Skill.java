package top.wankang.onlineresume.entity;

import java.io.Serializable;

public class Skill implements Serializable {
    private Integer id;

    private String skillDetails;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSkillDetails() {
        return skillDetails;
    }

    public void setSkillDetails(String skillDetails) {
        this.skillDetails = skillDetails == null ? null : skillDetails.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", skillDetails=").append(skillDetails);
        sb.append("]");
        return sb.toString();
    }
}