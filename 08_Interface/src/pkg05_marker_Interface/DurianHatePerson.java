package pkg05_marker_Interface;

public class DurianHatePerson {

  public void eat(Eatable eatable) {
    ((Food) eatable).eat();
  }
  
}