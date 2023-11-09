package project.damgom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.damgom.entity.Emp;

public interface EmpRepository extends JpaRepository<Emp, Integer> {
}
