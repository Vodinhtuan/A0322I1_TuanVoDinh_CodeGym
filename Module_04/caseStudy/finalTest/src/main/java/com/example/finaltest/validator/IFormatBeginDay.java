package com.example.finaltest.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = FormatBeginDay.class)
public @interface IFormatBeginDay {
    String message() default "Please select a date that is from current date";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
