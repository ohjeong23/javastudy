package practice02_Cup;

public class MainClass {

  public static void main(String[] args) {
   // Coffee coffee = new Americano();// <- 아메리카노 컴파일때는 없다고 생각. 커피의 후엠아이를 호출
    //coffee.whoami(); //커피의 후엠아이를 호출, 그러나 아메리카노의 후엠아이 실행
  
    Cup cup1 = new Cup();
    cup1.fill(new Americano());

    
    Cup cup2 = new Cup();
    cup2.fill(new CafeLatte());
    
    Carrier carrier =new Carrier(2);
    carrier.addCup(cup1);
    carrier.addCup(cup2);

    carrier.whoami();
    
  }

}
