package project.damgom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.damgom.entity.OverRequest;

public interface OverRequestRepository extends JpaRepository<OverRequest, Integer> {
}
