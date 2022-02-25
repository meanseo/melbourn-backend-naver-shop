package net.choiminseo.api.buy.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName: net.choiminseo.api.buy.domain
 * fileName   : CalcDTO
 * author     : 최민서
 * date       : 2022-02-25
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-25     최민서        최초 생성
 */

@Data
@Component
public class CalcDTO {
    private int num1;
    private String opcode;
    private int num2;
}
