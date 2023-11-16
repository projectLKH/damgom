package project.damgom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import project.damgom.Service.EmpServiceImpl;
import project.damgom.entity.Emp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
    public String empInsertMethod(@ModelAttribute Emp emp, Model model) {
        boolean empSuccess = empService.empInsert(emp);
        if(empSuccess) {
            return "redirect:/empList";
        } else {
            model.addAttribute("empSuccess", empSuccess);
            return "emp/empInsertForm";
        }
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

    //
    // *************로그인******************
    //
    @GetMapping("/login")
    public String loginForm(HttpSession session, Model model) {
        Object emp = session.getAttribute("emp");
        if(emp ==null) {
            return "emp/loginForm";
        } else {
            model.addAttribute("emp", emp);
            return "emp/test";
        }
    }
    @PostMapping("/login")
    public String login(HttpSession session, HttpServletRequest request, Model model) {
        String id = request.getParameter("empId");
        String password = request.getParameter("empPassword");

        String msg = empService.login(id, password);

        if(Boolean.parseBoolean(msg)) {
            empService.setLoginSession(session, Integer.parseInt(id));
            model.addAttribute("emp", session.getAttribute("emp"));
            return "emp/test";
        } else {
            model.addAttribute("msg", msg);
            return "emp/loginForm";
        }
    }
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "emp/loginForm";
    }

    @GetMapping("/findEmpPassword")
    public String findEmpPasswordForm() {
        return "emp/findEmpPasswordForm";
    }

    @PostMapping("/findEmpPassword")
    public String findEmpPassword(String empId, String empName, String empPhone, Model model) {
        String empPassword = empService.findEmpPassword(empId, empName, empPhone);
        model.addAttribute("empPassword", empPassword);
        return "emp/findEmpPassword";
    }
}
