package project.damgom.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "over_request")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OverRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "over_request_key")
    private int overRequestKey;
    @Column(name = "emp_id")
    private int empId;
    @Column(name = "over_request_date")
    private LocalDate overRequestDate;
    @Column(name = "over_request_start")
    private LocalDateTime overRequestStart;
    @Column(name = "over_request_end")
    private LocalDateTime overRequestEnd;
    @Column(name = "over_request_time")
    private String overRequestTime;
    @Column(name = "over_request_status")
    private String overRequestStatus;
    @Column(name = "over_request_apply_time")
    private LocalDateTime overRequestApplyTime;
    @Column(name = "over_request_process_time")
    private LocalDateTime overRequestProcessTime;
}
