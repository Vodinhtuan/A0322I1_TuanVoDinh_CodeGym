package com.example.finaltest.validator;

import org.springframework.context.annotation.Configuration;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;

@Configuration
public class FormatBeginDay implements ConstraintValidator<IFormatBeginDay, LocalDate> {
    @Override
    public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
        if(value == null)
            return false;
        LocalDate now = LocalDate.now();
        return value.compareTo(now) >= 0;
    }

}
