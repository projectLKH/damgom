package project.damgom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.damgom.entity.WorkRecord;

public interface WorkRecordRepository extends JpaRepository<WorkRecord, Integer> {
}
