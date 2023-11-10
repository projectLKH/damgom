package project.damgom.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.damgom.entity.Emp;
import project.damgom.repository.EmpRepository;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    EmpRepository empRepository;

    @Override
    public void empInsert(Emp emp) {
            emp.setEmpPassword("1234");
            empRepository.save(emp);
    }

    @Override
    public List<Emp> findAllEmp() {
        return empRepository.findAll();
    }
}
