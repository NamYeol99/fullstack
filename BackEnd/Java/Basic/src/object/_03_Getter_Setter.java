package object;

public class _03_Getter_Setter {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(-100);
        System.out.println(p.getAge());
        

    }
}
class Person {
    private String name;
    private int age;
    private String mobile;
    private String gender;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if(age>0) this.age = age;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
