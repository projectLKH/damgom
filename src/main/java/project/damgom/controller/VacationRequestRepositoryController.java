package project.damgom.controller;


import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import project.damgom.Service.DateService;
import project.damgom.Service.VacationRequestRepositoryService;
import project.damgom.entity.VacationRequest;
import project.damgom.repository.VacationRequestRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
@Controller
@Slf4j
public class VacationRequestRepositoryController {

    @Autowired
    private VacationRequestRepository vacationRequestRepository;
    @Autowired
    private VacationRequestRepositoryService vacationRequestRepositoryService;
    @Autowired
    private DateService dateService;


    @GetMapping("/list")
    public String vacationList(Model model) {
        List<VacationRequest> findAll = vacationRequestRepository.findAll();
        model.addAttribute("findAll", findAll);
        return "/vacationRequest/list";
    }

    @GetMapping("/request")
    public String showVacationRequestForm(Model model) {
        VacationRequest vacationRequest = new VacationRequest();
        model.addAttribute("vacationRequest", vacationRequest);
        return "/vacationRequest/submitted";
    }
    @PostMapping("/request")
    public String vacationSubmitted(@ModelAttribute VacationRequest vacationRequest) {

        return "redirect:/";
    }


}
