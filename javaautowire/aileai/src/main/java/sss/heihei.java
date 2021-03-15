package sss;

import applicationLister.first;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


public class heihei implements Validator {

    public boolean supports(Class<?> clazz) {

        return first.class.equals(clazz);
    }


    public void validate(Object target, Errors e) {
        first f=(first) target;
        Object age = e.getFieldValue("age");
        System.out.println(age);
        if(f.getAge()>10){
            e.rejectValue("age","你长大了",new Object[]{"*****"},"ssjkj"); //调用此方法的都是错误信息。
        }else if(f.getAge()<10){
            e.rejectValue("age","要多吃饭，少通宵");
        }



    }
}
