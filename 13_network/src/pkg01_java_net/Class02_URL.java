package pkg01_java_net;

import java.net.MalformedURLException;
import java.net.URL;

public class Class02_URL {
  
  
  public static void main(String[] args) {
    
    
    try {
      
      URL url = new URL("https://www.example.com:9090/webtoon/list?page=1&id=100#memo");  //
      
      
      
      System.out.println(url.getProtocol());  //https    
      System.out.println(url.getHost());      //www.example.com
      System.out.println(url.getPort());      //9090
      System.out.println(url.getPath());      ///webtoon/list
      System.out.println(url.getQuery());      //page=1&id=100
      System.out.println(url.getFile());      ///webtoon/list?page=1&id=100
      System.out.println(url.getRef());      //memo
      
      
      
    } catch (MalformedURLException e) {
      e.printStackTrace();

    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
  }
  
  
  
  

}
