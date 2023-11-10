package project.damgom.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import project.damgom.Service.VacationRequestRepositoryService;
import project.damgom.dto.VacationRequestDTO;
import project.damgom.entity.VacationRequest;
import project.damgom.repository.VacationRequestRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("vacation")
public class VacationRequestRepositoryController {
    @Autowired
    VacationRequestRepository vacationRequestRepository;
    @Autowired
    VacationRequestRepositoryService vacationRequestRepositoryService;


    //vacationRequest table의 내용을 list 로 가져옴
    @GetMapping("list")
    public String vacation_List(Model model) {
        List<VacationRequest> findAll = vacationRequestRepository.findAll();
        model.addAttribute("findAll", findAll);
        return "/vacationRequest/list";
    }


    //직원 이  vacation_submitted 를 하는 save 문구
    @RequestMapping("/request")
    public String vacation_submitted(VacationRequestDTO vacationRequestDTO){
        VacationRequest vacationRequest = new VacationRequest();

        vacationRequest.setEmpId(vacationRequestDTO.getEmpId());
        vacationRequest.setVacationRequestStart(vacationRequestDTO.getVacationRequestStart());
        vacationRequest.setVacationRequestEnd(vacationRequestDTO.getVacationRequestEnd());
        vacationRequest.setVacationRequestType(vacationRequestDTO.getVacationRequestType());
        vacationRequest.setVacationRequestReason(vacationRequestDTO.getVacationRequestReason());
        vacationRequest.setVacationRequestStatus(vacationRequestDTO.getVacationRequestStatus());

        vacationRequest.setVacationRequestApplyTime(LocalDateTime.now()); // 예시로 현재 시간 설정

        vacationRequestRepository.save(vacationRequest);

        return "redirect:/vacation_requests/list";
    }
}
