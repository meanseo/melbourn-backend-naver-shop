package net.choiminseo.api.member.repository;

import net.choiminseo.api.buy.domain.CalcDTO;
import net.choiminseo.api.member.domain.MemberDTO;

/**
 * packageName: net.choiminseo.api.member.repository
 * fileName   : MemberRepository
 * author     : 최민서
 * date       : 2022-02-25
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-25     최민서        최초 생성
 */
public interface MemberRepository {
    String bmi(MemberDTO member);

    String calc(CalcDTO calc);

    String grade(MemberDTO member);

    String login(MemberDTO member);
}
