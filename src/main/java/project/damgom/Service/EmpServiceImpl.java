package project.damgom.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.damgom.entity.Emp;
import project.damgom.repository.EmpRepository;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

import static java.lang.Integer.parseInt;

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
    @Override
    public String login(String empId, String empPassword) {
        Optional<Emp> loginRequestEmp = empRepository.findByEmpId(Integer.parseInt(empId));
        if(loginRequestEmp.isEmpty()) {
            return "로그인 정보가 잘못 입력되었습니다.";
        } else {
            if(loginRequestEmp.get().getEmpPassword().equals(empPassword)) {
                return "true";
            } else {
                return "로그인 정보가 잘못 입력되었습니다.";
            }
        }
    }

    @Override
    public void setLoginSession(HttpSession session, int empId) {
        Optional<Emp> emp = empRepository.findByEmpId(empId);
        session.setAttribute("emp", emp);
    }

    @Override
    public String findEmpPassword(String empId, String empName, String empPhone) {
        System.out.println(empId+"******************************");
        Optional<Emp> emp = empRepository.findByEmpId(Integer.parseInt(empId));
        if(emp.isPresent()) {
            if(empName.equals(emp.get().getEmpName()) && empPhone.equals(emp.get().getEmpPhone())) {
                return emp.get().getEmpPassword();
            } else return "정보가 일치하지 않습니다.";
        } else return "정보가 일치하지 않습니다.";
    }

}
