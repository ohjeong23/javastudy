package pkg07_polymotphism;

public class Person {
  
  
  //Tv도 받아와서 키고 Radio도 받아와서 전원을 키려고 함
  public void powerOn(Elec elec) {//Eelc elec = new Tv() 또는 Elec elec = new Radio()
     //파라미터에 elec을 해놓으면 업캐스팅 가능
    //upcasting 부모 \
    
    
    //다운캐스팅으로 파워온 전자제품 호출하기 ->전자제품이 추가될때마다  코드의 추가가 필요하므로 추천하지 않는다.
    
    
    
    
    
    
    /*
    //elec.powerOn(); //부모가 poweron이라는게 없어서 호출 안됨
    if(elec instanceof Tv) {
      ((Tv) elec).powerOn();
      
    }else if(elec instanceof Radio) {
      ((Radio) elec).powerOn();
      */
    
    
    /*
     * 
     * 2.Elec에 powerOn() 메소드를 추가하고 Tv나 Radio가 오버라이드 하기.
     * 
     */
    elec.powerOn();
    
   
      
      
      
      
      
      
    }
    
    
    
    
    
    
  }


