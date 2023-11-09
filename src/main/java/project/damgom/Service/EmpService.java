package project.damgom.Service;

import org.springframework.stereotype.Service;
import project.damgom.entity.Emp;

import java.util.List;

@Service
public interface EmpService {
    //사원등록
    void empRegist(int emp_id, String emp_name, String emp_position, String emp_phone);

    List<Emp> findAllEmp();
}
