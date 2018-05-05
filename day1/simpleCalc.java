/** 简单计算 */
/*题目；小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的
第5天或者5的倍数的话，她都会花去6元钱，请问，经过多少天，小芳才可以
存到100元钱。
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
   System.out.println("days："+day);
 }
}
/*出错：
1.少了两个":"符号；
2.变量没有设置初始值；
3.用错一个变量名字。
*/
