package project.damgom.entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

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

    //휴가 시작일
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "vacation_request_start")
    private LocalDate vacationRequestStart;

    //휴가 종료일
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "vacation_request_end")
    private LocalDate vacationRequestEnd;

    //휴가의 종류
    @Column(name = "vacation_request_type")
    private String vacationRequestType;

    //휴가 사유
    @Column(name = "vacation_request_reason")
    private String vacationRequestReason;

    //휴가 진행 상태
    @Column(name = "vacation_request_status")
    private String vacationRequestStatus;

    //신청 시간
    @Column(name = "vacation_request_apply_time")
    private LocalDateTime vacationRequestApplyTime;

    //처리 시간
    @Column(name = "vacation_request_process_time")
    private LocalDateTime vacationRequestProcessTime;

}
