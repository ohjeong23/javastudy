package practice03_BankAccount;
//뱅크의 자식 뱅크의 생성자를 호출해주기 위해 
//슈퍼클래스의 생성자 호출
    //필드 없음 부모에 있어서
//자식을 만들때 부모의 생성자 호출이 필수
  //생성자 만들어서 해결
//메시지와 에러코드 받아와서 부모에게 전달
  //부모 생성자만 호출
//필드가 없어서 getter setter 필요 없음
  
  public class DepositException extends BankException {

    public DepositException(int errorCode) {
      super(errorCode);
    }
    public DepositException(String message, int errorCode) {
      super(message, errorCode);
    }

  }