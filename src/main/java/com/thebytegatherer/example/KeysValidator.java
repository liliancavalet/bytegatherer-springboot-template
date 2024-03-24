package com.thebytegatherer.example;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;

@Target( { FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = KeyValidatorImpl.class)
public @interface KeysValidator {
    Class<? extends Enum<?>> enumClazz();
    String message() default "Invalid key value";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}