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
    @Column(name = "work_record_key")
    private int workRecordKey;
    @Column(name = "emp_id")
    private int empId;
    @Column(name = "work_record_date")
    private LocalDate workRecordDate;
    @Column(name = "work_record_clock_in")
    private LocalDateTime workRecordClockIn;
    @Column(name = "work_record_clock_out")
    private LocalDateTime workRecordClockOut;
    @Column(name = "work_record_leave")
    private LocalDateTime workRecordLeave;
    @Column(name = "work_record_return")
    private LocalDateTime workRecordReturn;
    @Column(name = "work_record_over_start")
    private LocalDateTime workRecordOverStart;
    @Column(name = "work_record_over_end")
    private LocalDateTime workRecordOverEnd;

}
