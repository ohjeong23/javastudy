package practice03_Club;

public class MainClass {
  
  public static void main(String[] args) {
    //세트의 기본 동작은 참조값을 비교한다. 내가 이미 가지고 있는 데이터들은 세트는 참조 타입만 가질 수 있음
    //세트 안에들어간건 참조값밖에 없음. 비교해서 동일한 참조값이면 안받고 다른 참조값이면 무조건 받음
    //같은건 집어넣지 않고 다른것만 집어넣음, 참조값말고 가지고 있는 아이디를 꺼내서 비교할것.
     
    Club club = new Club();
   
    Person p1 = new Person("1");
    Person p2 = new Person("2");
    Person p3 = new Person("3");
    Person p4 = new Person("4");
    Person p5 = new Person("5");
    System.out.println(System.identityHashCode(p3));
    
    club.enterClub(p1);
    club.enterClub(p2);
    club.enterClub(p3);//참조가 달라 다른 사람으로 인식                                        
    club.enterClub(p3);
    club.enterClub(p3);
    club.enterClub(p4);
    club.enterClub(p5);
    club.enterClub(new Person("6"));
    club.enterClub(new Person("6"));
    
    
 

    club.leaveClub(p1);
  club.poolList();
  
  }

}
