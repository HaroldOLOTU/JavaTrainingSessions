package javabasics;

public class IfElseConcepts {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        // this is comparison. we are comparing two variables

        System.out.println("b is greater than a");

        // comparison operators
        // <(less than),>(greater than), <=(less than or equal t0).>=(greater than or equal to ), ==(equal to, equal to),!=(not equal to)
        //(equal to(=) is assigning operator while equal to, equal to is a comparison operator.

        int c = 40;
        int d = 40;

        System.out.println("c and d are equal");


        //write a logic to find out the highest number
            int a1 = 400;
            int b1 = 500;
            int c1= 300;

            // nested if-else
             if (a1>b1 & a1>c1) { //false & true = false
                 System.out.println("a1 is the greatest");
             }
             else if (b1>c1){

                 System.out.println(" b1 is the greatest");
             }
             else {
                 System.out.println("c1 is the greatest");
             }




    }

}
