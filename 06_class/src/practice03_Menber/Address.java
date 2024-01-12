package practice03_Menber;

public class Address {

  //field //코드이름 길게해도 ㄱㅊ PC이런건 피해야 함 
  private String postCode;
  private String roadAddress;
  private String jibunAddress;
  private String detailAddress;
  private String extraAddress;
  private boolean isbasicAddress; // true false
  
  //constructor
  public Address() {
    
  }

 
  
  
 
  public Address(String postCode, String roadAddress, String jibunAddress, String detailAddress, String extraAddress,
      boolean isbasicAddress) {
    super();
    this.postCode = postCode;
    this.roadAddress = roadAddress;
    this.jibunAddress = jibunAddress;
    this.detailAddress = detailAddress;
    this.extraAddress = extraAddress;
    this.isbasicAddress = isbasicAddress;
  }

  // 생성자 두개 constructor     VO dto 데이터 트랜스포     bean
  
  //method
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public String getRoadAddress() {
    return roadAddress;
  }

  public void setRoadAddress(String roadAddress) {
    this.roadAddress = roadAddress;
  }

  public String getJibunAddress() {
    return jibunAddress;
  }

  public void setJibunAddress(String jibunAddress) {
    this.jibunAddress = jibunAddress;
  }

  public String getDetailAddress() {
    return detailAddress;
  }

  public void setDetailAddress(String detailAddress) {
    this.detailAddress = detailAddress;
  }

  public String getExtraAddress() {
    return extraAddress;
  }

  public void setExtraAddress(String extraAddress) {
    this.extraAddress = extraAddress;
  }

  
  public boolean isIsbasicAddress() {
    return isbasicAddress;
  }


  public void setIsbasicAddress(boolean isbasicAddress) {
    this.isbasicAddress = isbasicAddress;
  }



 

 





  
  
  
  
}
