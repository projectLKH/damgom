package project.damgom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.damgom.entity.VacationRequest;

public interface VacationRequestRepository extends JpaRepository<VacationRequest, Integer> {
}
