package Methods;

public class LearnMethod2 {
    public static void main(String[]args){
// learn average of two number by function without return value using void
        average(4,6);
        System.out.println("Hello Ashish");
        average(2,7);    // output 4.5 but data int form

    }
    public static void average(int a,int b ){
        int avg = (a+b)/2;
      System.out.println("average of two number:"+avg);
    }
}
