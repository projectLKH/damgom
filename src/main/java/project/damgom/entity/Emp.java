package project.damgom.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table
@ToString
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Emp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_key")
    private int empKey;
    @Column(name = "dept_id")
    private int deptId;
    @Column(name = "emp_id")
    private int empId;
    @Column(name = "emp_name")
    private String empName;
    @Column(name = "emp_position")
    private String empPosition;
    @Column(name = "emp_password")
    private String empPassword;
    @Column(name = "emp_phone")
    private String empPhone;

}
