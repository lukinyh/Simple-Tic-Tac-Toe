// You can experiment here, it won’t be checked

public class Task {
  public static void main(String[] args) {
    String str1;
    String str2 = "123";

    if (str2.equals(str1 = "123")) { // #1
      str2 = null;                 // #2
    }

    str1 = str2;                     // #3
    str2 = str1;                     // #4

    System.out.println(str2);        // #5
  }
}
