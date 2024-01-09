package pkg04_overloading;

public class Calculator {

  
  void add(Adder adder,int... params) {
    
    
    /*
     * 메소드 오버로딩
     * 1.동일한 클래스에 같은 이름의 메소드가 두개 이상 존재하는 것을 의미한다.
     * 2.메소드 오버로딩 규칙
     *    1)같은 이름의 메소드  2)다른 파라미터 (개수또는 타입)
     */
    
    
    
    
    
    //파라미터가 같으면  ㅣ되낟난 
    
    
    
    //adder.add(arr[]);// calcul에서 값을 받아온걸 Adder로 주고 리턴 반환 받아옴 a+b
    //실행후에 a+b
    System.out.println(adder.add(params));
  
  }
  
  void add(Adder adder, double... params) {
    System.out.println(adder.add(params));
  }
}
//파라미터가 다른경우에는 메소드를 다시 만듬 메소드 오버로딩
