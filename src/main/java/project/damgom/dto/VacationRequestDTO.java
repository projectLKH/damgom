package project.damgom.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@Data
public class VacationRequestDTO {
    private int empId;
    private LocalDate vacationRequestStart;
    private LocalDate vacationRequestEnd;
    private String vacationRequestType;
    private String vacationRequestReason;
    private String vacationRequestStatus;

}
