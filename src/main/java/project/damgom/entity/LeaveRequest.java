package project.damgom.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "leave_request")
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class LeaveRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "leave_request_key")
    private int leaveRequestKey;
    @Column(name = "emp_id")
    private int empId;
    @Column(name = "leave_request_date")
    private LocalDate leaveRequestDate;
    @Column(name = "leave_request_start")
    private LocalDateTime leaveRequestStart;
    @Column(name = "leave_request_end")
    private LocalDateTime leaveRequestEnd;
    @Column(name = "leave_request_status")
    private String leaveRequestStatus;
    @Column(name = "leave_request_apply_time")
    private LocalDateTime leaveRequestApplyTime;
    @Column(name = "leave_request_process_time")
    private LocalDateTime leaveRequestprocessTime;
    @Column(name = "leave_request_reason")
    private String leaveRequestReason;
}
