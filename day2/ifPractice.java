/**键盘录入两个数据，并对这两个数据求和，输出其结果
*/
import java.util.Scanner;
class ifPractice{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("please input the month:");
    int x = sc.nextInt();
    int y = 0;
    if (x>=1 && x<=3){
      y= 1;
    }
    else if (x>=4 && x<=6){
           y= 2;
    }
         else if(x>=7 && x<= 9){
                y= 3;
         }
              else if(x>=10 && x<= 12){
                      y = 4;
              }
    if (y != 0){
    System.out.println("the quarter is:"+y);
    }
    else{
      System.out.println("input the wrong number");
    }
  }
}
