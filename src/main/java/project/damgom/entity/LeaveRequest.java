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
    private int leave_request_key;
    @Column
    private int emp_id;
    @Column
    private LocalDate leave_request_date;
    @Column
    private LocalDateTime leave_request_start;
    @Column
    private LocalDateTime leave_request_end;
    @Column
    private String leave_request_status;
    @Column
    private LocalDateTime leave_request_apply_time;
    @Column
    private LocalDateTime leave_request_process_time;
    @Column
    private String leave_request_reason;
}
