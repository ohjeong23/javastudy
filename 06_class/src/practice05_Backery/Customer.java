package practice05_Backery;

public class Customer {

  //field
  private int money;
  private int count;
  
  //constructor
  public Customer() {
    
  }


  public Customer(int money, int count) {
    super();
    this.money = money;
    this.count = count;
  }

//method
  
  public int getMoney() {
    return money;
  }


  public void setMoney(int money) {
    this.money = money;
  }


  public int getCount() {
    return count;
  }


  public void setCount(int count) {
    this.count = count;
  }
  
 
     //구매
  //인자값  : 구매할 가게, 구매할 빵 개수, 구매할 때 낼 돈
  //반환  : 없다 . 구매하면 끝 누구에게 주는건 아님 void
   public void buy(Bakery bakery, int count, int money) {
     
     // 가진 돈이 부족하다.
     if(this.money < money) {
       System.out.println("가진 돈이 부족합니다.");
       return;// void 반환이라 return;
     }
     
     // 구매 (곧 Bakery의 판매를 의미한다.)
     BreadChange breadChange = null;
     if(bakery != null) {
       breadChange = bakery.sell(money, count);
     }
     
    //빵을 파는 경우 3가지를 고려 안함 
   //bakery 가 null 이면 bakery.sell도 null
   
    
     // 구매 결과 처리
     if(breadChange != null) {
       this.count += breadChange.getBread();
       this.money += breadChange.getChange();
       this.money -= money;
     }
     
   }
   
 }










