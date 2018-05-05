
/**
键盘录入两个数据，并对这两个数据求和，输出其结果;
键盘录入两个数据，并对这两个数据求和，输出其结果;
*/
import java.util.Scanner;
class boardScanner{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("please input number a: ");
    int a = sc.nextInt();
    System.out.print("please input number b: ");
    int b = sc.nextInt();
    System.out.println("a+b="+(a+b));
    int c = (a>b) ? a : b;
    System.out.println("the bigger number is : "+c);
  }
}
