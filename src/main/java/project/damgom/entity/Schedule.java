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
    @Column(name = "schedule_key")
    private int scheduleKey;
    @Column(name = "emp_id")
    private int empId;
    @Column(name = "schedule_date")
    private LocalDate scheduleDate;
    @Column(name = "schedule_clock_in")
    private LocalDateTime scheduleClockIn;
    @Column(name = "schedule_clock_out")
    private LocalDateTime scheduleClockOut;
    @Column(name = "schedule_break_start")
    private LocalDateTime scheduleBreakStart;
    @Column(name = "schedule_break_end")
    private LocalDateTime scheduleBreakEnd;
    @Column(name = "schedule_leave")
    private LocalDateTime scheduleLeave;
    @Column(name = "schedule_return")
    private LocalDateTime scheduleReturn;
    @Column(name = "schedule_over_start")
    private LocalDateTime scheduleOverStart;
    @Column(name = "schedule_over_end")
    private LocalDateTime scheduleOverEnd;
    @Column(name = "schedule_time")
    private LocalDateTime scheduleTime;
}
