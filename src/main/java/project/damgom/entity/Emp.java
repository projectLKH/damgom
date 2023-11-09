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

    public Emp(int emp_id, String emp_name, String emp_position, String emp_password, String emp_phone) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_position = emp_position;
        this.emp_password = emp_password;
        this.emp_phone = emp_phone;
    }
}
