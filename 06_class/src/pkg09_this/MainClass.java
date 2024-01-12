package pkg09_this;

public class MainClass {

  public static void main(String[] args) {
    
    Computer computer = new Computer(); //객체 Computer 객체의 참조값을 computer가 가짐
    
    System.out.println(computer); // this,computer 가 this
    computer.showThis();// 두개 같은 값 나옴
    System.out.println(computer.model);
    computer.showModel();//외부에서는 this는 Computer 객체 아님 main 객체
  }

}
