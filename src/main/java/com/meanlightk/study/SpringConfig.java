package com.meanlightk.study;

import com.meanlightk.study.repository.MemberRepository;
import com.meanlightk.study.repository.MemoryMemberRepository;
import com.meanlightk.study.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    /**
     * 자바 코드로 직접 스프링 빈을 등록할 때 장점
     * 나중에 MemoryMemberRepository를 DbMemoryMemberRepository로 변경하고싶을때,
     *  return new MemoryMemberRepository(); ->  return new DbMemoryMemberRepository();
     * 해주면 됨.
     */
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

}
