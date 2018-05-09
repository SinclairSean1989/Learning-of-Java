/**
键盘录入三个数据，返回三个数中的最大值
*/
import java.util.Scanner;
class method1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int m = max(a,b,c);
    System.out.println("the maximum number is:"+m);
  }
  public static int max(int a,int b,int c){
    int m;
    m=(a>b)?a:b;
    m=(m>c)?m:c;
    return m;
  }
}
