package sss;

import org.springframework.lang.Nullable;
import org.springframework.util.StringUtils;
import org.springframework.validation.FieldError;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ObjectError;

import java.util.Map;

public class haxi extends MapBindingResult {
    /**
     * Create a new MapBindingResult instance.
     *
     * @param target     the target Map to bind onto
     * @param objectName the name of the target object
     */
    public haxi(Map<?, ?> target, String objectName) {
        super(target, objectName);
    }

    @Override
    public void rejectValue(@Nullable String field, String errorCode, @Nullable Object[] errorArgs, @Nullable String defaultMessage) {

        if (!StringUtils.hasLength(getNestedPath()) && !StringUtils.hasLength(field)) {
            // We're at the top of the nested object hierarchy,
            // so the present level is not a field but rather the top object.
            // The best we can do is register a global error here...
            reject(errorCode, errorArgs, defaultMessage);
            return;
        }

        String fixedField = fixedField(field);
        Object newVal = getActualFieldValue(fixedField);
        fileld fe = new fileld(getObjectName(), fixedField
                , defaultMessage);
        addError(fe);
    }

    @Nullable
    @Override
    public fileld getFieldError(String field) {
        String fixedField = fixedField(field);
        for (ObjectError objectError : this.getAllErrors()) {
            if (objectError instanceof FieldError) {
                fileld fieldError = (fileld) objectError;
                if (isMatchingFieldError(fixedField, fieldError)) {
                    return fieldError;
                }
            }
        }
        return null;
    }
}
