package my.app.couch.annotation.valid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Optional;

public class MemNoValidator implements ConstraintValidator<MemNoValid, Long> {


    @Override
    public void initialize(MemNoValid constraintAnnotation) {

    }

    @Override
    public boolean isValid(Long value, ConstraintValidatorContext constraintValidatorContext) {
        Optional<Long> memNo = Optional.ofNullable(value);
        if(!memNo.isPresent()) return false;

        return true;
    }
}
