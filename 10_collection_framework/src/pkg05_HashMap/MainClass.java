package pkg05_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainClass {

  /*
   * HashMap
   * 1. 객체(인스턴스)를 대신할 수 있는 자료구조이다.
   * 2.구성
   *     1) key: 데이터 식별자, HashSet 으로 구성되어 있다.(순서 없고 중복 없다.)
   *     2) Value :데이터 자체
   *     3) Entry : key와 value를 합쳐서 부르는 말이다.
   * 
   */
  
   public static void method1() {
     
     //Mutable 객체 값이 변할 수 있는 객체
     
     //HashMap 선언
     Map<String, Object>  book;
     
    //HashMap 생성
     book = new HashMap<String, Object>(); 
     
     //key,Value 추가(Entry 추가
     book.put("title", "어린왕자"); //for 문
     book.put("author", "생텍쥐베리");
     book.put("isBestSeller", true);
     book.put("price", 10000);
     
     //키를 이용해 벨류값을 확인하기.
     
      System.out.println(book.get("title"));
      System.out.println(book.get("author")); 
      System.out.println((boolean)book.get("isBestSeller") ? "베스트셀러" : "일반서적");
      System.out.println(book.get("price")+"원");
     
   }//오브젝트 꺼내쓸때 분리해서 캐스팅해라.타입에 맞춰 캐스팅  
  
   
   public static void method2() {
     
     //Immutable 객체(값을 바꿀 수 없는 객체. 어떤 값을 전달할때 이 객체로 전달하면 안전하다.
     
     Map<String, Object> map = Map.of("name", "홍길동");
     
     
  
     //값을 바꾸려는 시도, 추가도 안되고 삭제도 안됨 안전하게 보관.
     //map.put("age", 10);
     
     System.out.println(map.get("name"));
     
     
    
     
     
     
     
     
     
     
   }
   
   public static void method3() {
     
     // Key 는 Set 으로 되어있다.
     
     Map<String, Object> map = Map.of("name", "홍길동", "age", 10, "isMarried",false);

     Set<String> keys = map.keySet(); // 어드밴스드  for문 사용
     for(String key: keys) {
       
       System.out.println(key + ":"+map.get(key));
       
     }
   //
   }

   
   public static void method4() {
     
     //Entry 전체를 Set 로 만들 수 있다.
     Map<String, Object> map = Map.of("name", "홍길동", "age", 10, "isMarried",false);
     
     Set<Entry<String, Object>> entrySet = map.entrySet();
     for(Entry<String, Object> entry : entrySet) {
       System.out.println(entry.getKey()+ ":"+entry.getValue()); //엔트리 통재로 빼서 겟키 겟벨류로 빼기
     }
     
     
   }
   
   
   public static void method5() {
     
     Map<String, Object> map = new HashMap<String, Object>();
     
     //처음 입력되는 key 는 추가된다.
   
     map.put("name","홍길동");
     map.put("age",10);
     map.put("isMarried",false);
     
     //다시 입력되는 key 는 수정을 의미한다.
     
     map.put("age", 20);
     
     map.remove("isMarried");
     
     System.out.println(map);
     
   }
   
  public static void main(String[] args) {

    //키와 값, 키는 중복된 값 가질 수 없음. 저장할때 키값이 똑같은지 여부를 또 서치를 해줘야함 존재하는지 이때 해시를 써서 해쉬코드가 같나 같다면 이퀄스 로 서치 해시기반의 맵이다 이래서 해시 맵
    //키가 해쉬셋으로 되어있음 그래서 키는 해시 셋의 구조와 같다.중복된 값 없고 순서 없다.벨류는 없다.제한사항이
    method5();
    
  }

}
