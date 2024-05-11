package OOPConceptPart1;

public class FunctionInJava {

    public  static void main(String[] args){
        FunctionInJava obj = new FunctionInJava();

        obj.test();

        int d = obj.sum();
        System.out.println(d);

        String s1 = obj.PQR();
        System.out.println(s1);

        int d2 = obj.div(30, 10);
        System.out.println(d2);

        int d3 = obj.div(50, 5);
        System.out.println(d3);

        //1. can not create a function inside a function
        //2. functions are independent  to each other.
        //3. functions are parallel to each other.

    }
    // 1. no input, no output
    //void ---does not return any value
    public void test(){
        System.out.println("test method");

    }
    public void test(int i){ //1 param
        System.out.println("test method");

    }

    public void test(int i, int j){//2 param
        System.out.println("test method");

    }

    public void test(String a, String b){// 2 param
        System.out.println("test method");

    }
    //Method overloading: when in the same class, functions are having the same name with different parameters.



    //2. no input but some output:
    //return type: int
    public int sum(){
        System.out.println("SUM method");
        int a =10;
        int b = 20;
        int c = a+b;
        return c;
    }

    public String PQR(){
        System.out.println("PQR method");
        String s = "selenium";
        return s;



    }

    //3 some input and some output
    public int div(int x, int y){
        System.out.println("DIV method");
        int z = x/y;
        return z;
    }

    public String sendMail(int p,String q){
        System.out.println("send mail method");
        String h = q+p;
        return h;
    }

}
