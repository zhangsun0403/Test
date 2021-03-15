package webMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

@Controller
public class hellocontroller {

    @RequestMapping("/name")
    @ResponseBody
    public String sname(HttpServletRequest request){





        return "forward:/sname";
    }
    @RequestMapping("/sname")
    @ResponseBody
    public String snameas(HttpServletRequest request,MultipartFile file) throws IOException {

        if(file.isEmpty()){
            return "上传失败。";
        }
        String path="F:\\filelive\\";
        String originalFilename = file.getOriginalFilename();
        file.transferTo(new File(path+originalFilename));

        return "success---";
    }
    @RequestMapping("/ss")
    @ResponseBody
    public String snameasss(HttpServletRequest request){



        return "sname++++";
    }


}
