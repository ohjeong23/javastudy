package practice01_BankAccount;

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
    
    //입금 출금 void
    account1.deposit(200000);//10만원 입금(성공)
    account2.deposit(200000);//-5만원 입금(실패)
    
    
    long money; //
    
    money = account1.withdrawal(10000); //10만원 출금(성공)
    System.out.println(money);//출금된 금액 출력
    money = account1.withdrawal(20000); // 20만원 출금 (실패)
    System.out.println(money); //0 (출금된 금액 출력 )
    
    
    ////////
    
    //이체 
    account1.transfer(account2,50000); // account1 -> account2, 5000원 이체 (성공)
    account2.transfer(account1,100000); // account1 -> account2, 100000원 이체 (실패)
    
  }

}
