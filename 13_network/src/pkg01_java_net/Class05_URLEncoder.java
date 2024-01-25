package pkg01_java_net;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Class05_URLEncoder {
  
  public static void main(String[] args) {
    
    try {
      
    String str = "http://www.google.com/";
    String encoded = URLEncoder.encode(str, "UTF-8") ;
    System.out.println(encoded);
      
    String decoded = URLDecoder.decode(encoded,"UTF-8");
    System.out.println(decoded);
      //복호화한거 다시 디코드
    } catch (UnsupportedEncodingException e) {

    e.printStackTrace();
    
    
    
    
    
    
    }
    
    
    
    
  }
  
  
  
  

}
