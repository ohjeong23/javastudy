package pkg06_downcasting;

public class MainClass {

  public static void main(String[] args) {

    /*
     * 다운 캐스팅
     * 1.(업캐스팅 된)부모 타입의 객체를 자식 타입으로 바꿀 수 잇다.
     * 2.강제로 변환해야 한다.
     * 3.잘못된 캐스팅을 방지하기 위해서 instanceof 연산자를 사용할 수 있다.
     */
    //업 캐스팅 된 부모 타입의 자식 객체
    Computer computer = new Tablet(); // table의 객체를 못부르는게 문제
    
    //Tablet 타입으로 변환
   if(computer instanceof Tablet) {
     ((Tablet)computer).screenTouch();
     ((Tablet)computer).portable();
  }
   // 잘못된 다운캐스팅 타입변환 (wearable 타입으로 변환)-ClassCastExcption 예외 발생
   ((SmartWatch) computer).wearable();
   
   
   
   
   
  }

}
