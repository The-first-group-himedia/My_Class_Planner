package mcp.myclassplanner.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import mcp.myclassplanner.model.dto.CourseDTO;
import mcp.myclassplanner.model.dto.MemberDTO;
import mcp.myclassplanner.model.dto.SectionDTO;
import mcp.myclassplanner.model.service.CourseService;
import mcp.myclassplanner.model.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
@RequestMapping("course")
@PropertySource("classpath:application.properties")
public class CourseController {

    @Value("${API_KEY}")
    private String API_KEY;

    private final CourseService courseService;
    private final MemberService memberService;

    @Autowired
    public CourseController(CourseService courseService, MemberService memberService){
        this.courseService = courseService;
        this.memberService = memberService;
    }

    @PostMapping("/deleteCourse")
    public String deleteCourse(HttpServletRequest request, HttpSession session, Model model) {
        int memberCode = (int) session.getAttribute("memberCode");
        Map<String, String[]> parameters = request.getParameterMap();
        for (Map.Entry<String, String[]> entry : parameters.entrySet()) {
            String courseName = Arrays.toString(entry.getValue()).replace("[", "").replace("]", "");
            courseService.deleteCourse(courseName, memberCode);
        }
        Map<String, Integer> exMap = new HashMap<>();
        exMap.put("memberCode", memberCode);
        exMap.put("exp", 1);
        memberService.addExp(exMap);
        model.addAttribute("API_KEY", API_KEY);
        return "redirect:/course/course";
    }

    @GetMapping("/add")
    public String addCourse(HttpSession session, Model model) {
        model.addAttribute("username", session.getAttribute("username"));
        // 세션에 사용자 정보 저장
        model.addAttribute("API_KEY", API_KEY);
        return "course/add";
    }
    @PostMapping("/add")
    public String addCourse(String courseName,HttpSession httpSession, HttpServletRequest request){
//        MemberDTO member = (MemberDTO) httpSession.getAttribute("memberDTO");
        CourseDTO courseDTO = new CourseDTO();
        courseDTO.setCourseName(courseName);
        List<SectionDTO> sectionDTOList = new ArrayList<>();
        Map<String, String[]> parameters = request.getParameterMap();
        SectionDTO sectionDTO = new SectionDTO();
        for(String key : parameters.keySet()){
            if (key.startsWith("startTime-0")) {
                sectionDTO = new SectionDTO();
                String startTime = Arrays.toString(parameters.get(key)).replace(":","")
                        .replace("[", "").replace("]","");
                sectionDTO.setStartTime(Integer.parseInt(startTime));
            }
            else if (key.startsWith("startTime-")) {
                sectionDTOList.add(sectionDTO); // list 에 담기
                sectionDTO = new SectionDTO(); // DTO 초기화
                String startTime = Arrays.toString(parameters.get(key)).replace(":","")
                        .replace("[", "").replace("]","");
                sectionDTO.setStartTime(Integer.parseInt(startTime));
            }
            else if (key.startsWith("endTime-")) {
                String endTime = Arrays.toString(parameters.get(key)).replace(":","")
                        .replace("[", "").replace("]","");
                sectionDTO.setEndTime(Integer.parseInt(endTime));
            }
            else if (key.startsWith("dayM-")) {
                sectionDTO.setDays(sectionDTO.getDays()+"M");
            }
            else if (key.startsWith("dayT-")) {
                sectionDTO.setDays(sectionDTO.getDays()+"T");
            }
            else if (key.startsWith("dayW-")) {
                sectionDTO.setDays(sectionDTO.getDays()+"W");
            }
            else if (key.startsWith("dayTh-")) {
                sectionDTO.setDays(sectionDTO.getDays()+"X");
            }
            else if (key.startsWith("dayF-")) {
                sectionDTO.setDays(sectionDTO.getDays()+"F");
            }
        }
        sectionDTOList.add(sectionDTO); // 마지막 데이터 삽임
        courseDTO.setSectionDTOList(sectionDTOList);// courseDTO 에 값 담기
        int memberCode = (int) httpSession.getAttribute("memberCode");
        courseDTO.setMemberCode(memberCode);

        courseService.addCourse(courseDTO);
        Map<String, Integer> exMap = new HashMap<>();
        exMap.put("memberCode", memberCode);
        exMap.put("exp", 2);
        memberService.addExp(exMap);

        return "redirect:/course/course";
    }

    @GetMapping("/course")
    public String viewCourse(HttpSession session, Model mv) {
        mv.addAttribute("username",session.getAttribute("username"));
        int memberCode = (int) session.getAttribute("memberCode");
        List<CourseDTO> courseDTOList = courseService.viewAllCourse(memberCode);
        mv.addAttribute("courseDTOList", courseDTOList);
        mv.addAttribute("API_KEY", API_KEY);
        return "course/course";
    }
}
