package pkg03_extends;

public class MainClass {

  public static void main(String[] args) {

    
    Elec elec = new SmartPhone();
    elec.powerOn();
    ((SmartPhone) elec).game();
    ((SmartPhone) elec).call();
    System.out.println();
    
    Computer computer = new SmartPhone();
    computer.powerOn();
    computer.game(); 
    ((SmartPhone) computer).call();
    System.out.println();
    
    Phone phone= new SmartPhone();
    phone.call();
    ((SmartPhone) phone).powerOn();
    ((SmartPhone) phone).game();
    System.out.println();
    
    SmartPhone smartPhone = new SmartPhone()
;
    smartPhone.powerOn();
    smartPhone.game();
    smartPhone.call();
    //인터페이스는 공통기능만 구현 
    //인터페이스에
    
    
    
    
    /*
    A a = new B()

        a.aa()
        a.bb
        ((B)a).cc();
    
    interface A 
    void aa,bb
     
    class B implements A 
    aa,bb,cc
  */
  }

}
