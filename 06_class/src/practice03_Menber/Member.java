package practice03_Menber;

public class Member {
  
  //field
  private String id; 
  private Contact contact;//클래스 필드로 다른 클래스 멤버를 부름
  private Address address;
 
  //생성자 2개 constructor
  public Member() {
    
  }
  
  
  public Member(String id, Contact contact, Address address) {
    super();
    this.id = id;
    this.contact = contact;
    this.address = address;
  }

//method
  
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Contact getContact() {
    return contact;
  }


  public void setContact(Contact contact) {
    this.contact = contact;
  }


  public Address getAddress() {
    return address;
  }


  public void setAddress(Address address) {
    this.address = address;
  }

  
  
  
  
  
  
  
  
  
  
}
