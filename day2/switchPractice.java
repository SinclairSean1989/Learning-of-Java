import java.util.Scanner;
class switchPractice{
  public static void main(String args[]){
    String a = "a";
    String b = "b";
    String c = "c";
    String d = "d";
    System.out.println("Sorry for that!");
    System.out.println("input a or b or c or d");
    Scanner sc = new Scanner(System.in);
    String i = sc.nextLine();
    switch (i) {
      case "a" :
        System.out.println("It's OK!");
        break;
      case "b" :
        System.out.println("Fine!");
        break;
      case "c" :
        System.out.println("You're welcome!");
        break;
      case "d" :
        System.out.println("No problem!");
        break;
      default :
        System.out.println("input the wrong anser!");
    }
  }
}
