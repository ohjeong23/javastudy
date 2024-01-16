package practice02_BankAccount;

public class BankAccount {

  // field
  private String accNo;
  private long balance;
  
  // constructor
  public BankAccount() {
    // TODO Auto-generated constructor stub
  }

  public BankAccount(String accNo, long balance) {
    super();
    this.accNo = accNo;
    this.balance = balance;
  }

  // method
  public String getAccNo() {
    return accNo;
  }

  public void setAccNo(String accNo) {
    this.accNo = accNo;
  }

  public long getBalance() {
    return balance;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }
   // 트랜스포랑 메인에서 호출한 애한테 보냄 
  public void deposit(long money) throws RuntimeException {
      
      if(money <= 0) {
        throw new RuntimeException(money + "원 입금 불가");
      }
      
      balance += money;
      
    
  }
  
  public long withdrawal(long money) throws RuntimeException {
    //try catch 를 다른 곳으로 보냄 throws를 이용해서 발생된 예외를 바로 던져버림
    //호출한 곳에서 해결하도록 함
      if(money <= 0) {
        throw new RuntimeException(money + "원 출금 불가");
      }
      if(money > balance) {
        throw new RuntimeException("잔액 부족");
      }
      
      balance -= money;
      return money;
    
  }
  
  public void transfer(BankAccount account, long money) throws RuntimeException{
    //뭘 하진 않았지만 받았으니까 호출한 곳으로 보내버림
    // 내 통장에서 출금 -> 출금된 금액이 반환 -> 네 통장에 입금
    
    // 내 통장에서 출금
    // long a = withdrawal(money);
    
    // 네 통장에 입금
    // account.deposit(a);
    
    account.deposit(withdrawal(money));
    
  }  //트랜스포는 받은거 다 호출한 곳으로 보내버림 디파짓과 위드로우에서 받았는데
  
}