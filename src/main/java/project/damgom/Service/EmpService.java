package project.damgom.Service;

import org.springframework.stereotype.Service;
import project.damgom.entity.Emp;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public interface EmpService {
    //사원등록
    boolean empInsert(Emp emp);

    //사원 목록
    List<Emp> findAllEmp();

    //로그인
    String login(String empId, String password);
    void setLoginSession(HttpSession session, int empId);

    //비밀번호 찾기
    String findEmpPassword(String empId, String empName, String empPhone);
}
