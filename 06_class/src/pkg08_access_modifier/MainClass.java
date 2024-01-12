package pkg08_access_modifier;

public class MainClass {

 
  //private 클래스 안에서만 ,field
  //default 패키지 안에서만 //거의 안씀
  //protected 패키지, 상속까지
  //public 모두 가능
  //private, public 두개를 주로 씀 나머지 거의 안씀
  //construct 메소드 public 
  
  

  public static void main(String[] args) {
   
    // computer 객체 선언 및 생성
    Computer computer = new Computer("galaxybook",400,new Calculator()) ;
    //퍼블릭 영역의 메소드를 불러서 필드로 가는 방법을 씀
    //System.out.println(computer.model);
    //computer.develop(); // 다른 클래스라고 못보는건 아닌데 직접적으로 접근하는건 안됨.밑에 메소드를 통해서 가는건 가능  간접접근0
   
    
    
    //필드로 값을 전달하는 메소드
    computer.setModel("gram");
    computer.setPrice(200);
    computer.setCalculator(new Calculator());
    
    
    //필드값을 가져오는 메소드
    System.out.println(computer.getModel());
    System.out.println(computer.getPrice());
    
    
    
    //calculator의 add( )호출하기
    
    computer.getCalculator().add();
    computer.getCalculator().add(1);
    computer.getCalculator().add(1,2);
    computer.getCalculator().add(1,2,3);
    
    
    
    
    
  }
  
  
  

}