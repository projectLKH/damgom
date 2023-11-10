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
    @Column(name = "holiday_key")
    private int holidayKey;
    @Column(name = "holiday_name")
    private String holidayName;
    @Column(name = "holiday_date")
    private LocalDate holidayDate;
}
