package com.fintech.openbangking.controller;


import com.fintech.openbangking.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class MemberController {
    private MemberService memberService;
}
