package pkg03_branch_practice;

public class MainClass {

public static void method1() {
    
    // 월에 따른 계절 출력하기
    int month = 1;
    
    if (month <= 2) {
      System.out.println("겨울");
    }else if(month <= 5) {
      System.out.println("봄");
    }else if(month <= 8) {
      System.out.println("여름");
    }else if(month <= 11) {
      System.out.println("가을");
    }else {
       
        System.out.println("겨울");
     
      }
    }
    
  
  
  public static void method2() {
    
    // 점수와 학년에 따른 합격 여부
    // 1~3학년 : 60점 이상이면 합격, 아니면 불합격
    // 4~6학년 : 70점 이상이면 합격, 아니면 불합격
    
    int score = 60;  // 점수
    int grade = 1;   // 학년
    
    
    if(grade <= 3) {
      if(score >= 60) {
        System.out.println("합격");
      }else {
        System.out.println("불합격");
      }
      
    }else{
      if(score >= 70) {
        System.out.println("합격");
      }else {
        System.out.println("불합격");
      }
      
      
    }
    
    
    
    
    
    
    
    
  }
  
  public static void method3() {
    
    // 4일은 목요일, n일 후는 무슨 요일?
    
    int day = 4;      // 4일은 목요일 
    int nDay = 2;    // nDay일 후 
     // 요일 (월~일)
   
    if((day+nDay)%7 == 0) {
      String weekName = "일" ; 
      System.out.println(weekName);
    }else if((day+nDay)%7 == 1) {
      String weekName = "월" ; 
      System.out.println(weekName);
    }else if((day+nDay)%7 == 2) {
      String weekName = "화" ; 
      System.out.println(weekName);
    }else if((day+nDay)%7 == 3) {
      String weekName = "수" ; 
      System.out.println(weekName);
    }else if((day+nDay)%7 == 4) {
      String weekName = "목" ; 
      System.out.println(weekName);
    }else if((day+nDay)%7 == 5) {
      String weekName = "금" ; 
      System.out.println(weekName);
    }else 
      {String weekName = "토" ; 
      System.out.println(weekName);
    }
    
  }
  
  
  
  
  
  public static void main(String[] args) {

         method3();
  }

}
