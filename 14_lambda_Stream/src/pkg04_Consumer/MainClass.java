package pkg04_Consumer;

import java.util.function.Consumer;

public class MainClass {

  /*
   * java.util.function.consumer
   * 1.형식
   *   public interface Consumer<t> {
   *   void accept(T t);
   *   }
   *   
   *   2.파라미터 0, 반환 x 형식의 accept() 메소드를 지원하는 함수형 인터페이스이다.
   */

  public static void method1() {
    
    Consumer<String> consumer =  (name) -> System.out.println(name +"님"); //변수이름 적음
    consumer.accept("tom");
    
  }
  
  public static void method2(Consumer<String> consumer) { //람다식을 전달해라 ,ㅊㅊ
    
    consumer.accept("tom");

  }
  
  
   public static void method3() {
     
     
     
     
   }
   
   
   
  public static void method4() {
    
    
    
    
    
  }
  
  
  
  public static void main(String[] args) {
    
    method1();
    method2((name) -> System.out.println(name + "님") );
    method3();
   method4(); 
    
  }
  
  
  
}
