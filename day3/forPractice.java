
/**
��ͳ��1-1000֮��ͬʱ�������������������ж��ٸ���
��3������2
��5������3
��7������2
*/


class forPractice{
  public static void main(String args[]){
    int i;
    int n =0;
    for (i=1;i<=1000;i++){
      if ( (i%3 ==2) && (i%5 ==3) && (i%7 == 2)){
        System.out.println(i);
        n++;
      }
    }
    System.out.println("toal:"+n);
  }
}
