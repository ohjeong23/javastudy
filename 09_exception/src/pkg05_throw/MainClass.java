package pkg05_throw;

import java.net.MulticastSocket;

import javax.management.RuntimeErrorException;

public class MainClass {

  public static void main(String[] args) {

    /*
     * throw
     * 1. 직접 예외 객체를 만들어서 던질 때 사용한다.
     * 2. 자바가 자동으로 던지지 않는 예외들은 throw 문으로 직접 던져야 한다.
     * 자바가 생각할때 예외가 아닌것들 . 하지만 내가 생각할때 예외 인것들
     */
    
    try {
      
      int score = 180; // 0~100
      char grade;
      
      
      if(score <0 || score >100) {
        
        throw new RuntimeException();//인자값      }
      //Exception e = new RuntimeException()\
      
      }
      if(score >=90)
        grade = 'A';
      else if(score >=80)
        grade ='B';
      else if(score >=70)
        grade ='c';
      else if(score >=60)
        grade = 'D';
        else
          grade ='F';
      System.out.println("점수 :"+score +"점 , 학점:"+grade +"학점");
      
    } catch (Exception e) { // 매개변수
       System.out.println("잘못된 점수입니다.");
    }
    
    
    
    
    
    
    }

}
