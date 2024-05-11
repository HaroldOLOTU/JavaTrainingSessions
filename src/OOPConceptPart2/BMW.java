package OOPConceptPart2;

public class BMW extends Car{// "has-a relationship

  // when some methods are present in parent class as well as in child class with the same name and the same number of
    //arguments is called method overriding.
    public void start(){  //Overridden method

        System.out.println("BMW_____start");
    }

    public  void stop(){

        System.out.println("BMW.......stop");

    }

    public  void theftsafety(){
        System.out.println("BMW_____theftsafety");


    }
}
