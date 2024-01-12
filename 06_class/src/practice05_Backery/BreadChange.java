package practice05_Backery;

public class BreadChange {
  
  //field
  
  private int bread; // 사서 고객에게 준 빵 개수
  private int change; // 고객이 준돈에서 잔돈 주기
  
  //constructor
  public BreadChange() {
    
  }

  
  public BreadChange(int bread, int change) {
    super();
    this.bread = bread;
    this.change = change;
  }

  //method
  
  public int getBread() {
    return bread;
  }

  public void setBread(int bread) {
    this.bread = bread;
  }

  public int getChange() {
    return change;
  }

  public void setChange(int change) {
    this.change = change;
  }
  
  
  
  

}
