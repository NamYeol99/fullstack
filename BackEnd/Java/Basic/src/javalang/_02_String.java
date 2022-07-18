package javalang;

import java.util.Arrays;
import java.util.StringJoiner;

public class _02_String {
    public static void main(String[] args) {
        String str = new String("Hello"); // constant Pool의 주소를 직접가리킴
        String str2 = "Hello"; // 인스턴스 생성후 주소 가리킴
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i)); // 문자열 한자리씩 뽑기
        }
        System.out.println(str.compareTo("Aello")); //문자열 비교
        System.out.println(str.concat("world")); //문자열 결합
        System.out.println(str.contains("Hell")); //문자열 포함 여부 확인
        System.out.println(str.endsWith("lo")); // 특정 문자열로 끝나는지를 확인
        System.out.println(str.equalsIgnoreCase("hELLO")); // 대소문자 구분 X
        System.out.println(str.indexOf("ll")); //특정 문자 위치 찾기
        System.out.println(str.indexOf("l",3)); //해당위치에 특정 문자 찾기
        System.out.println(str.lastIndexOf("ll")); // 오른쪽끝에부터 찾기
        System.out.println(str.intern() == str2.intern()); //pool에 등록 -> 주소값 반환
        System.out.println(str.replace("l", "k")); //문자열 치환
        System.out.println(str.replaceAll("l", "k")); //문자열 치환
        System.out.println(str.replaceFirst("l", "k")); //첫번째 문자열 치환
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr)); //문자열 자르기
        System.out.println(str.startsWith("He")); // 해당 문자열로 시작
        System.out.println(str.substring(0,3)); // 해당위치의 문자열 얻기
        System.out.println(str.toLowerCase()); // 문자열을 소문자로 변환
        System.out.println(str.toUpperCase()); //문자열을 대문자로 변환
        System.out.println("     blank    banksy     ".trim()); // 왼쪽 끝과 오른쪽끝 공백 제거 중간공백은 제거되지 않음
        System.out.println("     blank    banksy     ".replace(" ","")); // 공백 제거
        System.out.println(String.valueOf(0010)); //8진수
        System.out.println(String.valueOf(0x10)); //16진수
        System.out.println(String.valueOf(0b10)); //2진수
        System.out.println(String.valueOf(true)); // 문자열로 변환
        
        StringJoiner sj = new StringJoiner("/", "[", "]"); //문자열 구분자 붙이기
        for(String s: arr){
            sj.add(s);
        }
        System.out.println(sj.toString());
    }
}
