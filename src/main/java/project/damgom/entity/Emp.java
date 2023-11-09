package project.damgom.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table
@ToString
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Emp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emp_key;
    @Column
    private int dept_id;
    @Column
    private int emp_id;
    @Column
    private String emp_name;
    @Column
    private String emp_position;
    @Column
    private String emp_password;
    @Column
    private String emp_phone;
}
