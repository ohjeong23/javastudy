package pkg08_custom_exception;

/*
 * 사용자 예외 클래스
 * 1. java.lang.Exception 클래스를 상속한다.
 * 2. 클래스명은 Exception 으로 끝나는 것이 좋다.
 */



public class MyException extends Exception {
  //field                        //String message 전달-> Exception 은 그걸 받아 -> Throwable 로 전달하고 저장(getMessage(로 부르기)
  
  private int errorCode;
  
  //constructor
  public MyException(String message,int errorCode) {
    
    super(message);//생성자가 부모의 생성자를 부르고 거기에 메시지를 전달.
    this.errorCode = errorCode;  //능력이 없어서 만들어 씀 메시지 까지만 전달.
  //메시지가 전달되면 detailMessage 에 전달되어 저장됨.
    //익셉션이 슈퍼를 부르면           
    //public Exception(String message){} 생성자 호출. 
  
  
  }

  public int getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(int errorCode) {
    this.errorCode = errorCode;
  }
    
  
}
