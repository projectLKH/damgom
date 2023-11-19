package project.damgom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import project.damgom.service.AttendanceServiceImpl;

@Controller
public class AttendanceController {

    @Autowired
    AttendanceServiceImpl attendanceService;

    @GetMapping("/attendance")
    public String attendanceTest(Model model) {
        return "attendance/attendanceTest";
    }

}
