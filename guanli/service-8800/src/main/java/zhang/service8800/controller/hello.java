package zhang.service8800.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hello {

    /**
     * <li><a href="index.html">Home</a></li>
     <li><a href="blog.html">Blog</a></li>
     <li><a href="gallery.html">Gallery</a></li>
     <li><a href="single.html">About</a></li>
     <li><a href="single.html">Contact</a></li>
     */


    @GetMapping("/index")
    public String home(){

        return "index";
    }
    @GetMapping("/blog")
    public String blog(){

        return "blog";
    }
    @GetMapping("/gallery")
    public String Gallery(){

        return "gallery";
    }
    @GetMapping("/single")
    public String AboutContact(){

        return "single";
    }
}
