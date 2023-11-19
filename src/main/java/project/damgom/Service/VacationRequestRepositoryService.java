package project.damgom.Service;


import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import project.damgom.entity.VacationRequest;
import project.damgom.repository.VacationRequestRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class VacationRequestRepositoryService {
    private final VacationRequestRepository vacationRequestRepository;

    public VacationRequestRepositoryService(VacationRequestRepository vacationRequestRepository) {
        this.vacationRequestRepository = vacationRequestRepository;
    }


    //휴가 신청 정보를 모두 받아옴

    public List<VacationRequest> findAll() {
        return vacationRequestRepository.findAll();
    }

    //휴가 종류
    public List<String> getVacationTypes() {
        return Arrays.asList("연차", "병가", "반차");
    }
    public void save(VacationRequest vacationRequest) {
        // 현재 날짜와 시간을 얻기
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formattedDateTime = now.format(formatter);
        // String 으로 변환 한 값을 localDate값으로 변경
        LocalDateTime parsedDateTime = LocalDateTime.parse(formattedDateTime, formatter);
        // vacationRequest의 vacationRequestApplyTime에 설정
        vacationRequest.setVacationRequestApplyTime(parsedDateTime);
        //사원이 휴가 신청시 진행도가  [ 요청중 ] 로 넘어가게 하는 코드
        vacationRequest.setVacationRequestStatus("요청중");



        vacationRequestRepository.save(vacationRequest);
    }
}
