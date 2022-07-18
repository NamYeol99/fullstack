package javalang;

import java.util.Arrays;

public class _04_Math {
    public static void main(String[] args) {
        System.out.println(Math.abs(-10)); //절대값 반환
        System.out.println(Math.ceil(10.1)); // 값 올림, 절상
        System.out.println(Math.floor(10.8)); // 값 내림, 절삭
        System.out.println(Math.round(10.5)); // 반올림
        System.out.println(Math.max(-1.4, -1.2)); // 큰 값 반환
        int[] arr = new int[5];
        for (int i = 0; i <arr.length; i++) { // 1~100 배열 생성
            arr[i] = (int)(Math.random()*100)+1;
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) { 
            max = Math.max(max, arr[i]); //최대값 찾기
            min = Math.min(min, arr[i]); // 최솟값 찾기
        }
        System.out.println(max);
        System.out.println(min);
        // 가장 가까운 정수값을 실수형으로 반환, 단 두 정수의 가운데 있는 값은 짝수를 반환
        System.out.println(Math.rint(1.2));
        System.out.println(Math.rint(-1.7));
        System.out.println(Math.rint(3.5));
        System.out.println(Math.rint(4.5));

        Object obj = 11;
        Integer i1 = Integer.valueOf(10);
        System.out.println(obj == i1);
        int i2 = (int)(obj);
        int i3 = i1;
        System.out.println(Integer.parseInt("1010", 2)); // 기본형 int로 변환
        System.out.println(Integer.parseInt("1010", 8));
        System.out.println(Integer.parseInt("1010", 16));
        
        System.out.println(Integer.valueOf("1010", 2)); // 래퍼클래스 Integer로 변환
        System.out.println(Integer.valueOf("1010", 8));
        System.out.println(Integer.valueOf("1010", 16));

        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toOctalString(10));
        System.out.println(Integer.toHexString(10));

        int num = Integer.parseInt("10"); //참조형 => 일반형 Unboxing
        Integer i4 = Integer.valueOf(10); //참조형 => 참조형
        Integer i5 = 10; //일반형 => 참조형 Autoboxing

        // Autoboxing과 Unboxing은 암묵적으로 처리됨.
        Object[] objs = new Object[5];
        objs[0] = true;
        objs[1] = new Object(){};
        objs[2] = Integer.valueOf("10");
        objs[3] = 100; //Integer.valueof(100) 생략
        System.out.println(objs[2]);
    } 
}
