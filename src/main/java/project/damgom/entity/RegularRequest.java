package project.damgom.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "regular_request")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegularRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "regular_request_key")
    private int regularRequestKey;
    @Column(name = "emp_id")
    private int empId;
    @Column(name = "regular_request_id")
    private int regularRequestId;
    @Column(name = "regular_request_date")
    private LocalDate regularRequestDate;
    @Column(name = "regular_request_clock_in")
    private LocalDateTime regularRequestClockIn;
    @Column(name = "regular_request_clock_out")
    private LocalDateTime regularRequestClockOut;
    @Column(name = "regular_request_break_start")
    private LocalDateTime regularRequestBreakStart;
    @Column(name = "regular_request_break_end")
    private LocalDateTime regularRequestBreakEnd;
    @Column(name = "regular_request_status")
    private String regularRequestStatus;
    @Column(name = "regular_request_apply_time")
    private LocalDateTime regularRequestApplyTime;
    @Column(name = "regular_request_process_time")
    private LocalDateTime regularRequestProcessTime;
}
