package com.korea.test.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/member")
public class MemberController {
    private final MemberService memberService;
    @GetMapping("/signup")
    public String signup(){
        return "signup_form";
    }
    @PostMapping("/signup")
    public String join(String loginId,String password,String name,String email){
        memberService.join(loginId,password,name,email);
        return "redirect:/";
    }
    @GetMapping("/login")
    public String login(){
        return "login_form";
    }
}
