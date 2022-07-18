package javalang;

public class _03_StringBuffer {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.hashCode());
        System.out.println(System.identityHashCode(str));
        str = str + " World";
        System.out.println(str.hashCode());
        System.out.println(System.identityHashCode(str));
        System.out.println("============================================================");
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb.hashCode());
        System.out.println(System.identityHashCode(sb));
        System.out.println(sb.capacity()); //버퍼크기
        sb.append(" World~! I am your world~!"); // 문자열 마지막에 추가
        System.out.println(sb.capacity()); //버퍼크기
        System.out.println(sb.hashCode());
        System.out.println(System.identityHashCode(sb));
        System.out.println(sb.delete(0, 5)); //원본도 삭제됨
        System.out.println(sb.delete(0, 1)); //원본도 삭제됨
        System.out.println(sb.toString());
        System.out.println(sb.deleteCharAt(5)); //지정된 위치의 문자 제거
        System.out.println(sb.insert(0,"Hello ")); //지정된 위치에 문자 추가
        // System.out.println(sb.reverse()); //문자열 순서를 거꾸로 나열
        sb.setLength(11); // 지정된 길이로 문자열의 길이를 변경
        System.out.println(sb);
    }
}
