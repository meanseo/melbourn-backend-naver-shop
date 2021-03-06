package net.choiminseo.api.member.service;

import net.choiminseo.api.buy.domain.CalcDTO;
import net.choiminseo.api.member.domain.MemberDTO;

/**
 * packageName: net.choiminseo.api.member.service
 * fileName   : MemberService
 * author     : 최민서
 * date       : 2022-02-11
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-11     최민서        최초 생성
 */

public interface MemberService {


    String calc(CalcDTO calc);

    String bmi(MemberDTO member);

    String grade(MemberDTO member);

    String login(MemberDTO member);
}
