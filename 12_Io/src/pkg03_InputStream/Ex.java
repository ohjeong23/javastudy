package pkg03_InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex {
  
  
  public static void method1() {
    
    File dir = new File("\\storage");
    File file = new File(dir,"sample.dat");
    
    FileInputStream in = null;
    
    try {
      
      in = new FileInputStream(file);
    byte[] b =new byte[(int)file.length()];
      int idx = 0;
      
      int c;
      
      while(true) {
        c= in.read();
      if(c == -1) {
        break;
      }
      b[idx++] = (byte)c;
      
      }
     
      
     System.out.println(new String(b)); 
      in.close();
      
    } catch (FileNotFoundException e) {

    System.out.println("파일의 경로를 확인하세요.");
    
    
    
    } catch(IOException e)
    {
      System.out.println("입출력 예외가 발생했습니다.");
    }
    
    
    
  }
  
  
  public static void method2() {
    
    File dir = new File("\\storage");
    File file = new File(dir,"smaple2.dat");
    
    FileInputStream in = null;
    try {
    
      in = new FileInputStream(file);
      
      byte[] b = new byte[(int)file.length()];
      
      byte[] bytes = new byte[5];
      int idx = 0;
      
      while(true) {
        int readByte = in.read(bytes);
        if(readByte == -1) {
          break;
        }
        System.arraycopy(bytes, 0, b, idx, readByte);
        idx += bytes.length;
        
        
        
      }
      System.out.println(new String(b));
      in.close();
      
    } catch (Exception e) {

    
    
    
    }
    
    
    
    
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

}
