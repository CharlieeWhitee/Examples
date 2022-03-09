import java.util.*;
class Array extends Structure{  
  Scanner input = new Scanner(System.in);
  String type, animal;
  public Array(){
  }
        public void run(){
    System.out.print("What type of array would you like to see? ");
    type = input.next();
    System.out.print("What is your favorite animal? ");
    animal = input.next();
    switch(type){
      case "single":
        String[] single = new String[5];
        for(int i = 0; i < single.length; i++){
          single[i] = animal;
        }
        System.out.println("Here's a line of " + animal + "s to hi to you!");
        for(int i = 0; i < single.length; i++){
          System.out.print( (i+1) + animal + " ");
        }
      case "double":
      case "staggered":
    }
}
}

