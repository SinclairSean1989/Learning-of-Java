/** ���Լ�ʵ���������������Ľ���
*/
class exchange{
  public static void main(String args[]){
    int a =33;
    int b =28;
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
    System.out.println("a ="+a);
    System.out.println("b ="+b);
  }
}
