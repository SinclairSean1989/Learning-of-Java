/**键盘录入行数和列数，输出对应的星形*/
import java.util.Scanner;
class method2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    stars(x,y);
  }
  public static void stars(int x,int y){
    for(int i=1;i<=x;i++){
      for(int j=1;j<=y;j++){
        System.out.print("*");
      }
      System.out.println();
    }

  }
}
