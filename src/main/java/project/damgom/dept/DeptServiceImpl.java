package project.damgom.dept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.damgom.entity.Dept;
import project.damgom.repository.DeptRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptRepository deptRepository;

    @Override
    public String createDept(int deptId, String deptName) {
        Optional<Dept> foundDeptById = deptRepository.findByDeptId(deptId);
        if(foundDeptById.isPresent()) {
            return "이미 있는 부서 ID";
        } else {
            Optional<Dept> foundDeptByName = deptRepository.findByDeptName(deptName);
            if(foundDeptByName.isPresent()) {
                return "이미 존재하는 부서 이름";
            } else {
                Dept dept = new Dept(deptId, deptName);
                deptRepository.save(dept);
                return "true";
            }
        }
    }

    @Override
    public String updateDept(int deptId, String deptName) {
        Optional<Dept> foundDeptById = deptRepository.findByDeptId(deptId);
        if(foundDeptById.isPresent()) {
            String foundDeptName = foundDeptById.get().getDeptName();
            Optional<Dept> foundDeptByName = deptRepository.findByDeptName(foundDeptName);
            if(foundDeptByName.isPresent()) {
                return "이미 있는 존재하는 부서 이름입니다.";
            } else {
                return "true";
            }
        } else {
            return "없는 부서 id입니다. 새로 생성해주세요.";
        }
    }

    @Override
    public void deleteDept(int id) {

    }

    public List<Dept> findAllDept() {
        return deptRepository.findAll();
    }
}
