package OOPConceptPart1;

public class LocalAndGlobalVariables {

    // Global variables  -- class variable is a global variable
    // the scope of global variable you can use throughout your program but there is a rule,
    // if you want to access name and age,you have to create an object

    String name = "Tom";
    int age = 25;

    public static void main(String[] args) {

        int i = 10 ; // local variable for main method and you can not use int i,
        // in sum method likewise sum method, you cannot use in main method

        System.out.println(i);

        LocalAndGlobalVariables object = new LocalAndGlobalVariables();
        System.out.println(object.name);
        System.out.println(object.age);

    }
    public  void sum(){

        int i =15; // local variable for sum method
        int j =20;
    }
}
