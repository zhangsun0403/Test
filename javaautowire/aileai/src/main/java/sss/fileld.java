package sss;

import org.springframework.validation.FieldError;

public class fileld  extends FieldError{

    private String objectname;
    private String fileld;
    private String defaultMessage;

    public fileld(String objectName, String field, String defaultMessage) {
        super(objectName, field, defaultMessage);
        this.fileld=field;
        this.objectname=objectName;
        this.defaultMessage=defaultMessage;
    }


    @Override
    public String toString() {
        return  objectname+"  "+fileld+"  "+defaultMessage;
    }


}
