package practice03_Club;

import java.util.Objects;

public class Person {

 
  private String id;
  
  
  
  public Person() {

  
  }

  public Person(String id) {
    super();
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
  
  
  
  
  @Override
  public String toString() {
    return "Person [id="+ id +" ]";
    
    
  }
  
  
  
  
  
  
  

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
  
  
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Person other = (Person) obj;
    return Objects.equals(id, other.id);
  }
  
  //search 1. 같은 해시 값을 가진 해시코드 파트 찾기 2. 이퀄스 찾기
  //여러개로 잘게 쪼갤수록 좋다. 각 파트마다 같은 해시값
 //해시 값 먼저 만들고 동일한지 확인하기 위해 이퀄스로 확인
  //  동일한게 있는지 없는지 찾을 때 사용 hashcode equals
  //여러개의 그룹으로 분리하고 서치 하는게 빠르다./
  
}
