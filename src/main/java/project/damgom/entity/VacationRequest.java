package project.damgom.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "vacation_request")
@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class VacationRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vacation_request_key;


    @Column
    //신청직원 id
    private int emp_id;

    @Column
    //휴가 시작일
    private LocalDate vacation_request_start;
    @Column
    //휴가 종료일
    private LocalDate vacation_request_end;

    @Column
    //휴가의 종류
    private String vacation_request_type;

    @Column
    //휴가 사유
    private String vacation_request_reason;

    @Column
    //휴가 진행 상태
    private String vacation_request_status;

    @Column
    //신청 시간
    private LocalDateTime vacation_request_apply_time;

    @Column
    //처리 시간
    private LocalDateTime vacation_request_process_time;
}
