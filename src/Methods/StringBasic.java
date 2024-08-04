package Methods;

public class StringBasic {
    public static void main(String[]args){
        // create simple string and compare where it store in memory hear area sop
        String name = "Ashish";
        String samename ="Ashish";
        String newName = new String (  "Ashish");

        System.out.println(name);
        System.out.println(newName);

        if(name == samename){
            System.out.println("Both are same ");
        }

       // System.out.println("Ashish Shrivastava");
    }
}
