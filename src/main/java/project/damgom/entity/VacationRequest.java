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
    @Column(name = "vacation_request_key")
    private int vacationRequestKey;
    @Column(name = "emp_id")
    //신청직원 id
    private int empId;
    @Column(name = "vacation_request_start")
    //휴가 시작일
    private LocalDate vacationRequestStart;
    @Column(name = "vacation_request_end")
    //휴가 종료일
    private LocalDate vacationRequestEnd;
    @Column(name = "vacation_request_type")
    //휴가의 종류
    private String vacationRequestType;
    @Column(name = "vacation_request_reason")
    //휴가 사유
    private String vacationRequestReason;
    @Column(name = "vacation_request_status")
    //휴가 진행 상태
    private String vacationRequestStatus;
    @Column(name = "vacation_request_apply_time")
    //신청 시간
    private LocalDateTime vacationRequestApplyTime;
    @Column(name = "vacation_request_process_time")
    //처리 시간
    private LocalDateTime vacationRequestProcessTime;
}
