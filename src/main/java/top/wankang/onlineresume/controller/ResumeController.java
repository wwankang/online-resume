package top.wankang.onlineresume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import top.wankang.onlineresume.entity.*;
import top.wankang.onlineresume.service.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author wankang
 * @version 1.0
 * @date 2020/5/25 11:10
 */
@Controller
public class ResumeController {

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
    @Autowired
    private ResumeService resumeService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String resumeIndex(HttpServletRequest request, Model model) {

        ResumeInfo resumeInfo = resumeService.getResumeInfoByName("万康");

        model.addAttribute("userinfo", resumeInfo.getUserInfo());
        model.addAttribute("projectList", resumeInfo.getProjectExperiences());
        model.addAttribute("skillList", resumeInfo.getSkills());
        model.addAttribute("workList", resumeInfo.getWorkExperiences());
        model.addAttribute("appraisalList", resumeInfo.getSelfAppraisal());
        return "resume/index";
    }
}
