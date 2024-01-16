package pkg06_throws;

public class MainClass {

  public static void main(String[] args) {

    int a = 5;
    int b = 0;
    
    try {
    Calculator calculator = new Calculator();
    
    calculator.addition(a, b);
    calculator.subtraction(a, b);
    calculator.multiplication(a, b);
    calculator.division(a, b); // ArithemeticEx...호출한 곳에서 예외 처리코드가 추가되어야 한다.
    } catch (ArithmeticException e) {
      System.out.println("산술 연산 예외가 발생했습니다.");
    }
  
  
  }

}
