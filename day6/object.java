/*定义一个类MyMath,提供基本的加减乘除功能，然后进行测试。*/
import java.util.Scanner;
class MyMath{
  int a=0,b=0;
  int rt =0;
  public void plus(){//*无返回值的方法定义时“（）”不能忘记
    rt=a+b;
    System.out.println(a+"+"+b+"="+rt);
  }
  public void minus(){
    rt=a-b;
    System.out.println(a+"-"+b+"="+rt);
  }
  public void multiply(){
    rt=a*b;
    System.out.println(a+"*"+b+"="+rt);
  }
  public void divide(){
    rt=a/b;
    System.out.println(a+"/"+b+"="+rt);
  }
}
class object{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  MyMath ma = new MyMath();//*定义对象时不能忘记括号
  ma.a = a;
  ma.b = b;
  ma.plus();//*使用无参数方法时不能忘记括号
  ma.minus();
  ma.multiply();
  ma.divide();
  }
}
