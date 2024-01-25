package pkg01_File;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pkg02_OutputStream.Employee;

public class MainClass {

  /*
   * java.io.file
   * 1. 디렉터리, 파일을 관리하는 클래스이다.
   * 2. 디렉터리, 파일을 만들고 삭제할 수 있다.
   * 3. 디렉터리, 파일의 정보(이름,경로, 크기, 최종 수정일 등)를 확인할 수 있다.
   */
  
  /*
   * 경로 작성 방법
   * 1. 경로 구분자 (separator)
   *   1) 윈도우      : 역슬래시(\\ 역슬래시 두개를 해야함)
   *   2) 리눅스, Mac : 슬래시(/)
   *   3) File,separator(static 멤버에는)  필드에는  플랫폼에 따른 경로 구분자가 자동 삽입된다.
  배포할때는 윈도우지만 슬래시로 한다.
   * 2. 디렉터리
   *   1) 루트 : 경로 구분자로 시작하는 경로는 루트에서 시작하는 경로  드라이브 밑에
   *   2) 상위 디렉터리 : ..
   *   3) 현재 디렉터리 : .
   *   
   */
  
  public static void  method1() {
    
    //디렉토리 만들기/삭제하기
    
    //File 객체 선언
    File dir;
    //File 객체 생성
    //parent :dir    child :file
    dir = new File("//storage");// 폴더 이름    
    
    //디렉터리 유무에 따른 생성
    if(!dir.exists()) { // 디렉터리가 없으면 
      dir.mkdirs();
    }else {
      //디렉토리가 있으면
     // dir.deleteOnExit(); //JVM 실행이 종료된 이후에 삭제한다.
      dir.delete();       //JVM 실행 중에 삭제한다.
    }
    
  }
  
  
  public static void method2() {
    
    // 파일 만들기/삭제하기
    
    // 파일이 저장될 디렉터리 작업
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    // 파일을 File 객체로 생성
    File file = new File(dir, "smaple.txt");
  //파일 유무에 따른 생성/삭제
    if(file.exists()) { // 파일이 있으ㅏ면
      file.delete();
      
    }else {
      //파일이 없으면
      try {
        file.createNewFile();//예외 처리를 해야함  checked exception = IOException   try catch 달고 살아야함
        //IOException 처리가 반드시 필요하다.(Checked Exception)
      } catch (Exception e) {
        e.printStackTrace();
}
     
    }
  
  }
  
  
  
  public static void method3() {
    
    /*
     * File 클래스 주요 메소드
     * 1. listFiles()    : 디렉터리 내의 모든 File 객체를 File[] 배열로 반환
     * 2. getName()      : 이름 반환
     * 3. getParent()    : 저장된 디렉터리 반환
     * 4. getPath()      : getParent() + getName()
     * 5. lastModified() : 최종수정일을 long 타입으로 반환
     * 6. length()       : 파일 크기를 long 타입으로 반환 (바이트 단위)
     * 7. isDirectory()  : 디렉터리이면 true 반환
     * 8. isFile()       : 파일이면 true 반환 
     */
    
    // JAVA_HOME 을 File 객체로 생성
    File javaHome = new File("\\Program Files\\Java\\jdk-17");
    
    // JAVA_HOME 에 있는 모든 디렉터리와 파일을 File 객체로 가져오기
    File[] files = javaHome.listFiles();
    
    // 하나씩 확인
    for(File file : files) {
      
      StringBuilder builder = new StringBuilder();
      
      // 이름
      builder.append(String.format("%-20s", file.getName().substring(0, Math.min(file.getName().length(), 20))));
      
      // 최종수정일
      String lastModified = new SimpleDateFormat("yyyy-MM-dd a h:mm").format(file.lastModified());
      builder.append(String.format("%-20s", lastModified));
      
      
      // 유형
      builder.append(String.format("%-10s", file.isDirectory() ? "파일 폴더" : "파일"));
      
      // 크기
      long byteSize = file.isDirectory() ? 0 : file.length();
      long kbSize = (byteSize / 1024) + (byteSize % 1024 != 0 ? 1 : 0);
      if(byteSize != 0)
        builder.append(String.format("%10s", new DecimalFormat("#,##0").format(kbSize) + "KB"));
      
      // 출력
      System.out.println(builder.toString());
      
    }
   
  }
  
  public static void method4() {
    
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    File file = new File(dir, "sample4.dat");
    
    // 데이터 출력 스트림 선언
    DataOutputStream out = null;
    
    try {
      
      // 데이터 출력 스트림 생성
      out = new DataOutputStream(new FileOutputStream(file));
      
      // 출력할 데이터
      String name = "홍길동";
      int age = 10;
      double height = 140.5;
      boolean isAdult = (age >= 20);
      char gender = '남';
      
      // 출력
      out.writeUTF(name);
      out.writeInt(age);
      out.writeDouble(height);
      out.writeBoolean(isAdult);
      out.writeChar(gender);
      
      // 데이터 출력 스트림 닫기
      out.close();
      
      // 확인
      System.out.println(file.length() + "바이트 크기의 " + file.getPath() + " 파일이 생성되었습니다.");
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }
  
  
public static void method5() {
    
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    
    
    File file = new File(dir, "sample5.dat");
    
    // 객체 출력 스트림 선언
    ObjectOutputStream out = null;
    
    try {
      
      // 객체 출력 스트림 생성
      out = new ObjectOutputStream(new FileOutputStream(file));
      
      // 출력할 객체
      Employee employee = new Employee(1, "홍길동");
      List<Employee> employees = Arrays.asList(new Employee(2, "홍길순"), new Employee(3, "홍순자"));
      
      // 객체 출력
      out.writeObject(employee);
      out.writeObject(employees);
      
      // 객체 출력 스트림 닫기
      out.close();

      // 확인
      System.out.println(file.length() + "바이트 크기의 " + file.getPath() + " 파일이 생성되었습니다.");
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }
  
  
  public static void main(String[] args) {

    
    practice1();
    
  }

  public static void practice1() {
    
    // \2024\01\22 디렉터리 만들기 (현재 날짜의 디렉터리 만들기)
    
    LocalDate today = LocalDate.now();
    int year = today.getYear();
    int month = today.getMonthValue();
    int day = today.getDayOfMonth();
    
    StringBuilder builder = new StringBuilder();
    builder.append("\\");
    builder.append(year);
    builder.append("\\");
    builder.append(String.format("%02d", month));
    builder.append("\\");
    builder.append(String.format("%02d", day));
    
    File dir = new File(builder.toString());
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    System.out.println(dir.getPath() + " 디렉터리 생성이 완료되었습니다.");
    
  }
  
  public static void practice2(File dir) {
    
    // \2024 디렉터리 삭제하기 (비어 있는 디렉터리만 삭제할 수 있다.)
    
    // 순서대로 하나씩 삭제하기
    // \2024\01\22 삭제 -> \2024\01 삭제 -> \2024 삭제
    
    // 재귀 호출로 해결하기(자기가 자기를 호출하는 방식)
    // practice2(new File(\2024\01\22)) 호출 후
    // practice2(new File(\2024\01)) 호출 후
    // practice2(new File(\2024)) 호출
    // practice2(new File(\)) 호출로 마무리
    
    // 파라미터 File dir 객체의 상위 디렉터리가 없으면 종료
    File parent = dir.getParentFile();
    if(parent == null) {
      return;
    }
    
    // 현재 디렉터리 삭제
    System.out.println(dir.getPath() + " 삭제하였습니다.");
    dir.delete();
    
    // 상위 디렉터리를 practice2 메소드에 전달
    practice2(parent);
    
  }
  
}