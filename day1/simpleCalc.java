/** �򵥼��� */
/*��Ŀ��С��������ÿ�����2.5ԪǮ������������������ǣ�ÿ����һ���Ǵ�Ǯ��
��5�����5�ı����Ļ��������Ứȥ6ԪǮ�����ʣ����������죬С���ſ���
�浽100ԪǮ��
*/
class simpleCalc{
 public static void main(String args[]){
    double money=0;
    int day=0;
   while (money<100){
    day++;
    if (day%5==0){
      money = money -6;
    }
    else {money = money +2.5;}
   }
   System.out.println("days��"+day);
 }
}
/*����
1.��������":"���ţ�
2.����û�����ó�ʼֵ��
3.�ô�һ���������֡�
*/
