package pkg04_checked;

import java.net.URL;
import java.net.MalformedURLException;

public class MainClass {

  public static void main(String[] args) {

    // checked exception : try - catch 와 같은 예외처리
    try {
   URL url = new URL("https://www.google.com/");
    }catch(MalformedURLException e) {
      System.out.println("잘못된 URL 입니다.");
    }
    
  }

}
