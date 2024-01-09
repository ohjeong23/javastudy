package pkg03_return;

public class MainClass {

  public static void main(String[] args) {
    
    //Calculator 타입의 calculator 객체 선언 및 생성
    Calculator calculator = new Calculator();
    
    // 잘못된 호출이라고 볼 수 있음
    calculator.method1();
    //호출 후 반환값으로 변함
    //반환값의 호출 예시
    System.out.println(calculator.method1());//반환값 확인 코드
    //반환 값이 있을때는 메소드에 호출만 있어서는 안됨. 호출과 +a 가 있어야함.
    
    System.out.println(calculator.method1() == 10 ? "십이다.":"십이 아니다." );
    int a = calculator.method1();
    System.out.println(a);
    
    
    //int[] 메소드로부터 반환 받기
    int[] arr = calculator.method2();
    for(int n : arr) {
     
      System.out.println(n);
    }
    for(int n :calculator.method2()) {
      System.out.println(n);
    }
    
    //Adder 객체 반환 받기
    System.out.println(calculator.method3().add(1,2,3));
    //1,2,3dl add로 가서 params total 더해지고 다시 와서 반환됨.
    //메소드 체이닝 호출호출
    //하나씩 뭘 받아오는지 확인 

}}
//인자 인수 (매개변수 파라미터)를 가지고 메소드가 처리를 함
//