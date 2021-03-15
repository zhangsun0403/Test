package zhang.mvc.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class users {

    @Min(value = 20,message = "必须不小于20" )
    private Integer id;

    @NotBlank(message = "用户名称不能为空。")
    private String sname;

//    @NotEmpty(message = "密码不能为空")
//    @Length(min = 6, max = 8, message = "密码长度为6-8位。")
//    @Pattern(regexp = "[a-zA-Z]*", message = "密码不合法")
//    private String password;

}
