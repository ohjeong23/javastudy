package pkg02_parameter;

public class Calculator {

  /*
   * 메소드의 구성
   * 1.반환타임 : 메소드 실행 결과 값의 타입
   * 2.메소드명
   * 3.매개변수 : parameter라고 함. 메소드로 전달되는 값(인수,인자,argument)을 저장하는 변수
   */
  
  /**
   * @param 파라미터
   * @return 반환값
   */
  
  void method1() {
    System.out.println("method1");
  }
  
  void method2(int a) {
    System.out.println("method2:"+a);
    
  }
  void method3(String s) {
    System.out.println("method3:"+s);
  }
  //받음
  
  void method4(double a, double b) {
    System.out.println("method4:"+a+" "+b);
  }
  //받음,만듬. 둘이 세트 
  
  void method5(int a) {
          method5_2(a);
    }
  //얘가 또 받음
  void method5_2(int a) {
    System.out.println("method5 :"+a);
  }
  
  void method6(int... params) {// params는 사실 배열임.
    
    System.out.println("method6");
    for(int i =0;i<params.length;i++) {
      System.out.print(params[i]);
    }
    System.out.println();
    
  }
  
  
  void method7(int[] arr) {
    System.out.println("method7");
    for(int a : arr ) {
      System.out.println(a);
      
    }
  }
  //객체 매개변수,받는 쪽
  //주는쪽과 받는 쪽을 한 문장으로 만들어서 
  //말이 되면 되는것
  //adder 객체는 Adder클래스의 객체를 호출가능
  //add 멤버 호출가능
  //주면 받아서 해당 객체의 멤버를 호출받음
  
  void method8(Adder adder) {
    
    adder.add(1,2,3);
    System.out.println();
  }
  
  
  
  
  
  
  
}
