package Methods;

public class LearnMethod3 {
    public static void main(String[] args) {
// learn average of two number by function with return value using datatype int at method create
       int averageFromFunction = average(4, 6);

        System.out.println("Hello Ashish");
        System.out.println(averageFromFunction); // return type value

    }

    public static int average(int a, int b) {
        int avg = (a + b) / 2;
        return avg;
    }
}
