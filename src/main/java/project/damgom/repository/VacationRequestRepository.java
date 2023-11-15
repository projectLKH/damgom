package project.damgom.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import project.damgom.entity.VacationRequest;

import java.util.Iterator;
import java.util.List;

public interface VacationRequestRepository extends JpaRepository<VacationRequest, Integer> {
    @Query("SELECT vr FROM VacationRequest vr WHERE vr.vacationRequestStatus IN :statuses")
    List<VacationRequest> findByStatus(@Param("statuses") List<String> statuses);





}
