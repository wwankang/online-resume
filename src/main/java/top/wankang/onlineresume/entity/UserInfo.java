package top.wankang.onlineresume.entity;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {
    private Integer id;

    private String name;

    private String sex;

    private Integer age;

    private String address;

    private String linkAddress;

    private String specialty;

    private String education;

    private String school;

    private String linkQq;

    private String linkWechat;

    private String linkPhone;

    private String linkEmail;

    private String job;

    private Date gmtCreateTime;

    private Date gmtUpdateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getLinkAddress() {
        return linkAddress;
    }

    public void setLinkAddress(String linkAddress) {
        this.linkAddress = linkAddress == null ? null : linkAddress.trim();
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty == null ? null : specialty.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getLinkQq() {
        return linkQq;
    }

    public void setLinkQq(String linkQq) {
        this.linkQq = linkQq == null ? null : linkQq.trim();
    }

    public String getLinkWechat() {
        return linkWechat;
    }

    public void setLinkWechat(String linkWechat) {
        this.linkWechat = linkWechat == null ? null : linkWechat.trim();
    }

    public String getLinkPhone() {
        return linkPhone;
    }

    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone == null ? null : linkPhone.trim();
    }

    public String getLinkEmail() {
        return linkEmail;
    }

    public void setLinkEmail(String linkEmail) {
        this.linkEmail = linkEmail == null ? null : linkEmail.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", address=").append(address);
        sb.append(", linkAddress=").append(linkAddress);
        sb.append(", specialty=").append(specialty);
        sb.append(", education=").append(education);
        sb.append(", school=").append(school);
        sb.append(", linkQq=").append(linkQq);
        sb.append(", linkWechat=").append(linkWechat);
        sb.append(", linkPhone=").append(linkPhone);
        sb.append(", linkEmail=").append(linkEmail);
        sb.append(", job=").append(job);
        sb.append(", gmtCreateTime=").append(gmtCreateTime);
        sb.append(", gmtUpdateTime=").append(gmtUpdateTime);
        sb.append("]");
        return sb.toString();
    }
}