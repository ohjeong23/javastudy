package pkg02_OutputStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MainClass {

  /*
   * java.io.FileOutputstrema
   * 1. 바이트 기반의 파일 출력 스트림이다.
   * 2. 출력 단위
   *     1) int 
   *     2) byte[]
   */ 
  
  /*
   * java.io.BufferedOutputStream
   * 1.버퍼링을 지원하는 바이트 출력 스트림이다.
   * 2.보조 스트림으로 메인 스트림과 함께 사용해야 한다.
   * 3.버퍼링을 지원하므로 출력 속도가 향상된다.
   * 
   */
  /*
   * java.io.DataOutputStream
   * 1. 자바 변수 값을 출력하는 바이트 출력 스트림이다.
   * 2.보조 스트림으로 메인  스트림과 함께 사용해야 한다,
   * 3.타입별로 전용 메소드가 존재한다,
   */
 /* 
  * java.io.ObjectOutputSteam
  * 1.객체를 출력하는 바이트 출력 스트림이다.
  * 2.보조 스트림으로 메인 스트림과 함게 사용해야 한다,
  * 3.객체를 출력 스트림으로 전송하기 위해서는 직렬화 과정이필요하다.
  * 4.직렬화 방법
  *    1) 직렬화할 클래스는 java.io.Serializable 인터페이스를 구현한다(필수)
  *    2)  long serialVersionUID필드 값을 임의로생성 난수처럼 //필수 아님
  *    
  *    
  */
  
  
  
  
  
  public static void method1() {
    
    // 무조건 생성 모드 : 기존에 파일이 있으면 지우고 다시 만든다.
    
    //디렉터리
    File dir =new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
   
 
    
    //파일
    File file =new File(dir,"smaple1.dat");
    
    // 파일 출력 스트림 선언 
    
    FileOutputStream out = null;
    
    try {
    
      // 파일 출력 스트림 생성(무조건 생성 모드)
      out = new FileOutputStream(file);// 이걸로 데이터를 보내는 스트림을 만들겠다. 
      
      // 출력할 데이터 
      int c = 'A'; 
      String str = "pple";
      byte[] b =str.getBytes();
      
      //출력
      out.write(c);
      out.write(b);
      
      // 플러싱(선택)
      out.flush();
      // 파일 출력 스트림 닫기(종료)
      out.close();
      // 확인
      System.out.println(file.length()+"바이트의 크기의"+file.getPath()+"파일이 생성되었습니다.");
      
    } catch (Exception e) {

      e.printStackTrace();
    
    }
    
    /*try {
      
    } catch (Exception e) {
     e.printStackTrace();

    
    }finally {
    try{
    if(out != null)
     out.close();// 종료
      }catch(Exception e2){
      
     e2.printStackTrace();     
     }
    }
    }
    */
  
    
    
  }
  
  
  public static void method2() {
    //안녕하세요 반갑습니다   ->  sample2.dat  파일로 보내기
    
    // 추가 모드 : 기존에 파일이 없으면 새로 만들고 있으면 내용만 추가한다.
    
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    // 파일
    File file = new File(dir, "sample2.dat");
    
     FileOutputStream in = null;
     try {
     //in = new FileOutputStream(file); 
     
     in = new FileOutputStream(file,true);
     String str = "안녕하세요 반갑습니다.";
     byte[] b =str.getBytes();
   //출
     in.write(b);
     
     // 플러싱(선택)
     in.flush();
     in.close();
       
     System.out.println(file.length()+"바이트의 크기의"+file.getPath()+"파일이 생성되었습니다.");

    } catch (Exception e) {
       e.printStackTrace();
    }
     
  }
  
  
  public static void method3()

  {
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    File file = new File(dir,"smaple3.dat");
    //버퍼 출력 스트림 선언
    BufferedOutputStream out = null;
   try {

  //버퍼 출력 스트림 생성
     out = new BufferedOutputStream(new FileOutputStream(file));
     //출력할 데이터
     String str1 = "how do you do? nice to meet you \n";
     String str2 = "I'm fine Thank you";
     //출력
     out.write(str1.getBytes());
     out.write(str2.getBytes());

     //버퍼 출력 스트림 닫기
     out .close();
     
     //확인
     System.out.println(file.length()+"바이트의 크기의"+file.getPath()+"파일이 생성되었습니다.");

     
  } catch (Exception e) {
  e.getStackTrace();
  
  
  } 
    
  }
public static void method5() {
  
  
  File dir = new File("\\storage");
  if(!dir.exists()) {
    dir.mkdirs();
  }
  File file = new File(dir,"sample5.dat");
  
  //객체 출력 스트림 선언
  ObjectOutputStream out = null;
  
  try {
  
  //객체 출력 스트림 생성  
    out = new ObjectOutputStream(new FileOutputStream(file));
    //출력할 객체
     Employee Employee = new Employee(1,"홍길동");
    //객체 출력
     out.writeObject(Employee);
     
     out.close();
     System.out.println(file.length()+"바이트의 크기의"+file.getPath()+"파일이 생성되었습니다.");

  } catch (Exception e) {

  e.printStackTrace();
  
  }
  
  
  
  
  
}
  
  
  
  
  
  public static void main(String[] args) {

 method5();
    
    
    
    
  }
  public static void practice1() {
    
    
    //fileOutputStream 으로 애국가 1절 파일로 보내기 : 시간 재기*(System.nanoTime())
    
   
   System.out.println(System.nanoTime());
   
   
  File dir = new File("\\storage");
   if(!dir.exists()) {
     
     dir.mkdirs();
   }
   File file = new File(dir,"korea1");
   FileOutputStream out = null;
   try {
  
     out = new FileOutputStream(file,true);
     String str ="동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
    
     out.write(str.getBytes());
     out.close();
     System.out.println(file.length()+"바이트의 크기의"+file.getPath()+"파일이 생성되었습니다.");
     
     
     
     
  } catch (Exception e) {

  e.getStackTrace();
  
  
  }
   
     
   System.out.println(System.nanoTime());
  }
 
   
 
  public static void practice2() {
    
    
    //BufferedOutputStream 으로 애국가 1절 파일로 보내기 : 시간 재기 
    
    System.out.println(System.nanoTime());

    
    File dir = new File("\\storage");
    if(!dir.exists()) {
      
      dir.mkdirs();
    }
    
    File file = new File(dir,"korea2");
    BufferedOutputStream out = null;
    
    try {
      
      out = new BufferedOutputStream(new FileOutputStream(file));
      String str = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리 나라 만세 ";
     out.write(str.getBytes());
     out.close();
     
     System.out.println(file.length()+"바이트의 크기의"+file.getPath()+"파일이 생성되었습니다.");

      
    } catch (Exception e) {
    
    e.getStackTrace();
    
    }
    
 
    System.out.println(System.nanoTime());

    
    
    
    
    
  
    
    
  }
  
  
  
  

}

