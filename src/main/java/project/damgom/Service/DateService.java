package project.damgom.Service;

import java.time.LocalDate;

public class DateService {
    public LocalDate stringTOLocalDate(String string) {
        if (string == null || string.isEmpty()) {
            return null;
        } else {
            return LocalDate.parse(string);
        }
    }
}
