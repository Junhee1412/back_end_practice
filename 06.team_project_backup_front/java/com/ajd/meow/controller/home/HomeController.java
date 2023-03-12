package com.ajd.meow.controller.home;

import com.ajd.meow.entity.UserMaster;
import com.ajd.meow.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
    @Autowired // 이후 추가 - 필요없나 싶긴한데 걍 혹시 몰라 씀니다.
    private UserService userService;

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

    @GetMapping("/business") // 이후 추가
    public String business(HttpSession session, Model model){
        model.addAttribute("userType",userService.getUserMaster((UserMaster)session.getAttribute("user")).getUserType());
        return "business/business_info";
    }

    @GetMapping("/test")
    public  String test(){
        return "fragments/testfile";
    }
}
