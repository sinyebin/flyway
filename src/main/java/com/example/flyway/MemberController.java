package com.example.flyway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @Autowired
    MemberService memberService;

    @PostMapping("/makeUser")
    public void makeUser(@RequestBody Member member){
        memberService.saveMember(member);
    }
}
