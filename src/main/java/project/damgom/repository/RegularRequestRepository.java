package project.damgom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.damgom.entity.RegularRequest;

public interface RegularRequestRepository extends JpaRepository<RegularRequest, Integer> {
}
