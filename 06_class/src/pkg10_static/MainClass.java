package pkg10_static;

/*
 * instance는 객체(object)다. 메모리에 공간을 할당받은 객체 실존 객체 
 * 인스턴드 마다 값이 다른애들을 인스턴스 멤버라 부름 모델,프라이스는 인스턴스 멤버
 * class member 1:m instance(object) 
 *static은 클래스 멤버를 만들 때 씀 static ㅊ리하는 애들은 클래스 멤버가 됨 객체로 호출하지 않고 클래스로 호출
 * 메소드나 필드를 클래스로 호출함. 스택틱
 * 
 */


public class MainClass {

  public static void main(String[] args) {
    
    // 클래스 멤버 호출 : 클래스.멤버
    System.out.println(Calculator.maker);
    
    int num = Integer.parseInt("100");
    System.out.println(num);
    
    Calculator.add(1,3);

  }

}
