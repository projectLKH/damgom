package project.damgom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.damgom.entity.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {
}
