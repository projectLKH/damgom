package project.damgom.dept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import project.damgom.entity.Dept;

import java.util.List;

@Controller
public class DeptController {

    @Autowired
    DeptServiceImpl deptService;

    @GetMapping("/deptInsert")
    public String deptInsertForm(Model model) {
        Dept dept = new Dept();
        model.addAttribute("dept", dept);
        return "dept/deptInsertForm";
    }
    @PostMapping("/deptInsert")
    public String deptInsert(@ModelAttribute Dept dept, Model model) {
        String result = deptService.createDept(dept.getDeptId(), dept.getDeptName());
        if(Boolean.parseBoolean(result)) {
            return "redirect:/deptList";
        } else {
            model.addAttribute("result", result);
            return "dept/deptInsertForm";
        }
    }

    @GetMapping("/deptList")
    public String deptList(Model model) {
        List<Dept> deptList = deptService.findAllDept();
        model.addAttribute("deptList", deptList);
        return "dept/deptList";
    }
}
