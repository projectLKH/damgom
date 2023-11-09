package project.damgom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.damgom.entity.LeaveRequest;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Integer> {
}
