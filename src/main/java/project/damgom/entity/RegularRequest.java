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
    private int regular_request_key;
    @Column
    private int emp_id;
    @Column
    private int regular_request_id;
    @Column
    private LocalDate regular_request_date;
    @Column
    private LocalDateTime regular_request_clock_in;
    @Column
    private LocalDateTime regular_request_clock_out;
    @Column
    private LocalDateTime regular_request_break_start;
    @Column
    private LocalDateTime regular_request_break_end;
    @Column
    private String regular_request_status;
    @Column
    private LocalDateTime regular_request_apply_time;
    @Column
    private LocalDateTime regular_request_process_time;
}
