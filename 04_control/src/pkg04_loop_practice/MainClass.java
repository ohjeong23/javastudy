package pkg04_loop_practice;

public class MainClass {
  
  public static void method1() {
    //100~1 출력하기
    int n = 100 ;
        while(n >= 1) {
          System.out.println(n--);
        
        }
    
    
  }
  
  public static void method2() {
    //5 ~20 사이 모든 정수의 평균내기
    
    int begin =5;
    int end = 20;
    int n =begin ;
    int total = 0;
   
    
        while(n <= end) {
          
       total += n;
       n++;
       
       
        }
    double average = total / (end - begin +1.0);
    System.out.println(average);
  }
  
 public static void method3() {
   
   //3단 출력하기
   int dan =3;
   int i;
   for(i =1;i <= 9; i++) {
     
     System.out.println(dan+"x"+ i +"="+dan*i);
     
   }
   
   
 }
 
public static void method4() {
   
  int money =70;             // 1회 모금액
  int nth = 0;
  int total = 0;            //전체 모금액
  final int GOAL = 100_000; //목표
  //1420회 모금액 100030원
  
  while(total  < GOAL) {
    total += money;
    nth++;
    System.out.println(nth+"회 모금액"+total+"원");
  }
  
  
  
  
  
  
  
  
  //70원씩 모금하기
  //목표는 100000원 이상
  //1회 모금액 70원
  //2회 모금액 140원
  //3회 모금액 210원
  //..........
  // n회 모금액 100000이상
  //십만원이상이면 바로 끝 
  
  int n = 1 ;
  int m = 0;
  if(m <= 100000) {
   
        m += 70*n++;
      

      System.out.printf("%d회 모금액 %d",n,m);
      
    }
      
}
      
      
      
public static void method5() {
  
  //2 x 1 =2
  //2 x 2 =4
  //....
  //9x9= 81
  
   
  for( int i=2;i<10;i++) {
    for(int j=1;j<10;j++) {
      System.out.println(i +"x"+j+"="+i*j);
    }
  }
  
  
}


public static void method6() {
  
  // 2x1=2  3x1=3 ... 9x1=9
  //2x2=4  3x2 =..........
  //2 x3....
  //구구단
  int i;
  int j ;
  for(i=2;i<10;i++) {
    
    for(j=1;j<10;j++) {
      System.out.print(i +"x"+j+"="+i*j) ;
    
  
  }System.out.println("");
  
 
  }}

















  
  
  
  
public static void method7() {
  
    
    int al=0;
    for(int i =1; i <101;i++) {
      
      if(i%3 == 0) {
        al += i;
       
      }
    }System.out.println(al);
    
    
    
    
}
  
  
    
    
  public static void method8() {
    
    for(int i=1;i<10;i++) {
      for(int j=2;j<10;j++) {
        System.out.print(i+"x"+j+"="+ i*j+"\t");
      }System.out.println();
    }
    
    
    
    
    
  }
 public static void method9() {
    
   
  for(int x =1;x<11;x++) {
    for(int y=1;y<11;y++) {
  
      System.out.println();
    }
  }
  }
 public static void method10() {
    
   for(int i=1;i<10;i++) {
     for(int j=2;j<10;j++) {
       System.out.print(i+"x"+j+"="+ i*j+"\t");
       if(j>=5) {
         break;
       }
     }
     if(i>=5) {
       break;
     }
     System.out.println();
   }
   
   
  }
 public static void method11() {
   
   outer://라벨
   for( int i=2;i<10;i++) {
     for(int j=1;j<10;j++) {
       
       
       System.out.println(i +"x"+j+"="+i*j);
       if(i == 5 && j ==5 ) {
         break outer;
       }
       
     }
     
     
     
   }
   
   
 }
   
 public static void method12() {

   /*
    * 삼각별 출력하기-1
    *        star=12345 
    * row=1       * 
    * row=2       ** 
    * row=3       *** 
    * row=4       **** 
    * row=5       *****
    * 
    * row=1, star=1~1 
    * row=2, star=1~2 
    * row=3, star=1~3 
    * row=4, star=1~4 
    * row=5, star=1~5
    */

   for(int i=1;i<6;i++) {
     for(int j=0;j<i;j++) {
       System.out.print("*");
     }System.out.println();
   }
   
   
 }
 
 public static void method13() {
   
   /*
    * 삼각별 출력하기-2
    *        star=12345
    * row=1       *****
    * row=2       ****
    * row=3       ***
    * row=4       **
    * row=5       *
    * 
    * row=1, star=1~5
    * row=2, star=1~4
    * row=3, star=1~3
    * row=4, star=1~2
    * row=5, star=1~1
    */
   
  for(int i =1; i <=5; i++) {
    for(int j=1; j <=6-i;j++) {
      System.out.println("*");
    }System.err.println();}
  }
 
 
 public static void method14() {
   
   /*
    * 삼각별 출력하기-3
    * space/star=123456789
    * row=1          *
    * row=2         ***
    * row=3        *****
    * row=4       *******
    * row=5      *********
    * 
    * row=1, space=1~4, star=5~5
    * row=2, space=1~3, star=4~6
    * row=3, space=1~2, star=3~7
    * row=4, space=1~1, star=2~8
    * row=5, space=1~0, star=1~9
    * 
    * row =1~5,space= 1~5-row,j= 6-i~i+4
    */

   
   for(int i =1;i <=5;i++) {
     for(int space =1;space <=5 -i;space++) {
       System.out.print(" ");
     }for(int j = 6-i ; j <= i +4;j++) {
     System.out.print("*");
   } System.out.println();
    
   }
   
   

 }
 
 public static void method15() {
   
   /*
    * 삼각별 출력하기-4
    * space/star=123456789
    * row=1      *********
    * row=2       *******
    * row=3        *****
    * row=4         ***
    * row=5          *
    * 
    * row=1, space=1~0, star=1~9
    * row=2, space=1~1, star=2~8
    * row=3, space=1~2, star=3~7
    * row=4, space=1~3, star=4~6
    * row=5, space=1~4, star=5~5'
    *
    *
    *row = 1~5 sapce= 1~row-1, star = row~10-row
    */
   for(int row=1 ;row<6;row++) {
     for(int space = 1;space<=row-1;space++) {
       System.out.print(" ");
     
     }
     for(int star = row; star<=10-row;star++) {
       System.out.print("*");
     }System.out.println();
     
   }
   
   
 }  
   
 
 public static void method16() {
   
   
   
 }


  
  public static void main(String[] args) {
   
    method15();
  }

}
