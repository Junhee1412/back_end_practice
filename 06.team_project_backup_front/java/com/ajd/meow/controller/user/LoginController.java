package com.ajd.meow.controller.user;

import com.ajd.meow.entity.UserMaster;
import com.ajd.meow.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;

//@RequiredArgsConstructor
@Controller
@SessionAttributes("user")
public class LoginController {
    @Autowired
    private UserService userService;

    @GetMapping("/loginpage")
    public String login(HttpSession session, Model model){
        if(session.getAttribute("user")==null){
            model.addAttribute("userType","noUser");
            return "user/login_page";
        }else{ // 혹시 로그인되잇는데 로그인버튼을 눌럿을 경우 대비해 적어봄
            return "redirect:/";
        }
    }

    @PostMapping("/loginpage")
    public String login(UserMaster user, Model model){
        UserMaster findUser=userService.getUserMaster(user);
        if(findUser!=null && findUser.getUserPassword().equals(user.getUserPassword())){
            model.addAttribute("user",findUser);
            model.addAttribute("userType",findUser.getUserType());
            return "redirect:/";
        }else {
            model.addAttribute("errMsg", "로그인 실패! 다시 입력해주세요.");
            return "user/login_page";}
    }

    @GetMapping("/logout")
    public String logout(SessionStatus status){
        status.setComplete();
        return "redirect:/"; // 로그아웃 후 인덱스
    }
    // 이후 추가
    @GetMapping("/boardmodify/logout")
    public String logoutInBoardModifyPage(SessionStatus status){
        status.setComplete();
        return "redirect:/"; // 로그아웃 후 인덱스
    }
}
