package pkg06_practice;

public class MainClass {

  public static void method1() {
    
    int second = 90;
    int m = second /90; //1  분 
    int s =  second / 3; //30 초
    System.out.println(m);
    System.out.println(s);
    
  }

  public static void method2() {
    
    // x와 y의 값을 교환하기
    int x = 10;
    int y = 20;
    int temp;
    
    temp = x;
    x =  y;
    y = temp;
    
    
    System.out.println(x);
    System.out.println(y);
    
  }
  
  public static void method3()
  {
    //점수가 90점대이면 true 아니면 false
    int score = 90 ;
    //90점 이상 그리고 100점 미만
    boolean result1 = score >= 90 && score < 100;
    System.out.println(result1);
    
    //10으로 나눈 몫이9인 수
    boolean result2 = (score/10) ==9;
    System.out.println(result2);
    
  }
  
  public static void method4()
  {
    
    int n=3;
    String result = n% 2 ==0 ? "짝수" :"홀수" ;
    System.out.println(result);
    
    //짝수/홀수 판단
    //짝수 : 2 로 나눈 나머지가 0인수
    //홀수 :2로 나눈 나머지가 1인 수 
    
  }
  
  
  
  public static void main(String[] args) {
  

    method4   ();
   
    
  
  }
 
}
