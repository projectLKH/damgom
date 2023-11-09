package project.damgom.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "vacation_request")
@Builder
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class VacationRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vacation_request_key;
    @Column
    private int emp_id;
    @Column
    private LocalDate vacation_request_start;
    @Column
    private LocalDate vacation_request_end;
    @Column
    private String vacation_request_type;
    @Column
    private String vacation_request_reason;
    @Column
    private String vacation_request_status;
    @Column
    private LocalDateTime vacation_request_apply_time;
    @Column
    private LocalDateTime vacation_request_process_time;
}
