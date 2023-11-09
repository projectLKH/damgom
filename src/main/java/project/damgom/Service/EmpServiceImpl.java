package project.damgom.Service;

import org.springframework.beans.factory.annotation.Autowired;
import project.damgom.entity.Emp;
import project.damgom.repository.EmpRepository;

import java.util.List;

public class EmpServiceImpl implements EmpService {

    @Autowired
    EmpRepository empRepository;

    @Override
    public void empRegist(int emp_id, String emp_name, String emp_position, String emp_phone) {
        Emp emp = new Emp(emp_id, emp_name, emp_position, "1234", emp_phone);
        empRepository.save(emp);
    }

    @Override
    public List<Emp> findAllEmp() {
        return empRepository.findAll();
    }
}
