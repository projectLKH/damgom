package project.damgom.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class VacationRequestDTO {
    private int empId;
    private LocalDate vacationRequestStart;
    private LocalDate vacationRequestEnd;
    private String vacationRequestType;
    private String vacationRequestReason;
    private String vacationRequestStatus;
}
