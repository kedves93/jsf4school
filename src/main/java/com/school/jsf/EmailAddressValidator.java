package com.school.jsf;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class EmailAddressValidator implements ConstraintValidator<ValidEmailAddress, String> {

    @Override
	public void initialize(ValidEmailAddress constraintAnnotation) {}
    
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
    	Matcher matcher = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE).matcher(value);
    	return matcher.find();
    }
}
