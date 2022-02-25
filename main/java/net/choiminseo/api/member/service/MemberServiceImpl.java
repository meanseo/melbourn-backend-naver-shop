package net.choiminseo.api.member.service;

import lombok.RequiredArgsConstructor;
import net.choiminseo.api.buy.domain.CalcDTO;
import net.choiminseo.api.member.domain.MemberDTO;
import net.choiminseo.api.member.repository.MemberRepository;
import org.springframework.stereotype.Service;

/**
 * packageName: net.choiminseo.api.member.service
 * fileName   : MemberServiceImpl
 * author     : 최민서
 * date       : 2022-02-11
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-11     최민서        최초 생성
 */

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository repository;


    @Override
    public String calc(CalcDTO calc) {
        int a = calc.getNum1();
        int b = calc.getNum2();
        int res = 0;
        String op = calc.getOpcode();
         switch (op){
            case "+": res = a + b; break;
            case "-": res = a - b; break;
            case "*": res = a * b; break;
            case "/": res = a / b; break;
            case "%": res = a % b; break;
        }
        return String.format("%d %s %d = %d", a, op, b, res);
    }

    @Override
    public String bmi(MemberDTO member) {
        String name = member.getName();
        String res = "";
        double bmi = member.getWeight() / (member.getHeight() * member.getHeight()) * 10000;

        if (bmi > 30) {
            res = "고도 비만 입니다.";
        } else if (bmi > 25) {
            res = "경도 비만 입니다.";
        } else if (bmi > 23) {
            res = "과체중 입니다.";
        } else if (bmi > 18.5) {
            res = "정상체중 입니다.";
        } else {
            res = "저체중 입니다.";
        }


        return String.format("%s 님, BMI 결과: %s",name,res);
    }

    @Override
    public String grade(MemberDTO member) {
        int total = member.getKor() + member.getEng() + member.getMath();
        int avg = total / 3;
        String pass = (avg >= 60) ? "합격" : "불합격";
        return String.format("########## 성적표 ######## \n" +
                        " *  이름: %s \n" +
                        " *  > 국어: %d점 \n" +
                        " *  > 영어: %d점 \n" +
                        " *  > 수학: %d점 \n" +
                        " *  총점: %d점 \n" +
                        " *  평균(정수): %d점 \n" +
                        " *  합격여부: %s \n" +
                        " ########################",
                member.getName(), member.getKor(), member.getEng(),
                member.getMath(),total, avg, pass);

    }

    @Override
    public String login(MemberDTO member) {
        final String PASSWORD = "abc";
        return (member.getPassword().equals(PASSWORD)) ? String.format(" %s 님의 비번 %s가 맞습니다. 로그인 성공",member.getId(), member.getPassword())
                : String.format(" %s 님의 ID는 맞고 비번 %s가 틀립니다. 로그인 실패", member.getId(), member.getPassword());
    }
}
