package com.example.flyway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public void saveMember(Member member){
        memberRepository.save(member);
    }
}
