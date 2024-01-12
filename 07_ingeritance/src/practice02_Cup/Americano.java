package practice02_Cup;

public class Americano extends Coffee{ //자식
  @Override
  public void whoami() {
    System.out.println("아메리카노");
  }// 커피 타입을 사용하기 위해서.
  //호출은 커피 후엠아이를 부르지만 오버라이드 된게 있다면 알아서 바꿔서 실행됨
  // 바꿔서 실행이 됨 아메리카노나 커피라떼의 후엠아이가 됨 
  
  
  
  
  

}
