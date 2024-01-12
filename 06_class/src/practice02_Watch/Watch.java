package practice02_Watch;

public class Watch {

  private int hour;
  private int minute;
  private int second;
  
  public Watch(int hour, int minute, int second) {
    super();
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public void addHour(int hour) {
    if(hour <= 0) {
      return;
    }
    this.hour += hour;
    this.hour %= 24;    // 0 ~ 23 사이 값을 가지게 된다.
  }

  public void addMinute(int minute) {
    if(minute <= 0) {
      return;
    }
    this.minute += minute;
    addHour(this.minute / 60);
    this.minute %= 60;
  }
  
  public void addSecond(int second) {
    if(second <= 0) {
      return;
    }
    this.second += second;
    addMinute(this.second / 60);
    this.second %= 60;
  }

  public void see() {
    System.out.println(String.format("%02d:%02d:%02d", hour, minute, second));
  }
  
}
  
  
  
  
  
  
  /*
  public void addHour(int hour){
    
    if(hour <=0) {
      return;
    }
    this.hour += hour ;
   
  
   System.out.println("시간 : "+hour+":"+minute+":"+second);
    return;
  }
  public void addMinute(int a){
    
    if((a+minute) / 60 >= 1) {
      
      hour += (a+minute)/60;
      minute += a%60;
          
      
    } minute += a;
    
    
 
    System.out.println("시간 : "+hour+":"+minute+":"+second);
    return;
  }
  
  public void addSecond(int a) {
   
      
    if(a/3600>=1) {
        hour += a/3600;
        if(a % 3600>=60);{
          minute += (a%3600)/60;
          second += (a%3600)%60;        }
        second += a%3600;
      } 
    if(a/60>=1) {
      minute += a/60;
      second += a%60;
    } second += a;
    
    
*/
