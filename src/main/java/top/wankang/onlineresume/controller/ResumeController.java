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
    private ProjectService projectService;
    @Autowired
    private SkillService skillService;
    @Autowired
    private WorkService workService;
    @Autowired
    private AppraisalService appraisalService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String resumeIndex(HttpServletRequest request, Model model) {
        List<UserInfo> userInfos = userInfoService.queryList(1, 1);
        List<Project> projectDOList = projectService.queryList(1, 10);
        List<Skill> skillDOList = skillService.queryList(1, 10);
        List<Work> workDOList = workService.queryList(1, 10);
        List<Appraisal> appraisalDOList = appraisalService.queryList(1, 10);
        if (userInfos.size() > 0) {
            model.addAttribute("userinfo", userInfos.get(0));
        }
        model.addAttribute("projectList", projectDOList);
        model.addAttribute("skillList", skillDOList);
        model.addAttribute("workList", workDOList);
        model.addAttribute("appraisalList", appraisalDOList);
        request.setAttribute("name","wankang");
        System.out.println("打开简历首页！");
        return "resume/index";
    }
}