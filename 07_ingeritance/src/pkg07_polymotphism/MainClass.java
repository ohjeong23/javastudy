package pkg07_polymotphism;

public class MainClass {
  
  public static void main(String[] args) {
    
    Tv tv = new Tv();
    Radio radio = new Radio();
    
    Person person = new Person();
    
    person.powerOn(tv);
    person.powerOn(radio);
    
    //부모타입을 먼저 만들고 클래스들의 공통 기능,타입을 가지고 있다.
    
   //하나의 타입으로 여러개를 만들때 부모를 준비하고 나머지를 만들기.
    //
    
    
    
  }

}
