public class NestedForLoopDemo {
    public static void main(String[]args){

        for ( int i = 1; i <= 5; i++) {

            for ( int j = 1; j <= i; j++) {     // inner loop run first when condition false than
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
