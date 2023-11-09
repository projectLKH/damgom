package project.damgom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.damgom.entity.Holiday;

public interface HolidayRepository extends JpaRepository<Holiday, Integer> {
}
