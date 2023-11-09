package project.damgom.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "work_record")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WorkRecord{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int work_record_key;
    @Column
    private int emp_id;
    @Column
    private LocalDate work_record_date;
    @Column
    private LocalDateTime work_record_clock_in;
    @Column
    private LocalDateTime work_record_clock_out;
    @Column
    private LocalDateTime work_record_leave;
    @Column
    private LocalDateTime work_record_return;
    @Column
    private LocalDateTime work_record_over_start;
    @Column
    private LocalDateTime work_record_over_end;

}
