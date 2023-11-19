package project.damgom.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import project.damgom.entity.Dept;

import java.util.Optional;

@SpringBootTest
public class DeptRepositoryTest {

    @Autowired
    DeptRepository deptRepository;
    @Test
    public void findByDeptName() {
        String name = "영업부";
        Optional<Dept> dept = deptRepository.findByDeptName(name);

        // dept가 존재하면 출력
        if (dept.isPresent()) {
            System.out.println("dept = " + dept.get());
        } else {
            System.out.println("Department not found");
        }
    }
}
