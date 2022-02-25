package net.choiminseo.api.member.repository;

import lombok.RequiredArgsConstructor;
import net.choiminseo.api.buy.domain.CalcDTO;
import net.choiminseo.api.member.domain.MemberDTO;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName: net.choiminseo.api.member.repository
 * fileName   : MemberRepositoryImpl
 * author     : 최민서
 * date       : 2022-02-25
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-25     최민서        최초 생성
 */
@Repository
public class MemberRepositoryImpl implements  MemberRepository{
    @Override
    public String bmi(MemberDTO member) {
        return null;
    }

    @Override
    public String calc(CalcDTO calc) {
        return null;
    }

    @Override
    public String grade(MemberDTO member) {
        return null;
    }

    @Override
    public String login(MemberDTO member) {
        return null;
    }
}
