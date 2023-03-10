package com.example.finaltest.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = FormatEndDay.class)
public @interface IFormatEndDay {
    String message() default "Please select a date that rather than begin day and Not empty!";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}