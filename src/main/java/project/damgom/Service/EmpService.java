package project.damgom.Service;

import org.springframework.stereotype.Service;
import project.damgom.entity.Emp;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public interface EmpService {
    //사원등록
    void empInsert(Emp emp);

    //사원 목록
    List<Emp> findAllEmp();

    //로그인용
    String login(String empId, String password);
    void setLoginSession(HttpSession session, int empId);
}
