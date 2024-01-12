package pkg09_this;
//필드 가져올때 쓰는거 this.필드
public class Computer {
  
  String model;
  int price;
  
  
  //this() : 다른 생성자를 의미한다. 생성자를 호출하는 것
  //this.멤버 : 멤버(필드,메소드)를 호출하는 것
  //생성자
  Computer(){
    this(null,0);// new Computer()
    
    
  }
  
  Computer(String model){//new Computer("grma")
   this(model,0);
    
  }
  Computer(String model, int price){//new Comptuer("gram".200)
    this.model = model;//멤버 this.model 아닌놈 model
    this.price = price;
  }
  
  
  
  
  
  
  
  void showThis(){//computer 가 this
    System.out.println(this); //this : 현재 객체 (showthis() 메소드를 호출한 객체)를 의미한다.
  }//
  
  void showModel() {
    //컴퓨터 객체를 의미하는 키워드. 컴퓨터 클래스 내에서 사용
    //this = Computer 객체. 해당 클래스안의 객체 
    
    System.out.println(this.model);
    
  }
  
  //source 메뉴를 눌러서 get set 만들어주는거 있고 constructor using field
}
