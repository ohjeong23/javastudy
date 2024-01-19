package pkg05_etc;

import java.util.Optional;

public class Class01_Optional {

  public static void main(String[] args) {

    //Optional<T> : T 타입의 데이터를 감싸는 클래스
    
   
    //1. null 값이 없는 데이터 
    
    String str1 = "사과";
    Optional<String> opt1 = Optional.of(str1);
    //of 메소드를 씀 opt1 봉지 Optional 사과 사과를 봉지에 넣었다.
    System.out.println(opt1.get() ); //사과를 봉지에 넣고 주고 다시 사과를 꺼내먹는 느낌
    
    //싸자마자 깜
    
    
    //2. null 값이 있는 데이터 (배우는 목적)
    
    
    String str2 = null;
    Optional<String> opt2 = Optional.ofNullable(str2); //목록보기 구현할때 씀
    System.out.println(opt2.orElse("바나나"));

    
  }

}
