package pkg03_Supplier;

import java.util.function.Supplier;

public class MainClass {

  
  /*//제네릭 타입 입력받은 타입을 계속 씀
   * java.util.function.Supplier
   * 1.형식  
   *     public interface Supplier<T> {
   *     T get();//공급자 
   *     
   *     }
   *     
   * 2. 파라미터 x , 반환 0 형식의 get() 메소드를 지원하는 함수형 인터페이스이다.
   *     
   */
  
  
  public static void method1() {
    //파라 x
    Supplier<String>supplier = () -> "hello world";
    System.out.println(supplier.get());
  }
  public static void method2(Supplier<String> supplier) {
    System.out.println(supplier.get());
  }
  
  //호출할때마다 1~10 사이 난수를 출력하는 method3
  public static void method3(Supplier<Integer> supplier) {
    
  System.out.println(supplier.get());  
    
    
  }
  
  
  public static void main(String[] args) {
    
  
  //method1();
    
  //Supplier<String> supplier = ()-> "hello world";
  //method2(supplier);
  //같은 코드이다. method2(()->"hello world");
  
    method3(() -> (int)(Math.random() *10+1));
    
  }
}
