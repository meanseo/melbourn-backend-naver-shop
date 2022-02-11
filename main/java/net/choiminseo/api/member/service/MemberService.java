package net.choiminseo.api.member.service;

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
    String memberList();
    String memberInfo();
    String shipmentList();
    String mailRegistration();
    String pointList();
    String showPoint();
    String getPoint();
    String deletePoint();
}
