package pkg07_constructor;

public class MainClass {

  /*
   * 생성자
   * 1.constructor
   * 2.객체를 생성할 때 동작하는 메소드이다.
   * 3.new 키워드와 함께 사용된다.
   * 4. 특징
   *   1) 생성자는 클래스와 이름이 같다.
   *   2) 객체(또는 클래스)를 이용해서 호출하지 않는다.
   *   3) 반환의 개념 자체가 없다.
   *   4) 매개변수(parameter)처리는 일반 메소드와 동일하다.= 생성자 오버로딩이 가능,여러개 만들 수 있음.
   *   메소드 이름은 같은데 매개변수가 다름 = 오버로딩
   *   
   */
  
  /*
   * 디폴트 생성자
   * 1.생성자가 없는 클래스는 자동으로 디폴트 생성자가 사용된다.- 지금까지 모든 경우
   * 2.매개변수가 없고 본문에 실행 코드가 없는 형식이다. 텅 비어서 자동으로 생성됨
   * Computer(){
   * 
   * }
   */
  
  
  
  public static void main(String[] args) {
    
    //Computer 객체 선언 및 생성
                           //constructor 객체를 만드는 생성자(),앞에 new 생성자,메모리 공간 할당 
    Computer computer1 = new Computer();// ***** (여기서 )디폴트 생성자 호출. 자동으로 사용
    computer1.develop();
    computer1.danggeun();
             //메소드()
    
    Computer computer2 = new Computer("gram",200);
                                      //gram 200 줌 보냄   인자값 전달  
    computer2.develop();
    computer2.danggeun();
    
    //호출 :인자 주는곳 매개 변수 주는곳에서 받아와 호출  
    
    //computer3 객체 선언 및 생성 (model,price,calculator 알아서)
    //delvelop(),danggeun(),calculator의 add()호출
    
    Computer computer3 = new Computer("sam",500,new Calculator());
    //Calculator _calculator = new Calculator()
    computer3.develop();
    computer3.danggeun();
    computer3.calculator.add();
    computer3.calculator.add(1);
    computer3.calculator.add(1,2);
    computer3.calculator.add(1,2,3);
    // 객체 필드 
  }

}
