package pkg01_lambda_expr;

public class MainClass {

  public static void main(String[] args) {

    /*interface A {
     * void method();}
     * A a = new A(){
     * 
     * 메소드가 하나만 있다면 밑에꺼 안쓰기도 함
     * @override
     * void method(){}};  
     */
 
    GasStation station = new GasStation();
    station.setTotalOil(1000);
    station.setChargePerLiter(1500);
    
    
    station.sellOil("모닝",50);
    station.sellOil("소나타",100);
    
    System.out.println("total : "+station.getTotalOil());
    System.out.println("earning : "+station.getEarning());
    
    
    
  }

}
