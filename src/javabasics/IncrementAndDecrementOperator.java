package javabasics;

public class IncrementAndDecrementOperator {

    public static void main(String[] args) {
        //++ = increment
        //-- = decrement

        int i=1;
        int j= i++;  // post increment
        System.out.println(i);
        System.out.println(j);

        int a=1;
        int b=++a;  //pre increment
        System.out.println(a);
        System.out.println(b);

        int m = 2;
        int n = m--;  // post increment
        System.out.println(m);
        System.out.println(n);

        int p = 2;
        int q= --p; // pre increment
        System.out.println(p); //1
        System.out.println(q); //1
    }


}
