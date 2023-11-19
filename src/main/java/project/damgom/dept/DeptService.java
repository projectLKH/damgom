package project.damgom.dept;

public interface DeptService {

    String createDept(int deptId, String deptName);
    String updateDept(int deptId, String deptName);

    void deleteDept(int deptId);
}
