package ru.cs.vsu.autoservice.service.validators;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class AgeValidator {

    public static LocalDate convertToEntityAttribute(java.sql.Date databaseValue) {

        return (databaseValue == null) ? null
                : databaseValue.toLocalDate();
    }

    public static void checkAge(Date dateOfBirth) {

        LocalDate firstDate = LocalDate.now();
        LocalDate twoDate = convertToEntityAttribute((java.sql.Date) dateOfBirth);

        long daysBetween = ChronoUnit.DAYS.between(twoDate, firstDate);
        System.out.println(daysBetween/365);
        if (daysBetween/365 < 18){
            //throw new LockedAgeException();
        }

    }
}