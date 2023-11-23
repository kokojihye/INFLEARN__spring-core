package com.hello.core;

import com.hello.core.member.Grade;
import com.hello.core.member.Member;
import com.hello.core.member.MemberService;
import com.hello.core.member.MemberServiceImpl;


public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        new Member(1L, "memberA", Grade.VIP);
    }
}
