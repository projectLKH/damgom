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
    private int over_request_key;

    @Column
    private int emp_id;
    @Column
    private LocalDate over_request_date;
    @Column
    private LocalDateTime over_request_start;
    @Column
    private LocalDateTime over_request_end;
    @Column
    private String over_request_time;
    @Column
    private String over_request_status;
    @Column
    private LocalDateTime over_request_apply_time;
    @Column
    private LocalDateTime over_request_process_time;
}
