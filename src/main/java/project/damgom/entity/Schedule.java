package project.damgom.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int schedule_key;
    @Column
    private int emp_id;
    @Column
    private LocalDate schedule_date;
    @Column
    private LocalDateTime schedule_clock_in;
    @Column
    private LocalDateTime schedule_clock_out;
    @Column
    private LocalDateTime schedule_break_start;
    @Column
    private LocalDateTime schedule_break_end;
    @Column
    private LocalDateTime schedule_leave;
    @Column
    private LocalDateTime schedule_return;
    @Column
    private LocalDateTime schedule_over_start;
    @Column
    private LocalDateTime schedule_over_end;
    @Column
    private LocalDateTime schedule_time;
}
