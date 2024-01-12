package pkg07_constructor;

public class Computer {
  
  //field
  String model;//null // 여기서 grma 200을 밑에서 받음 모델은 모델
  int price;//0
  Calculator calculator;
  //constructor
  
  Computer(){
    System.out.println("Computer()");//*****여기로 호출
    
  }
  Computer(String _model,int _price){
    //grma 200 받음  매개변수 받음 
    model = _model;
    price = _price;
  }
  Computer(String _model,int _price, Calculator _calculator){
    model = _model;
    price =_price;
    calculator = _calculator;
  }
  
  //method
  void develop() {
    System.out.println(model+"이용해서 개발중");
  }
  
  void danggeun() {
    System.out.println(price/ 100 *60 +"원에 쿨거래");
  }
  
 
  

}
