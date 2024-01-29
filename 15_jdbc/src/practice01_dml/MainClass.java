package practice01_dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MainClass {
  
  /*
   * TALK_T  테이블에 1행 씩 삽입하시오/.
   * TALK_T 
   *    TALK_NO         NUMBER() pk
   *    TALK_CONTENT    VARCHAR2 1000byte
   *    TALK_EDITOR     VARCHAR2 1000 byte
   *    WRITEN_AT       TIMESTAMP (현재날짜시간 : CURRENT_TIMESTAMP)
   *    DB 서버 환경
   *    192.168.0.214
   *    GD 1111
   *    
   */
  
  
  
  public static void method1() {
    
    //Connection,PrepareStatement 객체 선언

    Connection con = null;
    PreparedStatement ps = null;
    try {
      //oracle.jdbc.OracleDriver 클래스 로드
    Class.forName("oracle.jdbc.OracleDriver") ;
    
  
    //데이터 베이스 접속정보
    String url = System.getProperty("jdbc.url");
    String user = System.getProperty("jdbc.user");
    String password = System.getProperty("jdbc.password");
      
      
      //Connection 객체 생성
    con = DriverManager.getConnection(url,user,password);
    
    //쿼리문
    String sql = "INSERT INTO TALK_T( TALK_NO,TALK_CONTENT,TALK_USER,WRITEN_AT) VALUES(TALK_SEQ.NEXTVAL,?,?,CURRENT_DATE)";
    //?변수처리한다는거 , 첫번째가 1 두번재가 2
    ps = con.prepareStatement(sql);
    
    //변수 입력 받기
    Scanner sc = new Scanner(System.in);
    System.out.println("내용 입력하세요 >>>");
    String content = sc.next();
    System.out.println("편집자 입력하세요 >>>");
    String editer = sc.next();
    sc.close();
    
    //변수를 쿼리문에 전달하기
    ps.setString(1, content);// 쿼리문의 1번째 물음표에 String content 전달하기
    ps.setString(2, editer);//쿼리문의 2번째 물음표에 String editor 전달하기
  
  int result = ps.executeUpdate();
  System.out.println(result +"행이 삽입됨");
  
  
  } catch (Exception e) {

  e.printStackTrace();
  
  
  
  }finally {
    
    try {
      
      if(ps != null)  ps.close();
      if(con != null) con.close();
      
    } catch (Exception e2) {

    e2.printStackTrace();
    }
  }
  
    
    
    
    
  }
  
  
  
  
  public static void main(String[] args) {
    
    
    
    method1();
    
    
    
  }
  
  
  

}
