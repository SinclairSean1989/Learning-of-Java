
/**
请统计1-1000之间同时满足如下条件的数据有多少个：
对3整除余2
对5整除余3
对7整除余2
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
