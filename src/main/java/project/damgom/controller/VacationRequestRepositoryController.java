package project.damgom.controller;


import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import project.damgom.Service.DateService;
import project.damgom.Service.VacationRequestRepositoryService;
import project.damgom.entity.VacationRequest;
import project.damgom.repository.VacationRequestRepository;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
@Controller
@Slf4j
public class VacationRequestRepositoryController {

    @Autowired
    private VacationRequestRepository vacationRequestRepository;
    @Autowired
    private VacationRequestRepositoryService vacationRequestRepositoryService;



    @GetMapping("/list")
    public String vacationList(Model model) {
        //list에서 findAll로 전부 가져오는 기능
        List<VacationRequest> findAll = vacationRequestRepository.findAll();
        //list에서 "승인","반려" 만 가져오는 기능
        List<VacationRequest> success = vacationRequestRepository.findByStatus(Arrays.asList("승인", "반려"));
        //list에서 "요청중" 만 가져오는 기능
        List<VacationRequest> requests = vacationRequestRepository.findByStatus(Arrays.asList("요청중"));

        model.addAttribute("requests",requests);
        model.addAttribute("success",success);
        model.addAttribute("findAll", findAll);
        return "/vacationRequest/list";
    }
    @PostMapping("/updateStatus")
    public String updateStatus(
            @RequestParam(name = "id") int vacationRequestId,
            @RequestParam(name = "status") String vacationRequestStatus) {
        VacationRequest vacationRequest = vacationRequestRepository.findById(vacationRequestId)
                .orElseThrow(() -> new RuntimeException("휴가 신청을 찾을 수 없습니다."));
        vacationRequest.setVacationRequestStatus(vacationRequestStatus);

        // 현재 날짜와 시간을 얻기
        LocalDateTime now = LocalDateTime.now();

        // DateTimeFormatter를 사용하여 LocalDateTime을 원하는 형식으로 포맷
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formattedDateTime = now.format(formatter);

        // 포맷된 문자열을 다시 LocalDateTime으로 파싱하여 vacationRequestProcessTime에 설정
        vacationRequest.setVacationRequestProcessTime(LocalDateTime.parse(formattedDateTime, formatter));

        vacationRequestRepository.save(vacationRequest);
        return "redirect:/list";
    }


    @GetMapping("/request")
    public String showVacationRequestForm(Model model) {
        //휴가 신청
        VacationRequest vacationRequest = new VacationRequest();
        model.addAttribute("vacationRequest", vacationRequest);
        //휴가의 타입
        List<String> getVacationTypes = vacationRequestRepositoryService.getVacationTypes();
        model.addAttribute("vacationTypes",getVacationTypes);

        return "/vacationRequest/submitted";
    }
    @PostMapping("/request")
    public String vacationSubmitted(@ModelAttribute VacationRequest vacationRequest) {
        vacationRequestRepositoryService.save(vacationRequest);
        return "redirect:/";
    }
}