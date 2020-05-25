package top.wankang.onlineresume.service;

import top.wankang.onlineresume.entity.ResumeInfo;
import top.wankang.onlineresume.entity.UserInfo;

public interface ResumeService {
    ResumeInfo getResumeInfoByName(String name);
}
