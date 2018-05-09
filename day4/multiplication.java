/**
在控制台输出九九乘法表。
*/
class multiplication{
  public static void main(String args[]){
    int i,j;
    for( i=1; i<=9;i++){
      for (j=i;j<=9;j++){
        System.out.print(i+"*"+j+" = "+i*j+";");
      }
      System.out.println();
    }
  }
}
