import java.util.Scanner;
class boardScanner{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("please input number a: ");
    int a = sc.nextInt();
    System.out.print("please input number b: ");
    int b = sc.nextInt();
    System.out.println("a+b="+(a+b));
  }
}
