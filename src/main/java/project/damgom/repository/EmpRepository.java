package project.damgom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.damgom.entity.Emp;

import java.util.Optional;

public interface EmpRepository extends JpaRepository<Emp, Integer> {
    Optional<Emp> findByEmpId(int empId);
}
