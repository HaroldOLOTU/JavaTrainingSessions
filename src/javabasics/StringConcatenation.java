package javabasics;

public class StringConcatenation {

    public static void main(String[] args) {

        // + is a concatenation operator
        int a = 100;
        int b = 200;

        String x = "hello";
        String y = "World";

        double c = 12.33;
        double d = 10.33;

        System.out.println(a+b);
        System.out.println(x+y);
        System.out.println("Hello World");
        System.out.println("the value of a is:"+a);
        System.out.println("the value of a is:"+b);
        System.out.println("the addition of a and b is:"+(a+b));


         // System.out.print is used to print along a line
         // System .out.println is used to print on a new line
        System.out.print("Hello Selenium");
        System.out.println("Hello World");



        System.out.println(a+b+x+y);
        System.out.println(x+y+a+b);
        System.out.println(x+y+(a+b));

        System.out.println(a+b+x+y+a+x+b+y);
        System.out.println(a+b+x+y+a+b);

        System.out.println(c+d);

        System.out.println(x+y+c+d);
        System.out.println(x+y+(c+d));

    }
}
