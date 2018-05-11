/** 打印杨辉三角形(行数可以键盘录入)*/
import java.util.Scanner;
class array{
  public static void main(String args[]){
    Scanner Sc = new Scanner(System.in);
    System.out.print("please input a number:");
    int n = Sc.nextInt();
    if(n>=1){
      yanghui(n);
    }
  }
  public static void yanghui(int n){
    int[][] yh=new int[n+1][n+1];//***定义数组长度要比用到的行列号+1***
    yh[0][0] =1;
    for(int i=1;i<=n;i++){

      for (int k=0;k<n-i;k++){
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++){
        yh[i][j]=yh[i-1][j-1]+yh[i-1][j];
        System.out.print(yh[i][j]+" ");
      }
      System.out.println();
    }
    return;
  }
}
