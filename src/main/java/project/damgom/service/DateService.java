package project.damgom.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
@Service
public class DateService {
    public LocalDate stringTOLocalDate(String string) {
        if (string == null || string.isEmpty()) {
            return null;
        } else {
            return LocalDate.parse(string);
        }
    }
}
