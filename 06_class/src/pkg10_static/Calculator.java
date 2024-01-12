package pkg10_static;


/*
 * 메모리 공간,할당 과장
 * 
 *             여기다 저장                     만들어서
 * 클래스 영역(메소드 영역) -> 스택 영역 -> 힙 영역
 * 클래스 로드                   변수          배열,인스턴스
 */




/*
 * 클래스 멤버
 * 1.클래스 영역에 저장되는 멤버이다.
 * 2.인스턴스의 생성이 없어도 접근이 가능하다. static
 * 3.클래스 메소드 필드(static 처리한 메소드는 클래스안에 있음)  클래스 멤버만 호출할 수있다.
 * 인스턴스 멤버는 호출할 수 없다. 없으니까 호출 불가능
 * 4.호출 방법
 *  1)클래스.멤버 - 추천
 *  2)인스턴스.멤버 -가능하지만 비추천
 *  
 */

/*
 * static 붙어있는 필드 메소드 는 클래스로 호출 
 * 
 */







public class Calculator {

  //상수처럼 처리 
  public final static String maker = "samsung";
  
  
  //클래스 메소드
  public static void add(int a , int b) {
    System.out.println(a+"+"+b+"="+(a+b));
    
    
  }
  
  
  
  
  
  
}
