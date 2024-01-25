package pkg02_open__api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONException;

public class MainClass {
  
  
  public static void main(String[] args) {
    
    StringBuilder builder = new StringBuilder();
    builder.append("http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath");
    builder.append("?serviceKey=").append("TBvpLjeMFYUcFvi2TQKQXXKe9ue3NsffkCjXslwIfOzwJnmH%2BTRFQAWS7sidJpEvwPCOqHqrt2eQnYm0A6PMaQ%3D%3D");
    builder.append("&searchYear=").append(2022);
    builder.append("&siDo=").append(1100);
    builder.append("&guGun=").append(1125);
    builder.append("&type=").append("json");
    builder.append("&numOfRows=").append(10);
    builder.append("&pageNo=").append(1);
    
    

    String spec = builder.toString();
    URL url = null;
    HttpURLConnection con = null;
    BufferedReader in =null;
    
    
    try {
      
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();
      
      if(con.getResponseCode() != HttpURLConnection.HTTP_OK) {
        throw new RuntimeException("API요청 실패");
      }
      in= new BufferedReader(new InputStreamReader(con.getInputStream()));
           
      StringBuilder sb = new StringBuilder();
      String line = null;
      while((line =in.readLine())!=null) {
        sb.append(line);
      }System.out.println(sb.toString());
      in.close();
      con.disconnect();
    } catch (Exception e) {

    e.printStackTrace();
    }
                                                                                         
    
    
    
  }

}