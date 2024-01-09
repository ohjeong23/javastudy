package pkg03_return;

public class Adder {
  //Adder가 가지고 있는  add 객체

 int add(int... params) {
    
    int total = 0;
    for(int param : params) {
      total +=param;
    }
    return total;
  }
}
