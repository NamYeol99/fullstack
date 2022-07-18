package object;

public class Exercise6_1 {
    public static void main(String[] args) {
        //6-1
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);
        String str = s.info();
        System.out.println(str);
        //6-3
        System.out.println(s.getName());
        System.out.println(s.getTotal());
        System.out.println(s.getAverage());
        
    }
}
class Student {
    private String name; // 학생이름

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int ban; // 반
    private int no; // 번호
    private int kor; // 국어점수
    private int eng; // 영어점수
    private int math; // 수학점수
    public Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    public Student(){

    }
    public int getTotal(){
        return kor+eng+math;
    }
    public float getAverage(){
        return Math.round(getTotal()/3f*10)/10.0f;
    }

    public String info(){ 
        int total = kor+eng+math;
        // float avg = (int)(total/3f *10+ 0.5f) /10.0f;
        float avg = Math.round(total/3f*10)/10.0f;
        return name+","+ban+","+no+","+kor+","+eng+","+math+","+total+","+avg;
        
    }
}

