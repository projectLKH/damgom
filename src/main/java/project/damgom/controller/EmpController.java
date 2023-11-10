package project.damgom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import project.damgom.Service.EmpServiceImpl;
import project.damgom.entity.Emp;

import java.util.List;

@Controller
public class EmpController {

    @Autowired
    EmpServiceImpl empService;
    //
    // *************직원등록******************
    //
    @GetMapping("/empInsert")
    public String empInsertForm(Model model) {
        Emp emp = new Emp();
        model.addAttribute("emp", emp);
        return "emp/empInsertForm";
    }

    @PostMapping("/empInsert")
    public String empInsertMethod(@ModelAttribute("emp") Emp emp) {
        empService.empInsert(emp);
        return "redirect:/empList";
    }
    //
    // *************직원목록******************
    //
    @GetMapping("/empList")
    public String empList(Model model) {
        List<Emp> empList = empService.findAllEmp();
        model.addAttribute("empList", empList);
        return "emp/empList";
    }
}
