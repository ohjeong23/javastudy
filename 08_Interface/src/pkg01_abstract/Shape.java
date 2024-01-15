package pkg01_abstract;

/*
 * 추상 클래스
 * 1. 추상 메소드를 가지고 있는 클래스이다.
 * 2. 추상 클래스는 객체 생성이 불가능하다.
 * Shape shape = new Shape(); 이제 불가능 
 *    1) 익명 내부 타입(Annoymous inner Type)으로 생성할 수 있다.
 *    2) 객체를 생성할 때 추상 메소드를 곧바로 오버라이드해서 만드는 것을 의미한다.
 *    추상메ㅗㅅ드의 본문만 잠깐 만들어줌 
 *    추상 클래스가 주체적으로 가지는 모든 축제들을 
 *    추상 클래스는 추상메소드 때문에 생긴다.
 *     
 * 3.형식
 *     abstract class 클래스명 {}
 *     
 *     //추상 클래스에 제한을 걸어서 인터페이스로 만들 수 있다.
 *     
 */



public abstract class Shape {
  
  //field
  private String name;
  
  
  //constructor
  
  public Shape() {

  }


  public Shape(String name) {
    super();
    this.name = name;
  }

//method
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }
  
  
  /*
   * 추상 메소드
   * 1. 본문이 없는 메소드이다.
   * 2. 형식
   *     abstract 반환타입 메소드명(매개변수); 중괄호 자체를 지움 {} 
   */
  
  //이름확인 getter 이름 변경 setter
  //넓이를 반환하는 메소드
  public abstract double getArea();
  
  
  //둘레 길이를 반환하는 메소드
  public abstract double getCircum();
  //추상 메소드로 바꿈
  
  
  
  
  //{
    
    
   //불필요 하지만 억지로 넣음
  }
  //shpae에 두 자식이 사용할 getArea 와 getCircum() 을 만듬
  //근데 가져다 쓰면 0만 반환해서 가져다 쓸 수 없음
  //그럼 다시 만들어 쓰기. 오버 라이딩 
  //부모의 메소드를 자식이 사용못하면 다시 만들어 써라.
  //부모에 있지 않으니 만들어 쓰기
  
  //하나의 타입으로 여러 메소드 관리
  /*
   * shape[ shapes = new Shape[10]
   * shapes.add(new Circle())
   * shapes.add(new Rectangle())
   * shapes[0].getArea()  원 넓이  
   */
    
  //추상메소드 : 본문이 필요하지 않은 메소드
  
  
  
  
  
  
  

