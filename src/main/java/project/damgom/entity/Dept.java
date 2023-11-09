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
    private int dept_key;
    @Column
    private int dept_id;
    @Column
    private String dept_name;
}
