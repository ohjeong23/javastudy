package pkg04_override;

// 메소드 오버라이드
//1. 자
//자식 클래스가 부모 클래스의 메소드를 다시 만드는 것 
//부모의 메소드를 자식이 가져다 쓰는게 맞지 않는경우에 씀
//자식이 다시 만들어 쓴다.
//2. @Override annotation 을 추가한다. 해야한다.
//3.똑같이 ( 반환 타입,메소드명,매개변수)만들어야 한다.


public class WhiteMix extends Kanu{

 
//문법의 체크를 위해서 씀 주석같은 느낌 안써도 되지만 쓰자.
  @Override //오버라이드한 메소드라고 JVM에게 알려준다.(부가적으로 다른 개발자에게도 알려준다.)
  public void color() {
    System.out.println("커피색");
  }
  //오버로딩 오버라이딩 
  
  
  

}
