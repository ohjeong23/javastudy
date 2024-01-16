package practice02_BankAccount;

public class MainClass {

  public static void main(String[] args) {
    
    //생성자
    BankAccount account1 = new BankAccount();
    
    //Setter 
    account1.setAccNo("01087654321");
    account1.setBalance(10000);
    
    //생성자
    BankAccount account2 = new BankAccount();
    account2.setAccNo("01012345678");
    account2.setBalance(50000);
    
    System.out.println();
    ///////
    
    
    try {
    
      //입금 출금 void
      account1.deposit(100000);//10만원 입금(성공) //메소드 호출한 곳으로 던진다,
      account1.deposit(-50000);//-5만원 입금(실패)//여기서 예외를 받아서 처리.
      
      long money; // 
      money = account1.withdrawal(100000); //10만원 출금(성공)
      System.out.println(money);//출금된 금액 출력
      money = account1.withdrawal(200000); // 20만원 출금 (실패)
      System.out.println(money); //0 (출금된 금액 출력 )
      //이체 
      account1.transfer(account2,50000); // account1 -> account2, 5000원 이체 (성공)
      account1.transfer(account2,100000); // account1 -> account2, 100000원 이체 (실패)
      
    } catch (Exception e) {

      System.out.println(e.getMessage());
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }

}
