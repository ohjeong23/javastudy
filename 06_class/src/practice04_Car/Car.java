package practice04_Car;

public class Car {
  
  //field
  
  private Driver driver;
  private int currSpeed;
  private int fuel;
//static 처리를해서 인스턴스 마다 정하지 않고 가져와서 사용

  public final static int MAX_SPEED = 100;
  
  //constructor
 
  public Car() {
    // TODO Auto-generated constructor stub
  }

  
  public Car(Driver driver, int currSpeed, int fuel) {
    super();
    this.driver = driver;
    this.currSpeed = currSpeed;
    this.fuel = fuel;
  }

 //getMax_SPEED로 안해도됨 Car.MAX_SPEED로 호출,static 은 클래스로 호출해주기 스택틱 답게
  
  public Driver getDriver() {
    return driver;
  }


  public void setDriver(Driver driver) {
    this.driver = driver;
  }


  public int getCurrSpeed() {
    return currSpeed;
  }


  public void setCurrSpeed(int currSpeed) {
    this.currSpeed = currSpeed;
  }


  public int getFuel() {
    return fuel;
  }


  public void setFuel(int fuel) {
    this.fuel = fuel;
  }
  
  
  
  
  //     반환타입
  public void enginStart() {
    
    if(driver == null || fuel == 0) {
      System.out.println("시동 실패");
    }else {
      System.out.println("시동 성공");
    }
  }
  
  //1초당 10씩 속도가 증가하는 accelerator(n : bestDriver는 10, 아니면 5)
  //1초당 1씩 연료가 줄어드는 accelerator
  
  public void accelerator(int pushTime) {
    
    if(currSpeed == MAX_SPEED) {
      System.out.println("이미 최고 속도입니다.");
      return;
    }
    
    if(fuel == 0) {
      System.out.println("연료가 없습니다.");
      return;
    }
    
    if(pushTime <= 0) {
      System.out.println("accelerator를 잘 밟으세요.");
      return;
    }
    
    int n =driver.isBestDriver() ? 10:5;    
    
    currSpeed += (pushTime*n);
    /*if(currSpeed > MAX_SPEED) {
      currSpeed = MAX_SPEED;
    }*/
    currSpeed = Math.min(currSpeed, MAX_SPEED);
    
    fuel -= pushTime;
    /*if(fuel == 0) {
      System.out.println("연료가 없습니다.");
    }*/
    fuel = Math.max(fuel, 0);
    System.out.println("현재 연료량 :"+fuel +", 현재 속도:"+ currSpeed);
    
   
    
  }
  
  //1 초당 10씩 속도가 줄어드는 brake
  public void brake(int pushTime) {
    
    if(currSpeed == 0) {
      System.out.println("이미 멈춰있습니다.");
    }
    if(pushTime <=0) {
      System.out.println("brake 를 잘 밟으세요.");
      return;
    }
    
    currSpeed -= (pushTime * 10);
    currSpeed = Math.max(currSpeed,0);
    System.out.println("현재 연료량 :"+fuel +", 현재 속도:"+ currSpeed);

  }                         
  
 
  public void brak(int pushTime) {
    if(currSpeed==0) {
      System.out.println();
    }
  }




}
