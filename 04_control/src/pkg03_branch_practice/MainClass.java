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
    int nDay = 20;    // nDay일 후 
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
  
  
  
 public static void method4() {
    
    // 월에 따른 계절 출력하기
    int month = 12;
    String season;
    
    int mod = month % 12;
    
    if(mod <= 2) {
      season = "겨울";
    } else if(mod <= 5) {
      season = "봄";
    } else if(mod <= 8) {
      season = "여름";
    } else {
      season = "가을";
    }
    
    System.out.println(season);
    
  }
  
  public static void method5() {
    
    // 점수와 학년에 따른 합격 여부
    // 1~3학년 : 60점 이상이면 합격, 아니면 불합격
    // 4~6학년 : 70점 이상이면 합격, 아니면 불합격
    
    int score = 70;  // 점수
    int grade = 4;   // 학년
    
    // 합격 점수
    int pass = 0;
    if(grade >= 1 && grade <= 3) {
      pass = 60;
    } else if(grade >= 4 && grade <= 6) {
      pass = 70;
    }
    
    // 합격/불합격
    String result = null;
    if(score >= pass) {
      result = "합격";
    } else {
      result = "불합격";
    }
    
    System.out.println(result);
    
  }
  
  public static void method6() {
    
    // 4일은 목요일, n일 후는 무슨 요일?
    
    int day = 4;      // 4일은 목요일
    int nDay = 10;    // nDay일 후
    String weekName;  // 요일 (월~일)
    
    // day의 nDay일 후
    day += nDay;
    
    // day를 7로 나눈 나머지
    int mod = day % 7;
    if(mod == 0)
      weekName = "일";
    else if(mod == 1)
      weekName = "월";
    else if(mod == 2)
      weekName = "화";
    else if(mod == 3)
      weekName = "수";
    else if(mod == 4)
      weekName = "목";
    else if(mod == 5)
      weekName = "금";
    else
      weekName = "토";
    
    System.out.println(weekName);
    
  }
  
  public static void method7() {
    
    // 메뉴에 따른 가격 저장하기.
    // 아메리카노 : 1000
    // 카페라떼   : 2000
    // 밀크티     : 3000
    // 기타       : 5000
    
    String order = "밀크티";
    int price = 0;
    
    switch(order) {
    case "아메리카노":
       price = 1000;
       break;
    case"카페라떼":
      price = 2000;
      break;
    case "밀크티":
       price = 3000;
       break;
    default:
      price = 5000;
    }
    
    System.out.println(price);
    
  }
  
  
  
 
  
  public static void main(String[] args) {

         method7();
  }

}

























