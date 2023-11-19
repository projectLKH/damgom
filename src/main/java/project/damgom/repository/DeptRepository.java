package project.damgom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.damgom.entity.Dept;

import java.util.Optional;

public interface DeptRepository extends JpaRepository<Dept, Integer> {
    Optional<Dept> findByDeptId(int DeptId);

    Optional<Dept> findByDeptName(String deptName);
}
