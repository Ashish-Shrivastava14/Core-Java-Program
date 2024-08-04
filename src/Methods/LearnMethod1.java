package Methods;

public class LearnMethod1 {

    public static void main(String[]args){

      System.out.println(1);
      System.out.println(2);
      greet();                          // understanding method concept
      System.out.println("Hello Ashish");   // print 1 2 call greet function using method 3 4 hello ashish 5
      System.out.println(5);
    }
    static void greet(){
        System.out.println("using method");
        System.out.println(3);
        System.out.println(4);
    }
}
