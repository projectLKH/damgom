package project.damgom.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Dept {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dept_key")
    private int deptKey;
    @Column(name = "dept_id")
    private int deptId;
    @Column(name = "dept_name")
    private String deptName;

    public Dept(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }
}
