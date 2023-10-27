package com.customannotation.customValidation;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Constraint(validatedBy =EmailValidator.class )
public @interface  UniqEmail {
    String message() default "Duplicate Emails Are Not Allowed";

}
