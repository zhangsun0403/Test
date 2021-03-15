package applicationLister;

import org.springframework.context.ApplicationEvent;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class four implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
