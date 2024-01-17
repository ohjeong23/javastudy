package pkg02_generric_type;

public class Container<T> {
  //생성할때 전달되겠구나
  //private Object item;// 꺼내 사용할때마다 캐스팅해서 원래대로 돌리는 작업을 함 
  
  private T item;

  public T getItem() {
    return item;
  }

  public void setItem(T item) {
    this.item = item;
  }
  

}
