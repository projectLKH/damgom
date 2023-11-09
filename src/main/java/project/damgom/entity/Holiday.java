package project.damgom.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Holiday {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int holiday_key;
    @Column
    private String holiday_name;
    @Column
    private LocalDate holiday_date;
}
