package pkg01_extends;

public class Car {
  
  
  private String model; // private 은 자식도 못봄 
  protected String maker; //protected 자식 클래스는 허용 오픈한다
  
  
  public void forward() {
    
    System.out.println("앞으로");
  }
  
  public void reverse() {
    
    System.out.println("뒤로");
  }

  public void stop() {
    
    System.out.println("멈춤");
    
  }
}
