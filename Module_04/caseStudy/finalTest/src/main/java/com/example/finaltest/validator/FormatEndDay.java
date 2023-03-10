package com.example.finaltest.validator;

import com.example.finaltest.model.KhuyenMai;
import org.springframework.beans.factory.annotation.Configurable;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;

@Configurable
public class FormatEndDay implements ConstraintValidator<IFormatEndDay, LocalDate> {
    @Override
    public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
        if (value == null)
            return false;
        LocalDate now = LocalDate.now();
        return value.compareTo(now) >= 0 && (value.compareTo(now.plusDays(1)) > 0);
    }
}