package project.damgom.Service;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import project.damgom.entity.VacationRequest;
import project.damgom.repository.VacationRequestRepository;

import java.util.List;

@Service
@ToString
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

        //
        public void save(VacationRequest vacationRequest){
            vacationRequestRepository.save(vacationRequest);
        }
}
