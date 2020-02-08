package me.choi.bitoperation;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 08/02/2020
 * Time : 6:12 오후
 */

public class BitEx {
    public static void main(String[] args) {

        System.out.println(getBit(3, 3));
        System.out.println(setBit(5,3));
        System.out.println(clearBits(5,3));

    }

    // TODO: [] junwoochoi 08/02/2020 6:37 오후
    // 3의 3번째 index값이 1이면 true 0이면 false
    //[0] 0 1 1
    public static boolean getBit (int i, int index) {
        int shift = 1 << index;

        return (i & shift) != 0 ;
    }
    // TODO: [] junwoochoi 08/02/2020 6:37 오후
    // 특정 index의 값을 1로 변환해서 출력
    public static int setBit (int i, int index) {
        int shift = 1 << index;

        return (i | shift);
    }

    // TODO: [] junwoochoi 08/02/2020 6:36 오후
    // 특정 index를 0으로 세팅하는 함수 구현
    // 5 , 3   0101
    public static int clearBits(int num, int index) {
        int shift = ~(1 << index);
        return num & shift;
    }
    
    // TODO: [] junwoochoi 08/02/2020 6:51 오후
    // 특정 index를 기준으로 왼쪽의 비트를 모두 0으로 초기화하는 연산
    public static int clearLeftBits (int num, int index) {
        int shift = (1 << index) -1 ;
        return num & shift;
    }
    
    // TODO: [] junwoochoi 08/02/2020 6:54 오후
    // 특정 index를 기준으로 오른쪽의 비트를 모두 0으로 초기화하는 연산
    public static int clearRightBits (int num, int index) {
        int shift = (-1 << index +1);
        return num & shift;
    }

}

