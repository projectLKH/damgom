package project.damgom.Service;

import org.springframework.stereotype.Service;
import project.damgom.entity.Emp;

import java.util.List;

@Service
public interface EmpService {
    //사원등록
    void empInsert(Emp emp);

    List<Emp> findAllEmp();
}
