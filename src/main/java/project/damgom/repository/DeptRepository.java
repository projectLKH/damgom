package project.damgom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.damgom.entity.Dept;

public interface DeptRepository extends JpaRepository<Dept, Integer> {
}
