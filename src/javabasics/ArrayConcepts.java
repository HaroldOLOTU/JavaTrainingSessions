package javabasics;

public class ArrayConcepts {

    public static void main(String[] args) {



        //array: array is used to store similar data type values in an array variable

        // duplicate variables are not allowed in java.




        // one dimensional array
        //(1) int array
        //the lowest bound/index = 0
        // upper bound/index = n-1(n is size of array; n here is 4)

        int[] i = new  int[4];// this means (i) will be divided into four parts like below;
        i[0]=10;
        i[1]=20;
        i[2]=30;
        i[3]=40;

        System.out.println(i[2]);
        System.out.println(i[3]);

        //System.out.println(i[4]); //ArrayIndexOutOfBoundsException. if index does not exist, you cannot access it

        System.out.println(i.length); // i.length will give you the size/length of array. (.length) concept you have to use

        //to print all the value of array; we have to use for loop concept.

        for (int k : i) {
            System.out.println(k);
        }
        //(2). double array
        double[] d = new double[3];
        d[0] = 12.33;
        d[1] = 13.44;
        d[2] = 45.55;

        System.out.println(d[2]);

        //(3). character(char) array
        char[] c = new char[3];
        c[0]='q';
        c[1]= 2;
        c[2]= '$';

        //(4).boolean array
        boolean[] b = new boolean[2];
        b[0]=true;
        b[1]=false;

        //(5).String array
        String[] s = new String[3];
        s[0]= "test";
        s[1]= "Hello";
        s[2]= "World";
        System.out.println(s.length);
        System.out.println(s[1]);

        /* Advantages of array
        1. I can store multiple values in a single variable with similar data types.

        Disadvantages of array
        1.size is fixed-- static array. To overcome this problem, we use Collections- ArrayList, HashTable--we
        use dynamic array to overcome this problem
        2.stores only similar data types. To overcome this problem, we use Object array  */


        //(6). Object array. (Object is a super class). it is the most super class available in java.
        // Object is the most super class of all the classes.

         Object[] ob = new Object[6];
         ob[0] = "Tom";
         ob[1] = 25;
         ob[2] = 12.33;
         ob[3] = "1/1/1990";
         ob[4] = 'M';
         ob[5] = "London";

         System.out.println(ob[5]);
        System.out.println(ob[3]);
        System.out.println(ob.length);



    }
}
