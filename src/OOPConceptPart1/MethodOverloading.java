package OOPConceptPart1;

public class MethodOverloading {

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.sum();
        obj.sum(10);
        obj.sum(10,15);




    }
    // we can overload main method also
    // you can not create a method inside a method
    //duplicate methods --- i.e same method name with same number of arguments are not allowed
    //
    public static void  main(int p){

    }
    public  static void main(int q,int h){

    }

      // you can not create a method inside a method
      // duplicate methods --- i.e. same method name with same number of arguments are not allowed
     // method overloading --> when the method name is the same with different arguments or input parameters within the same class.
    public void sum(){ // 0 input parameter
        System.out.println("SUM method ---zero parameter");
    }

    public void sum(double d){ // 1 input parameter
        System.out.println("SUM method ---zero parameter");
    }

    public  void  sum(int i ){ // 1 input parameter
        System.out.println("sum method -- i input parameter");
        System.out.println(i);

    }
    public  void sum(int k, int l){ // 2 input parameter
        System.out.println("sum method -- 2 input parameters");
        System.out.println(k+l);
        System.out.println(k-l);

    }
}
