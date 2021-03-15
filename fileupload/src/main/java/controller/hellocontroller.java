package controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
public class hellocontroller {


    @RequestMapping("/sname")
    @ResponseBody
    public String namezjk(HttpServletRequest request) throws Exception {

        System.out.println("文件上传...");
        String realPath = request.getServletContext().getRealPath("/upload/");
        String path="F:\\filelive";
        File f=new File(realPath);
        if(!f.exists()){
            f.mkdirs();
        }
        DiskFileItemFactory factory=new DiskFileItemFactory();
        ServletFileUpload upload=new ServletFileUpload(factory);
        List<FileItem> fileItems = upload.parseRequest(request);
        for (FileItem s:fileItems){
            if(s.isFormField()){
                System.out.println("普通表单");

            }else {
                String name = s.getName();
                String s1 = UUID.randomUUID().toString().replace("-","");
                name=s1+"-"+name;
                s.write(new File(path,name));
                s.delete();
            }

        }


        return "success";
    }

    @RequestMapping("/tt")
    @ResponseBody
    public String zjk(MultipartFile upload) throws IOException {

        System.out.println("跨服务器上传....");
        String path="http://localhost:8081/uploads/";
        String originalFilename = upload.getOriginalFilename();
        String s = UUID.randomUUID().toString();
        originalFilename=s+"-"+originalFilename;
        Client client=Client.create();
        WebResource resource = client.resource(path+originalFilename);
        resource.put(upload.getBytes());


        return "success";
    }

    @RequestMapping(value = "/namedd",produces = {"application/json"})
    @ResponseBody
    public String namedd(@RequestParam("sname") String sname){
        System.out.println(sname);

        return "namedd----";
    }
}
