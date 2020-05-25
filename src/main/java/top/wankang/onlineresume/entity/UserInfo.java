package top.wankang.onlineresume.entity;

import top.wankang.onlineresume.entity.base.BaseEntity;

import java.io.Serializable;
import java.util.Date;

public class UserInfo extends BaseEntity implements Serializable {

    private String name;

    private String sex;

    private Integer age;

    private String address;

    private String linkAddress;

    private String major;

    private String education;

    private String school;

    private String linkQq;

    private String linkWechat;

    private String linkPhone;

    private String email;

    private String job;


    private static final long serialVersionUID = 1L;



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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", address=").append(address);
        sb.append(", linkAddress=").append(linkAddress);
        sb.append(", major=").append(major);
        sb.append(", education=").append(education);
        sb.append(", school=").append(school);
        sb.append(", linkQq=").append(linkQq);
        sb.append(", linkWechat=").append(linkWechat);
        sb.append(", linkPhone=").append(linkPhone);
        sb.append(", email=").append(email);
        sb.append(", job=").append(job);
        sb.append("]");
        return sb.toString();
    }
}
