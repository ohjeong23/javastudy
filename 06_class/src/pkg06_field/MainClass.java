package pkg06_field;

public class MainClass {

  public static void main(String[] args) {
    
    //Calculator 객체 선언 및 생성
    
    Calculator calculator = new Calculator();
    
    //Calcaulator 객체의 메소드 호출
    //클래스에 선언한 변수 = 필드 ,초기화 필요없음 자동 ,모든 메소드 멤버들이 사용할 수 있다.
    calculator.plus(10);
    calculator.plus(20);
    calculator.minus(5);
    calculator.result();
  }

}
