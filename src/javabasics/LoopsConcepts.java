package javabasics;

public class LoopsConcepts {

    public static void main(String[] args) {

        /* loop means when you are writing the same code repetitively:to print 1 to 10 positive integer numbers. we have to do this;

        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);  */

        // above concept is not a good practise.to avoid these repetitive lines.to avoid this, we have to use the loop concept

        // 1 while loop
        // disadvantage of while loop is, it will generate infinite loop if you don't give incremental or decremental value

        int i = 1;  //initialization
        while (i<=10){  //conditional
            System.out.println(i);
            i=i+1;     // incremental/ decremental
        }
         System.out.println("*******");

          // j++ means j=1 (increase the value of j by 1)

         // for loop:
        // k-- means k=k-1
        //10,9,8,7,6,5,4,3,2,1
        for (int j=1; j<=10;j++) {// Initialization, Conditional, Incremental
         System.out.println(j);

        }
        System.out.println("*******");
          // -1>-10 true
        // 1>10 false
        // print 10 to 1
        // k-- means k= k-1

        for (int k=10; k>=-10;k--){// Initialization, Conditional, decremental
            System.out.println(k);
        }
    }


}










