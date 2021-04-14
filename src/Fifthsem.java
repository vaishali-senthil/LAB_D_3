import java.util.Scanner;

public class Fifthsem {
    public static void main(String ar[]){
        System.out.println("sample programs");
        System.out.println("i am vaishali 18MIS0082");
      Fall fl =new Fall();
      int i,n;
      Scanner scn = new Scanner(System.in);
      System.out.println("enter the number of subjects");
      n = scn.nextInt();

      for(i=0;i<n;i++) {
          fl.get();
          fl.get1();
      }
    }
}

class Fall {
    String get() {

        String sub;
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the subject:");
        sub = scn.next();

        System.out.println(sub);

        return sub;
    }
    float get1(){
        float marks;
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the marks:");
        marks = scn.nextFloat();

        System.out.println(marks);

        return marks;
    }
}