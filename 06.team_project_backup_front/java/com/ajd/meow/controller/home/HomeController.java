package com.ajd.meow.controller.home;

import com.ajd.meow.entity.UserMaster;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(HttpSession session){
        if(session.getAttribute("user")==null){
            return "index";
        }else{
            UserMaster loginUser= (UserMaster)session.getAttribute("user");
            if(loginUser.getUserType().equals("ADMIN")){
                return "admin/admin_index";// 어드민 페이지로 이동
            }else{
                return "user/index_login";
            }
        }
    }

    @GetMapping("/business")
    public String business(){
        return "business/business_info";
    }

    @GetMapping("/businessTest")
    public String business_test(){
        return "business/business_info_test";
    }

    @GetMapping("/test")
    public String TestLayout(){
        return "fragments/testfile";
    }

    @GetMapping("/termtest")
    public String termLayout(){
        return "user/terms_test";
    }

    @GetMapping("/donate_home_test")
    public String donate_home_test(){
        return "donate/donate_home_test";
    }

    @GetMapping("/donate_insert_test")
    public String donate_insert_test(){
        return "donate/donate_insert_test";
    }

}
