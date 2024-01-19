package practice02_Cart;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class Cart {
  
  //field
   public List<Product> products;
   
 
  public Cart(int cartSize) {
    
    products = new ArrayList<Product>(cartSize);
    
  }
  
  public List<Product> getProducts() {
    return products;
  }
  
  
  
  public void setProducts(List<Product> products) {
    this.products = products;
  }
  
 
  

  // 물건 담기      던지는 곳,지점                  생략가능 언체크드 익셉션이면 
  public void addProduct(Product product) throws RuntimeException {
    
   
    //담을 물건이 없는 경우
    if(product == null) {
      throw new RuntimeException("카트에 담을 물건이 없습니다."); //1.try {} -> catch 2. method call
      
    }
    
    products.add(product);
    
  }
  
  
  
  // 물건 바꾸기
  public void changeProduct(int idx,Product product) throws RuntimeException{
    
    //카트가 비어있을때
    if(products.size()== 0) {
     throw new RuntimeException("카트가 비었습니다.");
    }
    //바꿀 물건이 없는 경우
    if(product == null) {
      
      throw new RuntimeException("바꿀 물건이 없습니다.");
    }
    //존재하지 않는 물건 번호(인덱스)인 경우
    if(idx < 0 || idx == products.size()) { // new Cart(5),product.length >= idx
      
      throw new RuntimeException("물건 번호가 잘못되었습니다.");
    }
    
    products.set(idx,product);
    
    
    
    
  }
  
  
  
  
  // 물건 빼기
  
  public void removeProduct(int idx) throws RuntimeException{
    
    //카트에 담긴 물건 개수
    int size =products.size();
    
    //카트 비어
    if(products.size() == 0) {
      throw new RuntimeException("물건이 없습니다.");
    } 
    
    //뺀 물건 번호가 잘못
    
    
    if(idx < 0 || idx == products.size()) { // new Cart(5),product.length >= idx
     throw new RuntimeException("물건 번호가 잘못되었습니다.");
    }
   

    products.remove(idx);
    
    
    
    
    
  }

  
  
  
  
}