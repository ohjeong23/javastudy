package pkg08_access_modifier;

public class Calculator {

//메소드 다른 클래스에서도 누구나 사용할 수 있는 메소드 
 public void add(int... params) {
    
    int total = 0;
    
    if(params.length ==0 ) {
      System.out.println("합:" + total);
      return;
    }
    if(params.length == 1) {
      total =params[0];
      System.out.println("합:"+ total);
      return;
 }
    
    System.out.print(params[0]);
    
    total = params[0];
    for(int i =1; i <params.length;i++) {
      total += params[i];
      System.out.print("+"+params[i]);
      
    }
    System.out.println("="+total);
    
  }
  
}
