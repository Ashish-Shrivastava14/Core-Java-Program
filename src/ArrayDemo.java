public class ArrayDemo {
    public static void main(String[]args){

        int[] arr = new int[5];

        for (int x : arr) {
            System.out.println(x);     // not assign value so output is zero
        }
    }
}
