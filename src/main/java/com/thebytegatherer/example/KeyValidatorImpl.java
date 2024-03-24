package com.thebytegatherer.example;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyValidatorImpl implements ConstraintValidator<KeysValidator, String> {

    List<String> keysEnum = null;

    @Override
    public void initialize(KeysValidator constraintAnnotation) {
        keysEnum = new ArrayList<String>();
        Class<? extends Enum<?>> enumClass = constraintAnnotation.enumClazz();

        @SuppressWarnings("rawtypes")
        Enum[] enumValArr = enumClass.getEnumConstants();

        for (@SuppressWarnings("rawtypes") Enum enumVal : enumValArr) {
            keysEnum.add(enumVal.toString().toUpperCase());
        }
    }

    @Override
    public boolean isValid(String key, ConstraintValidatorContext constraintValidatorContext) {
        return keysEnum.contains(key.toUpperCase());
    }
}
