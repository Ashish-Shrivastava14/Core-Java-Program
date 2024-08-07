package Methods;

public class StringBasic1 {
    public static void main(String[]args){
        // create simple string and compare where it in memory either hear area or String constant pool sop.

        String name = "Ashish";
        String samename ="Ashish";
        String newName = new String (  "Ashish");

        System.out.println(name);
        System.out.println(newName);

        if(name == samename){
            System.out.println("Both are same ");  // equal use for point the scp area
        }
        if(name == newName){
            System.out.println("Both are same ");   // due to new object point so that it point to heap area.
        }
        else
        {
            System.out.println("Both are not same ");
        }



        // System.out.println("Ashish Shrivastava");


    }
}
