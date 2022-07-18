package array;

public class Exercise5_6 {
  public static void main(String[] args) {
    String[] words = {"television", "computer", "mouse", "phone"};

    for (int i = 0; i < words.length; i++) {
      char[] question = words[i].toCharArray();
      int rand = (int)(Math.random()*question.length);
      char tmp = question[i];
      question[i] = question[rand];
      question[rand] = tmp;
      System.out.println(question);
    }
  }
}
