package pkg01_extends;


// class 자식 extends 부모{ }   슈퍼 = 부모, 서브 = 자식 //거의 큰쪽이 부모 
// class 서브 extends 슈퍼{ }   

public class Ev extends Car{
  

  public void charge() {
    //System.out.println(model);
    //부모 private 가져다 못씀 접근 불가
    
    
    System.out.println(maker); // 부모의 protected 에는 접근 가능
    System.out.println("충전");
  }
  
 //Ev 가 사용할 수 있는 메소드는 4개 1개 자기꺼 부모한테 받은 3개
  
}
