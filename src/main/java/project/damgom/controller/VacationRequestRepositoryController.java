package project.damgom.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import project.damgom.Service.VacationRequestRepositoryService;
import project.damgom.entity.VacationRequest;
import project.damgom.repository.VacationRequestRepository;

import java.util.List;

@Controller
@RequestMapping("vacation")
public class VacationRequestRepositoryController {
    @Autowired
    VacationRequestRepository vacationRequestRepository;
    @Autowired
    VacationRequestRepositoryService vacationRequestRepositoryService;


    @GetMapping("list")
    public String vacation_List(Model model){
        List<VacationRequest> findAll = vacationRequestRepository.findAll();

        model.addAttribute("findAll",findAll);

        return "/vacationRequest/list";
    }
    @RequestMapping("/request")
    public void vacation_submitted()a
}
