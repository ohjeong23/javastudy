package pkg01_try_catch;

public class MainClass {
  
  
public static void method1() {
      
  // 예외 처리가 발생하는 상황
  
  
  String userInput = "12.3";
  
  int number = Integer.parseInt(userInput);
  System.out.println(number);
  
  
  
    }
  
public static void method2() {

  
  //예외 처리 : try - catch
  
  try {
    
    String userInput ="12.3";
    
    int number = Integer.parseInt(userInput);//예외발생되면 catch로 던짐
    System.out.println(number);
    
  } catch(NumberFormatException e) {//try 에서 발생한 예외를 잡아주는 것. 자동으로 예외를 던지면 catch가 잡는다.
    
    
    System.out.println("정수만 입력하세요");
    
    
  }
  
}

public static void method3() {

  String[] userInputs = {"10","20","1.5","2.5","30"};
  
  for(int i =0;i<userInputs.length;i++) {
    
    try {
      
      int number = Integer.parseInt(userInputs[i]);
      
      System.out.println(number);
    
    } catch(NumberFormatException e) {
     
      System.out.println(userInputs[i]+"정수가 아닙니다.");
      
    }
    
  }
 
}

public static void method4() {

  //다중 catch 블록
  
  String[] userInputs = {"10","20","15","25","30"};

  try {
    for(int i = 0; i<6;i++) {
      int number = Integer.parseInt(userInputs[i]);
      System.out.println(number);
    }
    // 둘다  부모인 runtime이 받아서 런타임이 실행됨
    // 순서를 바꿔 부모를 마지막에 놓으면 실행이 됨. 자식들이 부모에 저장되는걸 막을 수 있다. 상속 관계를 이해하고 순서를 정해야함.
    // 다중 catch 는 부모 자식간에만 부모를 밑으로 자식을 위로 놓고 써야함
  
  }catch(ArrayIndexOutOfBoundsException e) {
    System.out.println("사용할 수 없는 인덱스가 사용되었습니다.");
    }catch(RuntimeException e) {
    System.out.println("정수만 처리할 수 있습니다.");
  }
  //다중 catch는 상속관계를 이해하고 만들어야한다.
  
}





public static void main(String[] args) {
  
    method4();
    

  }

}
