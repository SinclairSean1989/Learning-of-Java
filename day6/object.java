/*����һ����MyMath,�ṩ�����ļӼ��˳����ܣ�Ȼ����в��ԡ�*/
import java.util.Scanner;
class MyMath{
  int a=0,b=0;
  int rt =0;
  public void plus(){//*�޷���ֵ�ķ�������ʱ����������������
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
  MyMath ma = new MyMath();//*�������ʱ������������
  ma.a = a;
  ma.b = b;
  ma.plus();//*ʹ���޲�������ʱ������������
  ma.minus();
  ma.multiply();
  ma.divide();
  }
}
