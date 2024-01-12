package practice05_Backery;

public class Bakery {

  //field
  private int count;//빵 개수
  public final static int PRICE = 500;//빵 가격\
  private int money;//돈 
  
  //constructor
  
  public Bakery() {
    
  }

  public Bakery(int count, int money) {
    super();
    this.count = count;
    this.money = money;
  }

  //method
  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }
  
  
  
  //판매
  
  //전달 받는 인자 : 돈, 구매할 빵 개수
  //되돌려 줄 반환 : 잔돈, 구매한 빵 개수 -> 객체화 시켜서 잔돈,빵개수 한번에 다 반환하자.
  //  -> BreadChange 객체를 이용해서 반환
         //반환
  public BreadChange sell(int money, int count) {
    
    // 재료소진 빵없음, 잔돈부족,
    
    if(this.count < count) {
      System.out.println("빵이 부족하다.");
      return null;
    }
    
    // 잔돈이 부족하다.
    
    if(this.money < money - count*PRICE ) {
      System.out.println("잔돈이 부족하다.");
      return null;
    }
    
    // 고객이 낸 돈이 빵 가격보다 부족하다.
    if(money < count*PRICE) {
      System.out.println("돈이 부족하다.");
      return null;
    }
    //판매 처리하기
    this.money += count *PRICE;
    this.count -= count;
    
    //반환
    
  
    return new BreadChange(count,money - count*PRICE);
    
  }
  
  
  
  
  
}
