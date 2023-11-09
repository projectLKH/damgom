package project.damgom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import project.damgom.Service.EmpService;
import project.damgom.entity.Emp;

import java.util.List;

@Controller
public class EmpController {

    @Autowired
    EmpService empService;

    @GetMapping("/empList")
    public String empList(Model model) {
        List<Emp> empList = empService.findAllEmp();
        model.addAttribute("empList", empList);
        return "empList";
    }

    @GetMapping("/empRegist")
    public String empRegistForm(Model model) {
        Emp emp = new Emp();
        model.addAttribute("emp", emp);
        return "empRegistForm";
    }

    @PostMapping("/empRegist")
    public String empRegist(@ModelAttribute Emp emp) {
        return "redirect:/empList";
    }
}
