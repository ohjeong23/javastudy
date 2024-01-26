package pkg05_Function;

import java.util.function.Function;

public class MainClass {
  /*
   * java.util.function.Function
   * 1.형식
   *   public interface Function<T,R> {//전달 반환 둘다 있음 
   *   R apply(T t);t 헌집 줄게 r 새집다오
   *   Function<t,r>r이 반환  t 가 파라미터
   *   
   *   }
   *   
   *   2.파라미터 0, 반환 0 형식의 apply() 메소드를 지원하는 함수형 인터페이스이다.
   */
  
  public static void method1() {
    
    Function<String, String> function = (name) -> name + "님";
     System.out.println(function.apply("tom"));
    
    
  }
  
  public static void method2(Function<String, String> function) {
    
    System.out.println(function.apply("tom"));
    
    
    
  }
 
 
  public static void main(String[] args) {
    
    method1();
    method2((name)-> name + "님");
    
    
    
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

}
