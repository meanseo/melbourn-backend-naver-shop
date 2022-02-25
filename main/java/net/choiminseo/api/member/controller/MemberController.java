package net.choiminseo.api.member.controller;

import lombok.RequiredArgsConstructor;
import net.choiminseo.api.buy.domain.CalcDTO;
import net.choiminseo.api.member.domain.MemberDTO;
import net.choiminseo.api.member.service.MemberService;
import org.springframework.web.bind.annotation.*;

/**
 * packageName: net.choiminseo.api.member.controller
 * fileName   : MemberController
 * author     : 최민서
 * date       : 2022-02-11
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-11     최민서        최초 생성
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService service;

    @PostMapping("/bmi") public String getBmi(@RequestBody MemberDTO member){
        return service.bmi(member);
    }

    @PostMapping("/calc") public String calc(@RequestBody CalcDTO calc){

        return service.calc(calc);
    }

    @PostMapping ("/login")
    public String login(@RequestBody MemberDTO member){
        return service.login(member);
    }

    @PostMapping("/grade")
    public String getGrade(@RequestBody MemberDTO member){
        return service.grade(member);
    }

}
